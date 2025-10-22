package com.smartclinic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrescriptionController {
    @GetMapping("/prescriptions")
    public String getAll() {
        return "Prescription list";
    }
}
