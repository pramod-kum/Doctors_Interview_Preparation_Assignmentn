package com.geekster.doctors.controller;

import com.geekster.doctors.model.Doctor;
import com.geekster.doctors.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DoctorController {
    @Autowired
    private DoctorService doctorService;

    @PostMapping("/addDoctor")
    public String addDoctor(@RequestBody Doctor doctorObj){
        return doctorService.saveDoctor(doctorObj);
    }
    @GetMapping("/getDoctorAll")
    public List<Doctor> getDoctorAll(){
        return doctorService.getDoctorAll();
    }
    @DeleteMapping("/deleteDoctorById/{id}")
    public String deleteDoctorById(@PathVariable Integer id){
        return doctorService.deleteDoctorById(id);
    }
    @PutMapping("/updateDoctorById")
    public String updateDoctorById(@RequestBody Doctor doctorObj)
    {
        return doctorService.updateDoctorById(doctorObj);
    }
}
