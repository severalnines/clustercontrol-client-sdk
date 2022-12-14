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
pub struct StatPrometheus {
    #[serde(rename = "operation")]
    pub operation: Operation,
    #[serde(rename = "cluster_id", skip_serializing_if = "Option::is_none")]
    pub cluster_id: Option<i32>,
    #[serde(rename = "cluster_name", skip_serializing_if = "Option::is_none")]
    pub cluster_name: Option<String>,
    #[serde(rename = "queries", skip_serializing_if = "Option::is_none")]
    pub queries: Option<Vec<crate::models::StatPrometheusQueries>>,
    /// Seconds since 1970. e.g. 1622105617
    #[serde(rename = "start", skip_serializing_if = "Option::is_none")]
    pub start: Option<i32>,
    /// Seconds since 1970. e.g. 1622108317
    #[serde(rename = "end", skip_serializing_if = "Option::is_none")]
    pub end: Option<i32>,
    #[serde(rename = "step", skip_serializing_if = "Option::is_none")]
    pub step: Option<i32>,
    #[serde(rename = "returnfrom", skip_serializing_if = "Option::is_none")]
    pub returnfrom: Option<i32>,
}

impl StatPrometheus {
    pub fn new(operation: Operation) -> StatPrometheus {
        StatPrometheus {
            operation,
            cluster_id: None,
            cluster_name: None,
            queries: None,
            start: None,
            end: None,
            step: None,
            returnfrom: None,
        }
    }
}

/// 
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum Operation {
    #[serde(rename = "/prometheus")]
    Prometheus,
}

impl Default for Operation {
    fn default() -> Operation {
        Self::Prometheus
    }
}

