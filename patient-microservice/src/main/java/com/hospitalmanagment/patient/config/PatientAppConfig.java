package com.hospitalmanagment.patient.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hospitalmanagment.iservice.patient.IPatientRedable;
import com.hospitalmanagment.iservice.patient.IPatientWritedable;
import com.hospitalmanagment.repository.patient.PatientReadableRepository;
import com.hospitalmanagment.repository.patient.PatientWritedableRepository;
import com.hospitalmanagment.service.patient.PatientReadable;
import com.hospitalmanagment.service.patient.PatientWritedable;


@Configuration
public class PatientAppConfig {

	@Bean
	public IPatientWritedable createPatientWritedabel(
			PatientWritedableRepository patientWritedableRepository) {
		return new PatientWritedable(patientWritedableRepository);
	}
		
	@Bean
	public IPatientRedable createPatientReadable(
			PatientReadableRepository patientReadableRepository) {
		return new PatientReadable(patientReadableRepository);
	}
	
}
