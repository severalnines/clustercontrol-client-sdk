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
pub struct JobsJobJobSpecJobDataTopology {
    #[serde(rename = "master_slave_links", skip_serializing_if = "Option::is_none")]
    pub master_slave_links: Option<Vec<::std::collections::HashMap<String, String>>>,
}

impl JobsJobJobSpecJobDataTopology {
    pub fn new() -> JobsJobJobSpecJobDataTopology {
        JobsJobJobSpecJobDataTopology {
            master_slave_links: None,
        }
    }
}


