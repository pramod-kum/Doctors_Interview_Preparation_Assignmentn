package com.geekster.doctors.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer doctorId;

    String doctorName;
    @Enumerated(value = EnumType.STRING)
    DoctorCity doctorCity;
    @Email
    String email;
    @NotNull
    @NotEmpty
    @Size(min = 10,max = 10)
    String phoneNumber;
    @Enumerated(value = EnumType.STRING)
    Speciality speciality;
}
