package com.enrollment.EmassWebService;

import com.enrollment.EmassWebService.dto.*;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Service
public class RecordPreparation {

    public PersonalDetails personalDetails;
    public ReadBaseDetails ReadBaseDetails;

    public ReadAuthrep readAuthrep;

    public ReadELigDetails readELigDetails;

    public ReadLockDetails readLockDetails;
    public static Map<String, Map<String, String>> records = new HashMap<String, Map<String, String>>();

    public RecordPreparation(PersonalDetails personalDetails, ReadBaseDetails ReadBaseDetails, ReadAuthrep readAuthrep, ReadELigDetails readELigDetails, ReadLockDetails readLockDetails) {
        this.personalDetails = personalDetails;
        this.ReadBaseDetails = ReadBaseDetails;
        this.readAuthrep = readAuthrep;
        this.readELigDetails = readELigDetails;
        this.readLockDetails = readLockDetails;
    }


    public void HashMapFromTextFile() {
        Map<String, String> map;
        BufferedReader br = null;
        try {
            File file = ResourceUtils.getFile("classpath:eligxmit_data.txt");
            br = new BufferedReader(new FileReader(file));
            String line = null;
            line = br.readLine();
            while (!"".equals(line) && line != null) {
                map = records.get(line.substring(3, 11)) == null ? new HashMap<String, String>() : records.get(line.substring(3, 11));
                if (line != null && !line.trim().isEmpty()) {
                    Map<String, String> map2 = processLine(line);
                    Iterator iterator = map2.keySet().iterator();
                    while (iterator.hasNext()) {
                        String key = (String) iterator.next();
                        map.put(key, map2.get(key));
                    }
                    records.put(line.substring(3, 11), map);
                }
                line = br.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (Exception e) {
                }
            }
        }

    }

    private Map<String, String> processLine(@NonNull String s) {
        if (s != null) {
            Map<String, String> map = new HashMap<>();
            String c = s.substring(0,2);
            switch (c) {
                case "DR":
                    map = personalDetails.getDetails(s);
                    break;
                case "BR":
                    map = ReadBaseDetails.getDetails(s);
                    break;
                case "RR":
                    map = readAuthrep.getDetails(s);
                    break;
                case "ER":
                    map = readELigDetails.getDetails(s);
                    break;
                case "LR":
                    map = readLockDetails.getDetails(s);
                    break;
            }
            return map;
        }
        return new HashMap<>();
    }


}






