package com.hospitalmanagment.doctor.iservice;

import java.util.Optional;

import com.hospitalmanagment.doctor.dto.DoctorRequest;
import com.hospitalmanagment.doctor.dto.DoctorResponse;
import com.hospitalmanagment.valueobject.FullName;
import com.hospitalmanagment.valueobject.Gender;
import com.hospitalmanagment.valueobject.Specialty;
import com.hospitalmanagment.valueobject.doctor.DoctorId;
import com.hospitalmanagment.valueobject.doctor.Status;

public interface IDoctorWritedableService {

	Optional<DoctorResponse> addDoctor(DoctorRequest doctorRequest);

	Optional<DoctorResponse> removeDoctor(DoctorId doctorId);

	Optional<DoctorResponse> updateDoctorByName(DoctorId doctorId, FullName fullName);

	Optional<DoctorResponse> updateDoctorByGender(DoctorId doctorId, Gender gender);

	Optional<DoctorResponse> updateDoctorByStatu(DoctorId doctorId, Status statu);

	Optional<DoctorResponse> updateDoctorBySpecialty(DoctorId doctorId, Specialty specialty);

}
