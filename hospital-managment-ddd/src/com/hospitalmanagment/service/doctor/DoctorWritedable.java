package com.hospitalmanagment.service.doctor;

import java.util.Optional;

import com.hospitalmanagment.aggreagate.Doctor;
import com.hospitalmanagment.iservice.doctor.IDoctorWritedable;
import com.hospitalmanagment.repository.doctor.DoctorWritedableRepository;
import com.hospitalmanagment.valueobject.FullName;
import com.hospitalmanagment.valueobject.Gender;
import com.hospitalmanagment.valueobject.Specialty;
import com.hospitalmanagment.valueobject.doctor.DoctorId;
import com.hospitalmanagment.valueobject.doctor.Status;

public class DoctorWritedable implements IDoctorWritedable {

	private DoctorWritedableRepository doctorWritedableRepository;
	
	
	public DoctorWritedable(DoctorWritedableRepository doctorWritedableRepository) {
		super();
		this.doctorWritedableRepository = doctorWritedableRepository;
	}

	@Override
	public Optional<Doctor> addDoctor(Doctor doctor) {
		var  addDoctor = doctorWritedableRepository.addDoctor(doctor);
		return addDoctor;
	}

	@Override
	public Optional<Doctor> removeDoctor(DoctorId doctorId) {
		var removedDoctor = doctorWritedableRepository.removeDoctor(doctorId);
		return removedDoctor;
	}

	@Override
	public Optional<Doctor> updateDoctorByName(DoctorId doctorId, FullName fullName) {
		var updatedDoctor = doctorWritedableRepository.updateDoctorByName(doctorId, fullName);
		return updatedDoctor;
	}

	@Override
	public Optional<Doctor> updateDoctorByGender(DoctorId doctorId, Gender gender) {
		var updatedDoctor = doctorWritedableRepository.updateDoctorByGender(doctorId, gender);
		return updatedDoctor;
	}

	@Override
	public Optional<Doctor> updateDoctorByStatu(DoctorId doctorId, Status statu) {
		var  updatedDoctor = doctorWritedableRepository.updateDoctorByStatu(doctorId, statu);
		return updatedDoctor;
	}

	@Override
	public Optional<Doctor> updateDoctorBySpecialty(DoctorId doctorId, Specialty specialty) {
		var updatedDoctor = doctorWritedableRepository.updateDoctorBySpecialty(doctorId, specialty);
		return updatedDoctor;
	}

}
