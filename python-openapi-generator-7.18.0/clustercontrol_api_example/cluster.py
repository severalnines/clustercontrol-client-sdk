import client
import openapi_cc_client
from clustercontrol_api_example.job import send_and_wait_for_job_completion
from openapi_cc_client.models.jobs import Jobs
from openapi_cc_client.models.jobs_job import JobsJob
from openapi_cc_client.models.jobs_job_job_spec import JobsJobJobSpec
from openapi_cc_client.models.jobs_job_job_spec_job_data import JobsJobJobSpecJobData
from openapi_cc_client.models.jobs_job_job_spec_job_data_nodes_inner import JobsJobJobSpecJobDataNodesInner

def create_cluster():
    with openapi_cc_client.ApiClient(client.configuration) as api_client:
        # api_instance = openapi_cc_client.JobsApi(api_client)
        jobs = Jobs(
            operation='createJobInstance',
        )

        job = JobsJob(
            class_name="CmonJobInstance",
        )

        jobSpec = JobsJobJobSpec(
            command="create_cluster",
        )
        jobSpecData = JobsJobJobSpecJobData(
            cluster_name="test-cluster",
            cluster_type="postgresql_single",
            db_user="pgadmin",
            db_password="vJFmRxw0LrI4n0rcpcdp5KfX",
            ssh_keyfile="/home/ubuntu/.ssh/id_rsa",
            ssh_user="ubuntu",
            ssh_port="22",
            version="18",
            enable_ssl=True,
            type="postgresql",
            vendor="default",
            disable_selinux=True,
            disable_firewall=True,
            install_software=True,
            use_internal_repos=False,
            port=5432,
        )
        node = JobsJobJobSpecJobDataNodesInner(
            hostname="10.0.0.189",
            port="5432",
            hostname_data="10.0.0.189",
            hostname_internal="",
            synchronous=False,
            datadir="",
        )
        jobSpecData.nodes = [node]
        jobSpec.job_data = jobSpecData
        job.job_spec = jobSpec
        jobs.job = job

        try:
            # CreateJobInstance | etc
            # resp = api_instance.jobs_post_with_http_info(jobs)
            # print(resp.raw_data.decode('utf8'))
            send_and_wait_for_job_completion(jobs)
        except Exception as e:
            print("Exception when calling JobsApi->jobs_post: %s\n" % e)

