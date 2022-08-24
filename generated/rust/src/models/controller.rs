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
pub struct Controller {
    #[serde(rename = "operation")]
    pub operation: Operation,
    #[serde(rename = "client_ip_address", skip_serializing_if = "Option::is_none")]
    pub client_ip_address: Option<String>,
    #[serde(rename = "controller_key", skip_serializing_if = "Option::is_none")]
    pub controller_key: Option<String>,
}

impl Controller {
    pub fn new(operation: Operation) -> Controller {
        Controller {
            operation,
            client_ip_address: None,
            controller_key: None,
        }
    }
}

/// 
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum Operation {
    #[serde(rename = "ping")]
    Ping,
    #[serde(rename = "heartBeat")]
    HeartBeat,
}

impl Default for Operation {
    fn default() -> Operation {
        Self::Ping
    }
}
