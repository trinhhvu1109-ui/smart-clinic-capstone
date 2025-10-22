package com.smartclinic.service;

import com.smartclinic.model.Patient;
import com.smartclinic.repository.PatientRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PatientService {
    private final PatientRepository repo;
    public PatientService(PatientRepository repo) { this.repo = repo; }

    public List<Patient> findAll() { return repo.findAll(); }
    public Patient save(Patient p) { return repo.save(p); }
}
