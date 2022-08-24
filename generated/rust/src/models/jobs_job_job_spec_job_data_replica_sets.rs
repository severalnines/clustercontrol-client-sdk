/*
 * Severalnines ClusterControl
 *
 * This is a ...
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: sales@severalnines.com
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Default, Serialize, Deserialize)]
pub struct JobsJobJobSpecJobDataReplicaSets {
    #[serde(rename = "rs", skip_serializing_if = "Option::is_none")]
    pub rs: Option<String>,
    #[serde(rename = "members", skip_serializing_if = "Option::is_none")]
    pub members: Option<Vec<crate::models::JobsJobJobSpecJobDataMembers>>,
}

impl JobsJobJobSpecJobDataReplicaSets {
    pub fn new() -> JobsJobJobSpecJobDataReplicaSets {
        JobsJobJobSpecJobDataReplicaSets {
            rs: None,
            members: None,
        }
    }
}

