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
pub struct DiscoveryNodes {
    #[serde(rename = "class_name", skip_serializing_if = "Option::is_none")]
    pub class_name: Option<ClassName>,
    /// IP address or Hostname
    #[serde(rename = "host_name", skip_serializing_if = "Option::is_none")]
    pub host_name: Option<String>,
    #[serde(rename = "port", skip_serializing_if = "Option::is_none")]
    pub port: Option<i32>,
}

impl DiscoveryNodes {
    pub fn new() -> DiscoveryNodes {
        DiscoveryNodes {
            class_name: None,
            host_name: None,
            port: None,
        }
    }
}

/// 
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum ClassName {
    #[serde(rename = "CmonHost")]
    CmonHost,
    #[serde(rename = "CmonMySqlHost")]
    CmonMySqlHost,
    #[serde(rename = "CmonPostgreSqlHost")]
    CmonPostgreSqlHost,
    #[serde(rename = "CmonProxySqlHost")]
    CmonProxySqlHost,
    #[serde(rename = "CmonHaProxyHost")]
    CmonHaProxyHost,
}

impl Default for ClassName {
    fn default() -> ClassName {
        Self::CmonHost
    }
}

