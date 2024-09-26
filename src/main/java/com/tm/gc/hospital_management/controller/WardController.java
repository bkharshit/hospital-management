package com.tm.gc.hospital_management.controller;


import com.tm.gc.hospital_management.services.WardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ward")
public class WardController {

    @Autowired
    WardService wardService;

    @GetMapping("/assign/{id}")
    public ResponseEntity<String> assignWard(@PathVariable int id) {
        String response = ""+wardService.assignWard(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
