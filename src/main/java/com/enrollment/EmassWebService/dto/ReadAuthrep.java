package com.enrollment.EmassWebService.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Component
@EnableConfigurationProperties
public class ReadAuthrep extends BaseDetails{
    @Value("${authrep.lastName}")
    public int[] lastName;

    @Value("${authrep.firstName}")
    public int[] firstName;

    @Value("${authrep.middleName}")
    public int[] middleName;



    public Map<String, String> getDetails(String content) {
        Map<String, String> map = new HashMap<>();
        map.put("hccIdentifier", content.substring(base_id[0], base_id[1]));
        map.put("responsiblePersonName/firstName", content.substring(base_id[1], content.trim().length()-1).split(",")[1].trim());
        map.put("responsiblePersonName/lastName", content.substring(base_id[1], content.trim().length()-1).split(",")[0].trim());
        map.put("responsiblePersonName/middleName", content.substring(content.trim().length()-1).trim());
        return map;
    }
}
