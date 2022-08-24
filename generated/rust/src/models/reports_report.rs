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
pub struct ReportsReport {
    #[serde(rename = "class_name", skip_serializing_if = "Option::is_none")]
    pub class_name: Option<ClassName>,
    /// Email of recipient
    #[serde(rename = "recipients", skip_serializing_if = "Option::is_none")]
    pub recipients: Option<String>,
    /// TODO
    #[serde(rename = "report_type", skip_serializing_if = "Option::is_none")]
    pub report_type: Option<String>,
    #[serde(rename = "text_format", skip_serializing_if = "Option::is_none")]
    pub text_format: Option<TextFormat>,
    #[serde(rename = "report_id", skip_serializing_if = "Option::is_none")]
    pub report_id: Option<i32>,
}

impl ReportsReport {
    pub fn new() -> ReportsReport {
        ReportsReport {
            class_name: None,
            recipients: None,
            report_type: None,
            text_format: None,
            report_id: None,
        }
    }
}

/// 
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum ClassName {
    #[serde(rename = "CmonReport")]
    CmonReport,
}

impl Default for ClassName {
    fn default() -> ClassName {
        Self::CmonReport
    }
}
/// 
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum TextFormat {
    #[serde(rename = "AnsiTerminal")]
    AnsiTerminal,
}

impl Default for TextFormat {
    fn default() -> TextFormat {
        Self::AnsiTerminal
    }
}
