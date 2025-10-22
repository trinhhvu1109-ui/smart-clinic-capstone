package com.smartclinic.service;

import com.smartclinic.model.Doctor;
import com.smartclinic.repository.DoctorRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DoctorService {
    private final DoctorRepository repo;
    public DoctorService(DoctorRepository repo) { this.repo = repo; }

    public List<Doctor> findAll() { return repo.findAll(); }
    public Doctor save(Doctor d) { return repo.save(d); }
    public List<String> getAvailableTimes(Long id) {
        return repo.findById(id).map(Doctor::getAvailableTimes).orElse(List.of());
    }
}
