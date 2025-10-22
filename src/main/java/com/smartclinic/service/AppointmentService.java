package com.smartclinic.service;

import com.smartclinic.model.Appointment;
import com.smartclinic.repository.AppointmentRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AppointmentService {
    private final AppointmentRepository repo;
    public AppointmentService(AppointmentRepository repo) { this.repo = repo; }

    public Appointment book(Appointment a) { return repo.save(a); }
    public List<Appointment> byDoctor(Long doctorId) { return repo.findByDoctorId(doctorId); }
    public List<Appointment> byPatient(Long patientId) { return repo.findByPatientId(patientId); }
}
