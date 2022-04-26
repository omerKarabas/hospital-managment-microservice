package com.hospitalmanagment.patient.adapter;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.hospitalmanagment.aggreagate.Patient;
import com.hospitalmanagment.patient.entity.PatientEntity;
import com.hospitalmanagment.patient.repository.PatientEntityWritedableRepository;
import com.hospitalmanagment.repository.patient.PatientWritedableRepository;
import com.hospitalmanagment.valueobject.IdentityNo;
@Component
public class PatientWritedableRepositorySpringDataAdapter implements PatientWritedableRepository{

	private PatientEntityWritedableRepository patientEntityWritedableRepository;
	private ModelMapper modelMapper;
	
	public PatientWritedableRepositorySpringDataAdapter(
			PatientEntityWritedableRepository patientEntityWritedableRepository, ModelMapper modelMapper) {
		super();
		this.patientEntityWritedableRepository = patientEntityWritedableRepository;
		this.modelMapper = modelMapper;
	}

	@Override
	public Optional<Patient> addPatient(Patient patient) {
		var addPatient = patientEntityWritedableRepository.save(modelMapper.map(patient, PatientEntity.class));
		return Optional.of(modelMapper.map(addPatient, Patient.class));
	}

	@Override
	public Optional<Patient> removePatient(IdentityNo identityNo) {
		var findPatient = patientEntityWritedableRepository.findById(identityNo.getIdentityNo());
		if (findPatient.isEmpty())
			return Optional.empty();
		var document = findPatient.get();
		patientEntityWritedableRepository.delete(document);
		return Optional.of(modelMapper.map(document, Patient.class));
	}

	@Override
	public Optional<Patient> updatePatientInformationByIdentityNo(IdentityNo identityNo, Patient patient) {
		var findPatient = patientEntityWritedableRepository.findById(identityNo.getIdentityNo());
		if (findPatient.isEmpty())
			return Optional.empty();
		var document = findPatient.get();
		document.setPatientId(patient.getPatientId().getPatientId());
		document.setIdentityNo(patient.getIdentityNo().getIdentityNo());
		document.setFirstName(patient.getFullName().getFirstName());
		document.setLastName(patient.getFullName().getLastName());
		document.setBirthYear(patient.getBirthYear().getBirthYear());
		document.setGender(patient.getGender());
		
		return Optional.of(modelMapper.map(document, Patient.class));
	}

}
