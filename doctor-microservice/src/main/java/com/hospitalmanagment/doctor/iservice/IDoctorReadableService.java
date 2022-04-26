package com.hospitalmanagment.doctor.iservice;

import java.util.List;
import java.util.Optional;

import com.hospitalmanagment.doctor.dto.DoctorResponse;
import com.hospitalmanagment.valueobject.BirthYear;
import com.hospitalmanagment.valueobject.FullName;
import com.hospitalmanagment.valueobject.Gender;
import com.hospitalmanagment.valueobject.IdentityNo;
import com.hospitalmanagment.valueobject.Specialty;
import com.hospitalmanagment.valueobject.doctor.DoctorId;
import com.hospitalmanagment.valueobject.doctor.Status;

public interface IDoctorReadableService {

	List<DoctorResponse> findAllDoctor();

	Optional<DoctorResponse> findDoctorByDoctorId(DoctorId doctorId);

	Optional<DoctorResponse> findDoctorByIdentityNo(IdentityNo identityNo);

	List<DoctorResponse> findDoctorByFullName(FullName fullName);

	List<DoctorResponse> findDoctorByFirstName(String firstName);

	List<DoctorResponse> findDoctorByLastName(String lastName);

	List<DoctorResponse> findDoctorByGender(Gender gender);

	List<DoctorResponse> findDoctorByStatu(Status statu);

	List<DoctorResponse> findDoctorBySpecialty(Specialty specialty);

	List<DoctorResponse> findDoctorByStatuAndGender(Status statu, Gender gender);

	List<DoctorResponse> findDoctorByStatuAndBirthYear(Status statu, BirthYear birthYear);

	List<DoctorResponse> findDoctorByStatuAndSpecialty(Status statu, Specialty specialty);

	List<DoctorResponse> findDoctorBySpecialtyAndGender(Specialty specialty, Gender gender);

	List<DoctorResponse> findDoctorBySpecialtyAndBirthYear(Specialty specialty, BirthYear birthYear);

	List<DoctorResponse> findDoctorByStatuAndSpecialtyAndGender(Status statu, Specialty specialty, Gender gender);

}
