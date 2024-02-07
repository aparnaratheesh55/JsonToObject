package com.example.JsonToObject;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.Map;

@Service
public class JsonToObjectService {


    public static String readJSON(String key, String innerKey) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File("/home/aparnaratheesh/Documents/Details_JSON.txt");
        Map<String, Object> jsonData = objectMapper.readValue(file, Map.class);
        Map<String, Object> innerData = (Map<String, Object>) jsonData.get(key);
        if (innerData.containsKey(innerKey)) {
            return innerData.get(innerKey).toString();
        } else {
            return " key not found";
        }
    }

}
