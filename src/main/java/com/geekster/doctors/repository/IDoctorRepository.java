package com.geekster.doctors.repository;

import com.geekster.doctors.model.Doctor;
import com.geekster.doctors.model.DoctorCity;
import com.geekster.doctors.model.Speciality;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IDoctorRepository extends JpaRepository<Doctor,Integer> {
    @Modifying
    @Query(value = "delete from doctor where doctor_id =:id",nativeQuery = true)
    void deleteDoctor(Integer id);

    @Modifying
    @Query(value = "update doctor set doctor_Name =:doctorName , email =:email , phone_Number =:phoneNumber where doctor_id =:doctorId",nativeQuery = true)
    void updateDoctor(Integer doctorId, String doctorName , String email, String phoneNumber);
}
