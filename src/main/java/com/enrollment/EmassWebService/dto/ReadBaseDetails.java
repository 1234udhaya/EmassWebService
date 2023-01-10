package com.enrollment.EmassWebService.dto;

import groovy.transform.builder.Builder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@EnableConfigurationProperties
public class ReadBaseDetails extends BaseDetails{
    @Value("${base.address}")
    public int[] address;

    @Value("${base.address2}")
    public int[] address2;

    @Value("${base.zip}")
    public int[] zip;

    @Value("${base.State}")
    public int[] State;

    @Value("${base.CITY}")
    public int[] CITY;

    public Map<String, String> getDetails(String content) {
        Map<String, String> map = new HashMap<>();
        map.put("hccIdentifier", content.substring(base_id[0], base_id[1]));
        map.put("address", content.substring(address[0], address[1]).trim());
        map.put("address2", content.substring(address2[0], address2[1]).trim());
        map.put("zip", content.substring(zip[0], zip[1]));
        map.put("State", content.substring(State[0], State[1]).trim());
        map.put("CITY", content.substring(CITY[0], CITY[1]).trim());
        // map.put("taxIdentificationNumber", ssn.trim());
        //map.put("raceOrEthnicityCodes/codeEntry", content.substring(code[0], code[1]));
        // map.put("genderCode", getGender(content));
        return map;
    }
}
