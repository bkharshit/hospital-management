package com.tm.gc.hospital_management.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class General extends Ward{
    Severity s;

    public General(){
        s = Severity.MEDIUM;
    }
}
