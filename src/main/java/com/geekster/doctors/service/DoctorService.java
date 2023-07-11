package com.geekster.doctors.service;

import com.geekster.doctors.model.Doctor;
import com.geekster.doctors.repository.IDoctorRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {
    @Autowired
    private IDoctorRepository iDoctorRepository;

    public String saveDoctor(Doctor doctorObj) {
        iDoctorRepository.save(doctorObj);
        return "Doctor added successfully!!";
    }

    public List<Doctor> getDoctorAll() {
        return iDoctorRepository.findAll();
    }
    @Transactional
    public String deleteDoctorById(Integer id) {
        iDoctorRepository.deleteDoctor(id);
        return "Doctor deleted successfully!!";
    }
    @Transactional
    public String updateDoctorById(Doctor doctorObj) {
        iDoctorRepository.updateDoctor(doctorObj.getDoctorId(),doctorObj.getDoctorName(),doctorObj.getEmail(),doctorObj.getPhoneNumber());
        return "Doctor Updated successfully!!";
    }
}
