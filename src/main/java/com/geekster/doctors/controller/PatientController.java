package com.geekster.doctors.controller;

import com.geekster.doctors.model.Doctor;
import com.geekster.doctors.model.Patient;
import com.geekster.doctors.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientController {
    @Autowired
    private PatientService patientService;

    @PostMapping("/addPatient")
    public String addPatient(@RequestBody Patient patientObj){
        return patientService.addPatient(patientObj);
    }
    @GetMapping("/getPatient")
    public List<Patient> getPatient(){
        return patientService.getPatient();
    }
    @DeleteMapping("/deletePatientById/{id}")
    public String deletePatientById(@PathVariable Integer id){
        return patientService.deletePatientById(id);
    }
    @PutMapping("/updatePatientById")
    public String updatePatientById(@RequestBody Patient patientObj){
        return patientService.updatePatientById(patientObj);
    }
}
