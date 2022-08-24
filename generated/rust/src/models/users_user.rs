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
pub struct UsersUser {
    #[serde(rename = "class_name", skip_serializing_if = "Option::is_none")]
    pub class_name: Option<ClassName>,
    #[serde(rename = "user_name", skip_serializing_if = "Option::is_none")]
    pub user_name: Option<String>,
    #[serde(rename = "email_address", skip_serializing_if = "Option::is_none")]
    pub email_address: Option<String>,
    #[serde(rename = "new_password", skip_serializing_if = "Option::is_none")]
    pub new_password: Option<String>,
    #[serde(rename = "old_password", skip_serializing_if = "Option::is_none")]
    pub old_password: Option<String>,
    #[serde(rename = "groups", skip_serializing_if = "Option::is_none")]
    pub groups: Option<Vec<crate::models::UsersUserGroups>>,
    #[serde(rename = "public_keys", skip_serializing_if = "Option::is_none")]
    pub public_keys: Option<Vec<crate::models::UsersUserPublicKeys>>,
    #[serde(rename = "public_key", skip_serializing_if = "Option::is_none")]
    pub public_key: Option<Vec<crate::models::UsersUserPublicKeys>>,
}

impl UsersUser {
    pub fn new() -> UsersUser {
        UsersUser {
            class_name: None,
            user_name: None,
            email_address: None,
            new_password: None,
            old_password: None,
            groups: None,
            public_keys: None,
            public_key: None,
        }
    }
}

/// 
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum ClassName {
    #[serde(rename = "CmonUser")]
    CmonUser,
}

impl Default for ClassName {
    fn default() -> ClassName {
        Self::CmonUser
    }
}

