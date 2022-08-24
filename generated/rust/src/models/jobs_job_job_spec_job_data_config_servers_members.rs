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
pub struct JobsJobJobSpecJobDataConfigServersMembers {
    #[serde(rename = "hostname", skip_serializing_if = "Option::is_none")]
    pub hostname: Option<String>,
    #[serde(rename = "hostname_data", skip_serializing_if = "Option::is_none")]
    pub hostname_data: Option<String>,
    #[serde(rename = "hostname_internal", skip_serializing_if = "Option::is_none")]
    pub hostname_internal: Option<String>,
    #[serde(rename = "port", skip_serializing_if = "Option::is_none")]
    pub port: Option<String>,
}

impl JobsJobJobSpecJobDataConfigServersMembers {
    pub fn new() -> JobsJobJobSpecJobDataConfigServersMembers {
        JobsJobJobSpecJobDataConfigServersMembers {
            hostname: None,
            hostname_data: None,
            hostname_internal: None,
            port: None,
        }
    }
}

