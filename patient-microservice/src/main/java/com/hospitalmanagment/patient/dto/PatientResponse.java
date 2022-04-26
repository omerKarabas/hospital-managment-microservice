package com.hospitalmanagment.patient.dto;

import java.util.Date;

import com.hospitalmanagment.valueobject.Gender;

public record PatientResponse(
		int patientId,
		int identityNo,
		String firstName,
		String lastName,
		Date birthYear,
		Gender gender) {

}
