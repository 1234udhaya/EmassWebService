package com.enrollment.EmassWebService.dto;

import groovy.transform.builder.Builder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
@EnableConfigurationProperties
public class ReadLockDetails extends BaseDetails{
    @Value("${LockDetails.startDate}")
    public int[] startDate;
    @Value("${LockDetails.endDate}")
    public int[] endDate;

    public Map<String, String> getDetails(String content) {
        Map<String, String> map = new HashMap<>();
        map.put("hccIdentifier", content.substring(base_id[0], base_id[1]));
        map.put("complianceProgramDateRanges/startDate", content.substring(startDate[0], startDate[1]));
        map.put("complianceProgramDateRanges/endDate", content.substring(endDate[0], endDate[1]));
        if (content.substring(endDate[0], endDate[1]).trim().equals("0")){
            map.replace("complianceProgramDateRanges/endDate","3000-01-01");
        }
        return map;
    }
}