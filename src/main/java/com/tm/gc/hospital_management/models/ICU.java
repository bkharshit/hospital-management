package com.tm.gc.hospital_management.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ICU extends Ward{
    Severity s;

    public ICU(){
        s = Severity.HIGH;
    }
}
