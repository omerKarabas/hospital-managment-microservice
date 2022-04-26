package com.hospitalmanagment.doctor.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.hospitalmanagment.aggreagate.Doctor;
import com.hospitalmanagment.doctor.dto.DoctorRequest;
import com.hospitalmanagment.doctor.dto.DoctorResponse;
import com.hospitalmanagment.doctor.exception.RestExceptionBase;
import com.hospitalmanagment.doctor.iservice.IDoctorWritedableService;
import com.hospitalmanagment.iservice.doctor.IDoctorWritedable;
import com.hospitalmanagment.valueobject.FullName;
import com.hospitalmanagment.valueobject.Gender;
import com.hospitalmanagment.valueobject.Specialty;
import com.hospitalmanagment.valueobject.doctor.DoctorId;
import com.hospitalmanagment.valueobject.doctor.Status;

@Service
public class DoctorWritedableService implements IDoctorWritedableService {

	private IDoctorWritedable idoctorWritedabale;
	private ModelMapper modelMapper;

	public DoctorWritedableService(IDoctorWritedable idoctorWritedabale, ModelMapper modelMapper) {
		super();
		this.idoctorWritedabale = idoctorWritedabale;
		this.modelMapper = modelMapper;
	}

	@Override
	public Optional<DoctorResponse> addDoctor(DoctorRequest doctorRequest) {
		
		try {
			var requestToDoctor= modelMapper.map(doctorRequest,Doctor.class);
			var newDoctor = idoctorWritedabale.addDoctor(requestToDoctor);
			var result = modelMapper.map(newDoctor, DoctorResponse.class);
			
			return Optional.of(result);
			
		} catch (Exception e) {
			throw new RestExceptionBase("Doctor already exsits.", 14);		}
	}

	@Override
	public Optional<DoctorResponse> removeDoctor(DoctorId doctorId) {
		
		try {
			var removedDoctor = idoctorWritedabale.removeDoctor(doctorId);
			return Optional.of(modelMapper.map(removedDoctor, DoctorResponse.class));
		} catch (Exception e) {
			throw new RestExceptionBase("There is not doctor with this id.", 1);
		}
	}

	@Override
	public Optional<DoctorResponse> updateDoctorByName(DoctorId doctorId, FullName fullName) {
	
		try {
			var updatedDoctor = idoctorWritedabale.updateDoctorByName(doctorId, fullName);
			return Optional.of(modelMapper.map(updatedDoctor, DoctorResponse.class));
		} catch (Exception e) {
			throw new RestExceptionBase("There is not doctor with this id.", 1);
		}
	}

	@Override
	public Optional<DoctorResponse> updateDoctorByGender(DoctorId doctorId, Gender gender) {
		
		try {
			var updatedDoctor = idoctorWritedabale.updateDoctorByGender(doctorId, gender);
			return Optional.of(modelMapper.map(updatedDoctor, DoctorResponse.class));
		} catch (Exception e) {
			throw new RestExceptionBase("There is not doctor with this id.", 1);
		}
	}

	@Override
	public Optional<DoctorResponse> updateDoctorByStatu(DoctorId doctorId, Status statu) {
		
		try {
			var updatedDoctor = idoctorWritedabale.updateDoctorByStatu(doctorId, statu);
			return Optional.of(modelMapper.map(updatedDoctor, DoctorResponse.class));
		} catch (Exception e) {
			throw new RestExceptionBase("There is not doctor with this id.", 1);
		}
	}

	@Override
	public Optional<DoctorResponse> updateDoctorBySpecialty(DoctorId doctorId, Specialty specialty) {
		
		try {
			var updatedDoctor = idoctorWritedabale.updateDoctorBySpecialty(doctorId, specialty);
			return Optional.of(modelMapper.map(updatedDoctor, DoctorResponse.class));
		} catch (Exception e) {
			throw new RestExceptionBase("There is not doctor with this id.", 1);
		}
	}

}
