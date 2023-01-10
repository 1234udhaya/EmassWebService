package com.enrollment.EmassWebService.dto;

import groovy.transform.builder.Builder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@EnableConfigurationProperties
public class ReadELigDetails extends BaseDetails{
    @Value("${ELigDetails.meCode}")
    public int[] meCode;

    @Value("${ELigDetails.startDate}")
    public int[] startDate;

    @Value("${ELigDetails.endDate}")
    public int[] endDate;

    public Map<String, String> getDetails(String content) {
        Map<String, String> map = new HashMap<>();
        map.put("hccIdentifier", content.substring(base_id[0], base_id[1]));
        map.put("attrValueAsString", "ME Code " + content.substring(meCode[0], meCode[1]));
        map.put("planSelection/startDate", content.substring(startDate[0], startDate[1]).trim());
        map.put("planSelection/endDate", content.substring(endDate[0], endDate[1]).trim());
        if (content.substring(endDate[0], endDate[1]).trim().equals("9999999999")){
            map.replace("planSelection/endDate","3000-01-01");
        }


        return map;
    }

}