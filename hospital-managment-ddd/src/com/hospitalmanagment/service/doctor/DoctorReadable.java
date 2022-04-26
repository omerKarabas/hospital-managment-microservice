package com.hospitalmanagment.service.doctor;

import java.util.List;
import java.util.Optional;

import com.hospitalmanagment.aggreagate.Doctor;
import com.hospitalmanagment.iservice.doctor.IDoctorReadable;
import com.hospitalmanagment.repository.doctor.DoctorReadableRepository;
import com.hospitalmanagment.valueobject.BirthYear;
import com.hospitalmanagment.valueobject.FullName;
import com.hospitalmanagment.valueobject.Gender;
import com.hospitalmanagment.valueobject.IdentityNo;
import com.hospitalmanagment.valueobject.Specialty;
import com.hospitalmanagment.valueobject.doctor.DoctorId;
import com.hospitalmanagment.valueobject.doctor.Status;

public class DoctorReadable implements IDoctorReadable {

	private DoctorReadableRepository doctorReadableRepository;

	public DoctorReadable(DoctorReadableRepository doctorReadableRepository) {
		super();
		this.doctorReadableRepository = doctorReadableRepository;
	}

	@Override
	public List<Doctor> findAllDoctor() {
		var doctors = doctorReadableRepository.findAllDoctor();
		return doctors;
	}

	@Override
	public Optional<Doctor> findDoctorByDoctorId(DoctorId doctorId) {
		var doctor = doctorReadableRepository.findDoctorByDoctorId(doctorId);
		return doctor;
	}

	@Override
	public Optional<Doctor> findDoctorByIdentityNo(IdentityNo identityNo) {
		var doctor = doctorReadableRepository.findDoctorByIdentityNo(identityNo);
		return doctor;
	}

	@Override
	public List<Doctor> findDoctorByFullName(FullName fullName) {
		var doctors = doctorReadableRepository.findDoctorByFullName(fullName);
		return doctors;
	}

	@Override
	public List<Doctor> findDoctorByFirstName(String firstName) {
		var doctors = doctorReadableRepository.findDoctorByFirstName(firstName);
		return doctors;
	}

	@Override
	public List<Doctor> findDoctorByLastName(String lastName) {
		var doctors = doctorReadableRepository.findDoctorByLastName(lastName);
		return doctors;
	}

	@Override
	public List<Doctor> findDoctorByGender(Gender gender) {
		var doctors = doctorReadableRepository.findDoctorByGender(gender);
		return doctors;
	}

	@Override
	public List<Doctor> findDoctorByStatu(Status statu) {
		var doctors = doctorReadableRepository.findDoctorByStatu(statu);
		return doctors;
	}

	@Override
	public List<Doctor> findDoctorBySpecialty(Specialty specialty) {
		var doctors = doctorReadableRepository.findDoctorBySpecialty(specialty);
		return doctors;
	}

	@Override
	public List<Doctor> findDoctorByStatuAndGender(Status statu, Gender gender) {
		var doctors = doctorReadableRepository.findDoctorByStatuAndGender(statu, gender);
		return doctors;
	}

	@Override
	public List<Doctor> findDoctorByStatuAndBirthYear(Status statu, BirthYear birthYear) {
		var doctors = doctorReadableRepository.findDoctorByStatuAndBirthYear(statu, birthYear);
		return doctors;
	}

	@Override
	public List<Doctor> findDoctorByStatuAndSpecialty(Status statu, Specialty specialty) {
		var doctors = doctorReadableRepository.findDoctorByStatuAndSpecialty(statu, specialty);
		return doctors;
	}

	@Override
	public List<Doctor> findDoctorBySpecialtyAndGender(Specialty specialty, Gender gender) {
		var doctors = doctorReadableRepository.findDoctorBySpecialtyAndGender(specialty, gender);
		return doctors;
	}

	@Override
	public List<Doctor> findDoctorBySpecialtyAndBirthYear(Specialty specialty, BirthYear birthYear) {
		var doctors = doctorReadableRepository.findDoctorBySpecialtyAndBirthYear(specialty, birthYear);
		return doctors;
	}

	@Override
	public List<Doctor> findDoctorByStatuAndSpecialtyAndGender(Status statu, Specialty specialty, Gender gender) {
		var doctors = doctorReadableRepository.findDoctorByStatuAndSpecialtyAndGender(statu, specialty, gender);
		return doctors;
	}

}
