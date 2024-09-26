package com.tm.gc.hospital_management.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
    int id;
    String name;
    Severity severity;
}
