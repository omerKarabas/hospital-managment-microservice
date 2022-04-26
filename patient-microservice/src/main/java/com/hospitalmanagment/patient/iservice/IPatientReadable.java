package com.hospitalmanagment.patient.iservice;

import java.util.List;
import java.util.Optional;

import com.hospitalmanagment.patient.dto.PatientResponse;
import com.hospitalmanagment.valueobject.BirthYear;
import com.hospitalmanagment.valueobject.FullName;
import com.hospitalmanagment.valueobject.Gender;
import com.hospitalmanagment.valueobject.IdentityNo;
import com.hospitalmanagment.valueobject.patient.PatientId;

public interface IPatientReadable {

	List<PatientResponse> findAllPatient();

	Optional<PatientResponse> findPatietByPatientId(PatientId patientId);

	Optional<PatientResponse> findPatientByIdentityNo(IdentityNo identityNo);

	List<PatientResponse> findPatientByFullName(FullName fullName);

	List<PatientResponse> findPatientByFirstName(String firstName);

	List<PatientResponse> findPatientByLastName(String lastName);

	List<PatientResponse> findPatientByBirthYear(BirthYear birthYear);

	List<PatientResponse> findPatientByGender(Gender gender);

	List<PatientResponse> findPatientByBirthYearAndGender(BirthYear birthYear, Gender gender);
}
