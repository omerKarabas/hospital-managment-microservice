package com.hospitalmanagment.patient.adapter;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.hospitalmanagment.aggreagate.Patient;
import com.hospitalmanagment.patient.entity.PatientEntity;
import com.hospitalmanagment.patient.repository.PatientEntityReadableRepository;
import com.hospitalmanagment.repository.patient.PatientReadableRepository;
import com.hospitalmanagment.valueobject.BirthYear;
import com.hospitalmanagment.valueobject.FullName;
import com.hospitalmanagment.valueobject.Gender;
import com.hospitalmanagment.valueobject.IdentityNo;
import com.hospitalmanagment.valueobject.patient.PatientId;
@Component
public class PatientReadableRepositorySpringDataAdapter implements PatientReadableRepository{

	private PatientEntityReadableRepository patientEntityReadableRepository;
	private ModelMapper modelMapper;
	
	public PatientReadableRepositorySpringDataAdapter(PatientEntityReadableRepository patientEntityReadableRepository,
			ModelMapper modelMapper) {
		super();
		this.patientEntityReadableRepository = patientEntityReadableRepository;
		this.modelMapper = modelMapper;
	}

	@Override
	public List<Patient> findAllPatient() {
		List<Patient> patients = patientEntityReadableRepository.findAll()
													            .stream()
													            .map(pat -> modelMapper.map(pat, Patient.class))
													            .toList();
		return patients;
	}

	@Override
	public Optional<Patient> findPatietByPatientId(PatientId patientId) {
		var patient = patientEntityReadableRepository.findById(patientId.getPatientId());
		if(patient.isEmpty())
			return Optional.empty();
		return Optional.of(modelMapper.map(patient, Patient.class));
	}

	@Override
	public Optional<Patient> findPatientByIdentityNo(IdentityNo identityNo) {
		var patient = patientEntityReadableRepository.findById(identityNo.getIdentityNo());
		if(patient.isEmpty())
			return Optional.empty();
		return Optional.of(modelMapper.map(patient, Patient.class));
	}

	@Override
	public List<Patient> findPatientByFullName(FullName fullName) {
		
		Predicate<PatientEntity> isFirstName = patientWithFirstName -> patientWithFirstName.getFirstName().equals(fullName.getFirstName());
		Predicate<PatientEntity> isLastName = patientWithLastName -> patientWithLastName.getLastName().equals(fullName.getLastName());
		
		List<Patient> patients = patientEntityReadableRepository.findAll()
																.stream()
																.filter(isFirstName.and(isLastName))
																.map(pat -> modelMapper.map(pat, Patient.class))
																.toList();
		return patients;
																
	}

	@Override
	public List<Patient> findPatientByFirstName(String firstName) {
		
		List<Patient> patients = patientEntityReadableRepository.findAll()
																.stream()
																.filter(patientWithName -> patientWithName.getFirstName().equals(firstName))
																.map(pat -> modelMapper.map(pat, Patient.class))
																.toList();
		
		return patients;
	}

	@Override
	public List<Patient> findPatientByLastName(String lastName) {
		
		List<Patient> patients = patientEntityReadableRepository.findAll()
				.stream()
				.filter(patientWithName -> patientWithName.getLastName().equals(lastName))
				.map(pat -> modelMapper.map(pat, Patient.class))
				.toList();

		return patients;
	}

	@Override
	public List<Patient> findPatientByBirthYear(BirthYear birthYear) {
		
		List<Patient> patients = patientEntityReadableRepository.findAll()
																.stream()
																.filter(patientWithBirthYear -> patientWithBirthYear.getBirthYear().equals(birthYear))
																.map(pat -> modelMapper.map(pat, Patient.class))
																.toList();

		return patients;
	}

	@Override
	public List<Patient> findPatientByGender(Gender gender) {
		List<Patient> patients = patientEntityReadableRepository.findAll()
				.stream()
				.filter(patientWithGender -> patientWithGender.getGender().equals(gender))
				.map(pat -> modelMapper.map(pat, Patient.class))
				.toList();

		return patients;
	}


	@Override
	public List<Patient> findPatientByBirthYearAndGender(BirthYear birthYear, Gender gender) {
		
		Predicate<PatientEntity> isBirthYear = patientEntityWithBirthYear -> patientEntityWithBirthYear.equals(gender);
		Predicate<PatientEntity> isGender = patientEntityWithGender -> patientEntityWithGender.getBirthYear().equals(isBirthYear);
		List<Patient> patients = patientEntityReadableRepository.findAll()
																.stream()
																.filter(isBirthYear.and(isGender))
																.map(pat -> modelMapper.map(pat, Patient.class))
																.toList();

		return patients;
	}
	
}
