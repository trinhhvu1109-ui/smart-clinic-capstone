package com.smartclinic.controller;

import com.smartclinic.model.Doctor;
import com.smartclinic.service.DoctorService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {

    private final DoctorService service;
    public DoctorController(DoctorService service) { this.service = service; }

    @GetMapping
    public ResponseEntity<List<Doctor>> all() { return ResponseEntity.ok(service.findAll()); }

    @PostMapping
    public ResponseEntity<Doctor> create(@Valid @RequestBody Doctor d) {
        return ResponseEntity.ok(service.save(d));
    }

    @GetMapping("/{id}/availability")
    public ResponseEntity<List<String>> availability(@PathVariable Long id) {
        return ResponseEntity.ok(service.getAvailableTimes(id));
    }
}
