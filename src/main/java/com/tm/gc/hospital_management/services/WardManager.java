package com.tm.gc.hospital_management.services;

import com.tm.gc.hospital_management.WardsNotFreeException;
import com.tm.gc.hospital_management.models.ICU;
import com.tm.gc.hospital_management.models.Patient;
import com.tm.gc.hospital_management.models.Severity;
import com.tm.gc.hospital_management.models.Ward;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Optional;

@Service
public class WardManager {
    Ward[] wards = new Ward[10];

    public void setWards() {
        Ward w1 = new ICU(Severity.HIGH);
        w1.setId(1);
        w1.setEmpty(true);
        Ward w2 = new ICU(Severity.MEDIUM);
        w1.setId(2);
        w1.setEmpty(true);
        this.wards[0] = w1;
        this.wards[1] = w2;
    }


    public int assignWards(Patient p) throws WardsNotFreeException{
        Optional<Ward> ward = getNextFreeWard(p.getSeverity());
        if(ward.isPresent()){
            return ward.get().getId();
        } else throw new WardsNotFreeException("No wards available for the severity");
    }

    private Optional<Ward> getNextFreeWard(Severity s){
        return Arrays.stream(wards).filter(ward -> (ward!=null && ward.isEmpty() && ward.getSeverity().equals(s))).findFirst();

    }



}
