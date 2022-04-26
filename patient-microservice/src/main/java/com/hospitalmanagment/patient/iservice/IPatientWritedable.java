package com.hospitalmanagment.patient.iservice;

import java.util.Optional;

import com.hospitalmanagment.patient.dto.PatientRequest;
import com.hospitalmanagment.patient.dto.PatientResponse;
import com.hospitalmanagment.valueobject.IdentityNo;

public interface IPatientWritedable {

	Optional<PatientResponse> addPatient(PatientRequest patientRequest);
	Optional<PatientResponse> removePatient(IdentityNo identityNo);
	Optional<PatientResponse> updatePatientInformationByIdentityNo(IdentityNo identityNo, PatientRequest patientRequest);
}
