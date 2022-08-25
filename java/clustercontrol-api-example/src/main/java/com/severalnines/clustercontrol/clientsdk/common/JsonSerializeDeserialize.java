package com.severalnines.clustercontrol.clientsdk.common;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;

public final class JsonSerializeDeserialize {
    static private ObjectMapper m_oM = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);;

    static public <T> T jsonToObject(String jsonStr, Class<T> valueType) throws JsonProcessingException {
        return (m_oM.readValue(jsonStr, valueType));
    }

    static public String objectToJson(Object valueType) throws JsonProcessingException {
        return (m_oM.writeValueAsString(valueType));
    }
}
