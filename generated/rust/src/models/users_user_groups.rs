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
pub struct UsersUserGroups {
    #[serde(rename = "class_name", skip_serializing_if = "Option::is_none")]
    pub class_name: Option<String>,
    #[serde(rename = "group_name", skip_serializing_if = "Option::is_none")]
    pub group_name: Option<String>,
}

impl UsersUserGroups {
    pub fn new() -> UsersUserGroups {
        UsersUserGroups {
            class_name: None,
            group_name: None,
        }
    }
}

