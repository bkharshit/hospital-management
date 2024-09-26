package com.tm.gc.hospital_management;

public class WardsNotFreeException extends RuntimeException{
    public WardsNotFreeException(String message){
        super(message);
    }
}
