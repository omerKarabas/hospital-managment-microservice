package com.hospitalmanagment.iservice.doctor;

import java.util.Optional;

import com.hospitalmanagment.aggreagate.Doctor;
import com.hospitalmanagment.valueobject.FullName;
import com.hospitalmanagment.valueobject.Gender;
import com.hospitalmanagment.valueobject.Specialty;
import com.hospitalmanagment.valueobject.doctor.DoctorId;
import com.hospitalmanagment.valueobject.doctor.Status;

public interface IDoctorWritedable {

	Optional<Doctor> addDoctor(Doctor doctor);
	
	Optional<Doctor> removeDoctor(DoctorId doctorId);
	
	Optional<Doctor> updateDoctorByName(DoctorId doctorId, FullName fullName);

	Optional<Doctor> updateDoctorByGender(DoctorId doctorId, Gender gender);

	Optional<Doctor> updateDoctorByStatu(DoctorId doctorId, Status statu);

	Optional<Doctor> updateDoctorBySpecialty(DoctorId doctorId, Specialty specialty);

}
