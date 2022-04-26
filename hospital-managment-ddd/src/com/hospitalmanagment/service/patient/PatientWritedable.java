package com.hospitalmanagment.service.patient;

import java.util.Optional;

import com.hospitalmanagment.aggreagate.Patient;
import com.hospitalmanagment.iservice.patient.IPatientWritedable;
import com.hospitalmanagment.repository.patient.PatientWritedableRepository;
import com.hospitalmanagment.valueobject.IdentityNo;

public class PatientWritedable implements IPatientWritedable {

	private PatientWritedableRepository patientWritedableRepository;

	
	public PatientWritedable(PatientWritedableRepository patientWritedableRepository) {
		super();
		this.patientWritedableRepository = patientWritedableRepository;
	}

	@Override
	public Optional<Patient> addPatient(Patient patient) {
		var addedPatient = patientWritedableRepository.addPatient(patient);
		return addedPatient;
	}

	@Override
	public Optional<Patient> removePatient(IdentityNo identityNo) {
		var removedPatient = patientWritedableRepository.removePatient(identityNo);
		return removedPatient;
	}

	@Override
	public Optional<Patient> updatePatientInformationByIdentityNo(IdentityNo identityNo, Patient patient) {
		var updatePatient = patientWritedableRepository.updatePatientInformationByIdentityNo(identityNo, patient);
		return updatePatient;
	}

}
