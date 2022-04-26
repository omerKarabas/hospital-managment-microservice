package com.hospitalmanagment.doctor.dto;

import java.util.Date;

import com.hospitalmanagment.valueobject.Gender;
import com.hospitalmanagment.valueobject.Specialty;
import com.hospitalmanagment.valueobject.doctor.Status;

public record DoctorResponse(
		int identityNo,
		String firstName,
		String lastName,
		Date birthYear,
		Gender gender,
		Status statu,
		Specialty specialty) {	
	}
