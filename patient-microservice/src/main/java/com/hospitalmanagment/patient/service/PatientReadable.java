package com.hospitalmanagment.patient.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.hospitalmanagment.iservice.patient.IPatientRedable;
import com.hospitalmanagment.patient.dto.PatientResponse;
import com.hospitalmanagment.patient.exception.RestExceptionBase;
import com.hospitalmanagment.patient.iservice.IPatientReadable;
import com.hospitalmanagment.valueobject.BirthYear;
import com.hospitalmanagment.valueobject.FullName;
import com.hospitalmanagment.valueobject.Gender;
import com.hospitalmanagment.valueobject.IdentityNo;
import com.hospitalmanagment.valueobject.patient.PatientId;

@Service
public class PatientReadable implements IPatientReadable {

	private IPatientRedable iPatientRedable;
	private ModelMapper modelMapper;

	public PatientReadable(IPatientRedable iPatientRedable, ModelMapper modelMapper) {
		super();
		this.iPatientRedable = iPatientRedable;
		this.modelMapper = modelMapper;
	}

	@Override
	public List<PatientResponse> findAllPatient() {
		
		try {
			var patients = iPatientRedable.findAllPatient()
										  .stream()
										  .map(patient -> modelMapper.map(patient, PatientResponse.class))
										  .toList();
			return patients;
			
		} catch (Exception e) {
			throw new RestExceptionBase("There is not patient.", 0);
		}
	}

	@Override
	public Optional<PatientResponse> findPatietByPatientId(PatientId patientId) {
		
		try {
			var patient = iPatientRedable.findPatietByPatientId(patientId);
			var result = modelMapper.map(patient, PatientResponse.class);
			return Optional.of(result);
			
		} catch (Exception e) {
			throw new RestExceptionBase("There is not doctor with this doctor id.", 1);
		}
	}

	@Override
	public Optional<PatientResponse> findPatientByIdentityNo(IdentityNo identityNo) {
		
		try {
			var patient = iPatientRedable.findPatientByIdentityNo(identityNo);
			var result = modelMapper.map(patient, PatientResponse.class);
			return Optional.of(result);
		}  catch (Exception e) {
			throw new RestExceptionBase("There is not doctor with this identityNo.", 2);
		}
	}

	@Override
	public List<PatientResponse> findPatientByFullName(FullName fullName) {
		
		try {
			var patient = iPatientRedable.findPatientByFullName(fullName)
										 .stream()
										 .map(patientForMap -> modelMapper.map(patientForMap, PatientResponse.class))
										 .toList();
			return patient;
		}catch (Exception e) {
			throw new RestExceptionBase("There is not doctor with this fullname.", 3);
		}
	}

	@Override
	public List<PatientResponse> findPatientByFirstName(String firstName) {
		
		try {
			var patient = iPatientRedable.findPatientByFirstName(firstName)
										 .stream()
										 .map(patientForMap -> modelMapper.map(patientForMap, PatientResponse.class))
										 .toList();
			return patient;
		}catch (Exception e) {
			throw new RestExceptionBase("There is not doctor with this first name.", 4);
		}
	}

	@Override
	public List<PatientResponse> findPatientByLastName(String lastName) {
		
		try {
			var patient = iPatientRedable.findPatientByLastName(lastName)
										 .stream()
										 .map(patientForMap -> modelMapper.map(patientForMap, PatientResponse.class))
										 .toList();
			return patient;
		}catch (Exception e) {
			throw new RestExceptionBase("There is not doctor with this last name.", 4);
		}
	}

	@Override
	public List<PatientResponse> findPatientByBirthYear(BirthYear birthYear) {
		
		try {
			var patient = iPatientRedable.findPatientByBirthYear(birthYear)
										 .stream()
										 .map(patientForMap -> modelMapper.map(patientForMap, PatientResponse.class))
										 .toList();
			return patient;
			
		}catch (Exception e) {
			throw new RestExceptionBase("There is not doctor with this birthYear.", 5);
		}
	}

	@Override
	public List<PatientResponse> findPatientByGender(Gender gender) {
		
		try {
			var patient = iPatientRedable.findPatientByGender(gender)
										 .stream()
										 .map(patientForMap -> modelMapper.map(patientForMap, PatientResponse.class))
										 .toList();
			return patient;
			
		}catch (Exception e) {
			throw new RestExceptionBase("There is not doctor with this gender.", 6);
		}
	}

	@Override
	public List<PatientResponse> findPatientByBirthYearAndGender(BirthYear birthYear, Gender gender) {
		
		try {
			var patient = iPatientRedable.findPatientByBirthYearAndGender(birthYear, gender)
										 .stream()
										 .map(patientForMap -> modelMapper.map(patientForMap, PatientResponse.class))
										 .toList();
			return patient;
			
		}catch (Exception e) {
			throw new RestExceptionBase("There is not doctor with this birthYear and gender.", 7);
		}
	}

}
