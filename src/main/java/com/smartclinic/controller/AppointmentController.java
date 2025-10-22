package com.smartclinic.controller;

import com.smartclinic.model.Appointment;
import com.smartclinic.service.AppointmentService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/appointments")
public class AppointmentController {
    private final AppointmentService service;
    public AppointmentController(AppointmentService service) { this.service = service; }

    @PostMapping
    public ResponseEntity<Appointment> book(@Valid @RequestBody Appointment a) {
        return ResponseEntity.ok(service.book(a));
    }

    @GetMapping("/doctor/{doctorId}")
    public ResponseEntity<List<Appointment>> byDoctor(@PathVariable Long doctorId) {
        return ResponseEntity.ok(service.byDoctor(doctorId));
    }

    @GetMapping("/patient/{patientId}")
    public ResponseEntity<List<Appointment>> byPatient(@PathVariable Long patientId) {
        return ResponseEntity.ok(service.byPatient(patientId));
    }
}
