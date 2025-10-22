package com.smartclinic.controller;

import com.smartclinic.model.Patient;
import com.smartclinic.service.PatientService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patients")
public class PatientController {
    private final PatientService service;
    public PatientController(PatientService service) { this.service = service; }

    @GetMapping
    public ResponseEntity<List<Patient>> all() { return ResponseEntity.ok(service.findAll()); }

    @PostMapping
    public ResponseEntity<Patient> create(@Valid @RequestBody Patient p) {
        return ResponseEntity.ok(service.save(p));
    }
}
