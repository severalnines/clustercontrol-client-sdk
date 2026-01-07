import time
import client
import openapi_cc_client
from openapi_cc_client import Jobs
from dataclasses import dataclass
from pydantic import BaseModel

@dataclass
class ResponseJobDetails(BaseModel):
    job_id: int
    status: str
    status_text: str

@dataclass
class JobResponse(BaseModel):
    controller_id: str
    request_status: str
    job: ResponseJobDetails


def send_and_wait_for_job_completion(jobs: Jobs):
    with openapi_cc_client.ApiClient(client.configuration) as api_client:
        api_instance = openapi_cc_client.JobsApi(api_client)
        try:
            resp = api_instance.jobs_post_with_http_info(jobs)
            print(resp.raw_data.decode('utf8'))
            job_response = JobResponse.model_validate_json(resp.raw_data)
            print(f"Controller ID: {job_response.controller_id}")
            print(f"Request status: {job_response.request_status}")
            print(f"Job ID is: {job_response.job.job_id}")
            print(f"Job status: {job_response.job.status}")

            while True:
                time.sleep(10)
                status_job = Jobs(
                    operation='getJobInstance',
                    job_id=job_response.job.job_id,
                )
                try:
                    job_status_check_resp = api_instance.jobs_post_with_http_info(status_job)
                    print(job_status_check_resp.raw_data.decode('utf8'))
                    job_status_response = JobResponse.model_validate_json(job_status_check_resp.raw_data)
                    print(f"Controller ID: {job_status_response.controller_id}")
                    print(f"Request status: {job_status_response.request_status}")
                    print(f"Job ID is: {job_status_response.job.job_id}")
                    print(f"Job status: {job_status_response.job.status}")
                    if (job_status_response.job.status == "FINISHED"):
                        print(f"Job completed successfully")
                        break

                    if ("RUNNING" not in job_status_response.job.status and
                            "DEFINED" not in job_status_response.job.status):
                        print(f"Job FAILED")
                        break

                except Exception as e2:
                    print(f"Status check: {e2}")



        except Exception as e:
            print(f"General exception: {e}")


