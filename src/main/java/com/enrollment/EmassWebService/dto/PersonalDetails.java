package com.enrollment.EmassWebService.dto;

import groovy.transform.builder.Builder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@EnableConfigurationProperties
public class PersonalDetails extends BaseDetails{
    @Value("${personal.first_name}")
    public int[] firstName;

    @Value("${personal.last_name}")
    public int[] lastName;

    @Value("${personal.middle_name}")
    public int[] middleName;

    @Value("${personal.dob}")
    public int[] dob;

    @Value("${personal.code}")
    public int[] code;

    @Value("${personal.SSN}")
    public int[] SSN;

    public Map<String, String> getDetails(String content) {
        Map<String, String> map = new HashMap<>();
        map.put("hccIdentifier", content.substring(base_id[0], base_id[1]));
        map.put("primaryName/firstName", content.substring(firstName[0], firstName[1]).trim());
        map.put("primaryName/lastName", content.substring(lastName[0], lastName[1]).trim());
        map.put("primaryName/middleName", content.substring(middleName[0], middleName[1]).trim());
        map.put("birthDate", content.substring(dob[0], dob[1]));
       // map.put("taxIdentificationNumber", content.substring(SSN[0], SSN[1]));
        String x = content.substring(SSN[0], SSN[1]).trim();
        String y=  new StringBuilder(x).insert(3,  '-').insert(6,  '-').toString();
        map.put("individual/taxIdentificationNumber", y);
        map.put("raceOrEthnicityCodes/codeEntry", content.substring(code[0], code[1]));
        if (content.substring(code[0], code[1]).trim().equals("U")){
            map.replace("raceOrEthnicityCodes/codeEntry","7");
        }
        map.put("genderCode", getGender(content));
        return map;
    }
}
