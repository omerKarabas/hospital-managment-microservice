package com.hospitalmanagment.repository.patient;

import java.util.List;
import java.util.Optional;

import com.hospitalmanagment.aggreagate.Patient;
import com.hospitalmanagment.valueobject.BirthYear;
import com.hospitalmanagment.valueobject.FullName;
import com.hospitalmanagment.valueobject.Gender;
import com.hospitalmanagment.valueobject.IdentityNo;
import com.hospitalmanagment.valueobject.patient.PatientId;

public interface PatientReadableRepository {

	List<Patient> findAllPatient();

	Optional<Patient> findPatietByPatientId(PatientId patientId);

	Optional<Patient> findPatientByIdentityNo(IdentityNo identityNo);

	List<Patient> findPatientByFullName(FullName fullName);

	List<Patient> findPatientByFirstName(String firstName);

	List<Patient> findPatientByLastName(String lastName);

	List<Patient> findPatientByBirthYear(BirthYear birthYear);

	List<Patient> findPatientByGender(Gender gender);

	List<Patient> findPatientByBirthYearAndGender(BirthYear birthYear, Gender gender);

}
