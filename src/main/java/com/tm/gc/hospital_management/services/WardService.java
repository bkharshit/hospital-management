package com.tm.gc.hospital_management.services;

import com.tm.gc.hospital_management.models.Patient;
import com.tm.gc.hospital_management.models.Severity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class WardService {
    static Map<Integer, Patient> patientMap = new HashMap<>();

    @Autowired
    WardManager wardManager;

    static {
        Patient p1 = new Patient(1,"a", Severity.HIGH);
        Patient p2 = new Patient(2,"b", Severity.MEDIUM);
        patientMap.put(p1.getId(),p1);
        patientMap.put(p2.getId(),p2);
    }

    public int assignWard(int id) {
        Patient patient = patientMap.get(id);
        wardManager.setWards();
        return wardManager.assignWards(patient);
    }
}
