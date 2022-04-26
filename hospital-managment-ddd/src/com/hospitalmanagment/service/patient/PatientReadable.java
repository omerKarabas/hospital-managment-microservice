package com.hospitalmanagment.service.patient;

import java.util.List;
import java.util.Optional;

import com.hospitalmanagment.aggreagate.Patient;
import com.hospitalmanagment.iservice.patient.IPatientRedable;
import com.hospitalmanagment.repository.patient.PatientReadableRepository;
import com.hospitalmanagment.valueobject.BirthYear;
import com.hospitalmanagment.valueobject.FullName;
import com.hospitalmanagment.valueobject.Gender;
import com.hospitalmanagment.valueobject.IdentityNo;
import com.hospitalmanagment.valueobject.patient.PatientId;

public class PatientReadable implements IPatientRedable {

	private PatientReadableRepository patientReadableRepository;

	public PatientReadable(PatientReadableRepository patientReadableRepository) {
		super();
		this.patientReadableRepository = patientReadableRepository;
	}

	@Override
	public List<Patient> findAllPatient() {
		 var patients = patientReadableRepository.findAllPatient();
		 return patients;
	}

	@Override
	public Optional<Patient> findPatietByPatientId(PatientId patientId) {
		var patient = patientReadableRepository.findPatietByPatientId(patientId);
		return patient;
	}

	@Override
	public Optional<Patient> findPatientByIdentityNo(IdentityNo identityNo) {
		var paitent = patientReadableRepository.findPatientByIdentityNo(identityNo);
		return paitent;
	}

	@Override
	public List<Patient> findPatientByFullName(FullName fullName) {
		var patient = patientReadableRepository.findPatientByFullName(fullName);
		return patient;
	}

	@Override
	public List<Patient> findPatientByFirstName(String firstName) {
		var patient = patientReadableRepository.findPatientByFirstName(firstName);
		return patient;
	}

	@Override
	public List<Patient> findPatientByLastName(String lastName) {
		var patient = patientReadableRepository.findPatientByLastName(lastName);
		return patient;
	}

	@Override
	public List<Patient> findPatientByBirthYear(BirthYear birthYear) {
		var patient = patientReadableRepository.findPatientByBirthYear(birthYear);
		return patient;
	}

	@Override
	public List<Patient> findPatientByGender(Gender gender) {
		var patient = patientReadableRepository.findPatientByGender(gender);
		return patient;
	}

	@Override
	public List<Patient> findPatientByBirthYearAndGender(BirthYear birthYear, Gender gender) {
		var patient = patientReadableRepository.findPatientByBirthYearAndGender(birthYear, gender);
		return patient;
	}

}
