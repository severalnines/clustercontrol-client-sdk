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
pub struct JobsJobJobSpecJobDataNodes {
    #[serde(rename = "class_name", skip_serializing_if = "Option::is_none")]
    pub class_name: Option<ClassName>,
    #[serde(rename = "cdt_path", skip_serializing_if = "Option::is_none")]
    pub cdt_path: Option<String>,
    #[serde(rename = "acl", skip_serializing_if = "Option::is_none")]
    pub acl: Option<String>,
    #[serde(rename = "clusterid", skip_serializing_if = "Option::is_none")]
    pub clusterid: Option<i32>,
    #[serde(rename = "ip", skip_serializing_if = "Option::is_none")]
    pub ip: Option<String>,
    #[serde(rename = "maintenance_mode", skip_serializing_if = "Option::is_none")]
    pub maintenance_mode: Option<MaintenanceMode>,
    #[serde(rename = "maintenance_mode_active", skip_serializing_if = "Option::is_none")]
    pub maintenance_mode_active: Option<bool>,
    #[serde(rename = "timestamp", skip_serializing_if = "Option::is_none")]
    pub timestamp: Option<i32>,
    #[serde(rename = "unique_id", skip_serializing_if = "Option::is_none")]
    pub unique_id: Option<i32>,
    #[serde(rename = "hostname", skip_serializing_if = "Option::is_none")]
    pub hostname: Option<String>,
    #[serde(rename = "hostname_data", skip_serializing_if = "Option::is_none")]
    pub hostname_data: Option<String>,
    #[serde(rename = "hostname_internal", skip_serializing_if = "Option::is_none")]
    pub hostname_internal: Option<String>,
    #[serde(rename = "port", skip_serializing_if = "Option::is_none")]
    pub port: Option<String>,
    #[serde(rename = "nodetype", skip_serializing_if = "Option::is_none")]
    pub nodetype: Option<String>,
    #[serde(rename = "configfile", skip_serializing_if = "Option::is_none")]
    pub configfile: Option<String>,
    #[serde(rename = "datadir", skip_serializing_if = "Option::is_none")]
    pub datadir: Option<String>,
    #[serde(rename = "backup_dir", skip_serializing_if = "Option::is_none")]
    pub backup_dir: Option<String>,
}

impl JobsJobJobSpecJobDataNodes {
    pub fn new() -> JobsJobJobSpecJobDataNodes {
        JobsJobJobSpecJobDataNodes {
            class_name: None,
            cdt_path: None,
            acl: None,
            clusterid: None,
            ip: None,
            maintenance_mode: None,
            maintenance_mode_active: None,
            timestamp: None,
            unique_id: None,
            hostname: None,
            hostname_data: None,
            hostname_internal: None,
            port: None,
            nodetype: None,
            configfile: None,
            datadir: None,
            backup_dir: None,
        }
    }
}

/// 
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum ClassName {
    #[serde(rename = "CmonRedisHost")]
    CmonRedisHost,
    #[serde(rename = "CmonRedisSentinelHost")]
    CmonRedisSentinelHost,
    #[serde(rename = "CmonHost")]
    CmonHost,
    #[serde(rename = "CmonPBMAgentHost")]
    CmonPBMAgentHost,
    #[serde(rename = "CmonPgBouncerHost")]
    CmonPgBouncerHost,
}

impl Default for ClassName {
    fn default() -> ClassName {
        Self::CmonRedisHost
    }
}
/// 
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum MaintenanceMode {
    #[serde(rename = "none")]
    None,
}

impl Default for MaintenanceMode {
    fn default() -> MaintenanceMode {
        Self::None
    }
}

