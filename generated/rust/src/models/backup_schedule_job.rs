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
pub struct BackupScheduleJob {
    #[serde(rename = "command", skip_serializing_if = "Option::is_none")]
    pub command: Option<Command>,
    #[serde(rename = "job_data", skip_serializing_if = "Option::is_none")]
    pub job_data: Option<Box<crate::models::BackupScheduleJobJobData>>,
}

impl BackupScheduleJob {
    pub fn new() -> BackupScheduleJob {
        BackupScheduleJob {
            command: None,
            job_data: None,
        }
    }
}

/// 
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum Command {
    #[serde(rename = "backup")]
    Backup,
}

impl Default for Command {
    fn default() -> Command {
        Self::Backup
    }
}
