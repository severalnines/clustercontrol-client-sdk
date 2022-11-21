/*
 *     Copyright 2022 Severalnines Inc. @ https://severalnines.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *          http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.severalnines.clustercontrol.api.abstraction.common;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;

public final class JsonSerializeDeserialize {
    static private ObjectMapper m_oM = new ObjectMapper().configure(
            DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

    static public void SetSnakeNaming() {
        m_oM.setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE);
    }

    static public <T> T jsonToObject(String jsonStr, Class<T> valueType) throws JsonProcessingException {
        return (m_oM.readValue(jsonStr, valueType));
    }

    static public String objectToJson(Object valueType) throws JsonProcessingException {
        return (m_oM.writeValueAsString(valueType));
    }
}
