package com.example.JsonToObject;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Map;

@RestController
@RequestMapping()
public class JsonToObjectController {

    @Autowired
    JsonToObjectService jsonToObjectService;


    @GetMapping("/find/{key}/{innerKey}")
    public String readtoJSON(@PathVariable String key, @PathVariable String innerKey) throws IOException {
        return JsonToObjectService.readJSON(key, innerKey);
    }

}
