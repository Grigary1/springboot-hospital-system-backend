package com.hospitalmanagement.backend.controllers;

import com.hospitalmanagement.backend.models.Patient;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/patients")
public class PatientControllers {
    @GetMapping("/patient")
    public List<Patient> getPatients(){
        System.out.println("Fetching all patients");
        return null;
    }

    @PostMapping("/patient")
    public Patient createPatient(@Valid @RequestBody Patient patient){
        System.out.println(patient);
        return patient;
    }
}
