package com.hospitalmanagment.repository.doctor;

import java.util.List;
import java.util.Optional;

import com.hospitalmanagment.aggreagate.Doctor;
import com.hospitalmanagment.valueobject.BirthYear;
import com.hospitalmanagment.valueobject.FullName;
import com.hospitalmanagment.valueobject.Gender;
import com.hospitalmanagment.valueobject.IdentityNo;
import com.hospitalmanagment.valueobject.Specialty;
import com.hospitalmanagment.valueobject.doctor.DoctorId;
import com.hospitalmanagment.valueobject.doctor.Status;

public interface DoctorReadableRepository {

	List<Doctor> findAllDoctor();

	Optional<Doctor> findDoctorByDoctorId(DoctorId doctorId);

	Optional<Doctor> findDoctorByIdentityNo(IdentityNo identityNo);

	List<Doctor> findDoctorByFullName(FullName fullName);

	List<Doctor> findDoctorByFirstName(String firstName);

	List<Doctor> findDoctorByLastName(String lastName);

	List<Doctor> findDoctorByGender(Gender gender);

	List<Doctor> findDoctorByStatu(Status statu);

	List<Doctor> findDoctorBySpecialty(Specialty specialty);

	List<Doctor> findDoctorByStatuAndGender(Status statu, Gender gender);

	List<Doctor> findDoctorByStatuAndBirthYear(Status statu, BirthYear birthYear);

	List<Doctor> findDoctorByStatuAndSpecialty(Status statu, Specialty specialty);

	List<Doctor> findDoctorBySpecialtyAndGender(Specialty specialty, Gender gender);

	List<Doctor> findDoctorBySpecialtyAndBirthYear(Specialty specialty, BirthYear birthYear);

	List<Doctor> findDoctorByStatuAndSpecialtyAndGender(Status statu, Specialty specialty, Gender gender);

}
