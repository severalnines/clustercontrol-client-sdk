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
pub struct ClustersDatabase {
    #[serde(rename = "class_name", skip_serializing_if = "Option::is_none")]
    pub class_name: Option<ClassName>,
    #[serde(rename = "database_name", skip_serializing_if = "Option::is_none")]
    pub database_name: Option<String>,
}

impl ClustersDatabase {
    pub fn new() -> ClustersDatabase {
        ClustersDatabase {
            class_name: None,
            database_name: None,
        }
    }
}

/// 
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum ClassName {
    #[serde(rename = "CmonDataBase")]
    CmonDataBase,
}

impl Default for ClassName {
    fn default() -> ClassName {
        Self::CmonDataBase
    }
}

