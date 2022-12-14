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
pub struct JobsJobJobSpecJobDataConfigServers {
    #[serde(rename = "rs", skip_serializing_if = "Option::is_none")]
    pub rs: Option<String>,
    #[serde(rename = "members", skip_serializing_if = "Option::is_none")]
    pub members: Option<Vec<crate::models::JobsJobJobSpecJobDataConfigServersMembers>>,
}

impl JobsJobJobSpecJobDataConfigServers {
    pub fn new() -> JobsJobJobSpecJobDataConfigServers {
        JobsJobJobSpecJobDataConfigServers {
            rs: None,
            members: None,
        }
    }
}


