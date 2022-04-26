package com.hospitalmanagment.doctor.adapter;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.hospitalmanagment.aggreagate.Doctor;
import com.hospitalmanagment.doctor.entity.DoctorEntity;
import com.hospitalmanagment.doctor.repository.DoctorEntityWritedableRepository;
import com.hospitalmanagment.repository.doctor.DoctorWritedableRepository;
import com.hospitalmanagment.valueobject.FullName;
import com.hospitalmanagment.valueobject.Gender;
import com.hospitalmanagment.valueobject.Specialty;
import com.hospitalmanagment.valueobject.doctor.DoctorId;
import com.hospitalmanagment.valueobject.doctor.Status;

@Component
public class DoctorWritedableRepositorySpringDataAdapter implements DoctorWritedableRepository {

	private DoctorEntityWritedableRepository doctorEntityWritedableRepository;
	private ModelMapper modelMapper;

	public DoctorWritedableRepositorySpringDataAdapter(
			DoctorEntityWritedableRepository doctorEntityWritedableRepository, ModelMapper modelMapper) {
		super();
		this.doctorEntityWritedableRepository = doctorEntityWritedableRepository;
		this.modelMapper = modelMapper;
	}

	@Override
	@Transactional
	
	public Optional<Doctor> addDoctor(Doctor doctor) {

		var newDoctor = doctorEntityWritedableRepository.save(modelMapper.map(doctor, DoctorEntity.class));
		return Optional.of(modelMapper.map(newDoctor, Doctor.class));
	}

	@Override
	@Transactional
	
	public Optional<Doctor> removeDoctor(DoctorId doctorId) {

		var findDoctor = doctorEntityWritedableRepository.findById(doctorId.getDoctorId());
		if (findDoctor.isEmpty())
			return Optional.empty();
		var document = findDoctor.get();
		doctorEntityWritedableRepository.delete(document);
		return Optional.of(modelMapper.map(document, Doctor.class));
	}

	@Override
	@Transactional
	public Optional<Doctor> updateDoctorByName(DoctorId doctorId, FullName fullName) {
		var findDoctor = doctorEntityWritedableRepository.findById(doctorId.getDoctorId());
		var changedDoctor = modelMapper.map(findDoctor.get(), Doctor.class);
		changedDoctor.setFullName(fullName);
		return Optional.of(changedDoctor);
	}

	@Override
	@Transactional
	public Optional<Doctor> updateDoctorByGender(DoctorId doctorId, Gender gender) {
		var findDoctor = doctorEntityWritedableRepository.findById(doctorId.getDoctorId());
		var changedDoctor = modelMapper.map(findDoctor.get(), Doctor.class);
		changedDoctor.setGender(gender);
		return Optional.of(changedDoctor);
	}

	@Override
	@Transactional
	public Optional<Doctor> updateDoctorByStatu(DoctorId doctorId, Status statu) {
		var findDoctor = doctorEntityWritedableRepository.findById(doctorId.getDoctorId());
		var changedDoctor = modelMapper.map(findDoctor.get(), Doctor.class);
		changedDoctor.setStatu(statu);
		return Optional.of(changedDoctor);
	}

	@Override
	@Transactional
	public Optional<Doctor> updateDoctorBySpecialty(DoctorId doctorId, Specialty specialty) {
		var findDoctor = doctorEntityWritedableRepository.findById(doctorId.getDoctorId());
		var changedDoctor = modelMapper.map(findDoctor.get(), Doctor.class);
		changedDoctor.setSpecialty(specialty);
		return Optional.of(changedDoctor);
	}

}
