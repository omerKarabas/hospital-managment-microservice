package com.hospitalmanagment.iservice.patient;

import java.util.Optional;

import com.hospitalmanagment.aggreagate.Patient;
import com.hospitalmanagment.valueobject.IdentityNo;

public interface IPatientWritedable {

	Optional<Patient> addPatient(Patient patient);
	Optional<Patient> removePatient(IdentityNo identityNo);
	Optional<Patient> updatePatientInformationByIdentityNo(IdentityNo identityNo, Patient patient);
	
}
