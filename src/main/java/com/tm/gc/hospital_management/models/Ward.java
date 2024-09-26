package com.tm.gc.hospital_management.models;

import lombok.Data;

@Data
public abstract class Ward {
    int id;
    boolean isEmpty;
    Severity severity;
}
