package com.hospitalmanagment.doctor.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hospitalmanagment.iservice.doctor.IDoctorReadable;
import com.hospitalmanagment.iservice.doctor.IDoctorWritedable;
import com.hospitalmanagment.repository.doctor.DoctorReadableRepository;
import com.hospitalmanagment.repository.doctor.DoctorWritedableRepository;
import com.hospitalmanagment.service.doctor.DoctorReadable;
import com.hospitalmanagment.service.doctor.DoctorWritedable;

@Configuration
public class DoctorAppsConfig {

	@Bean
	public IDoctorReadable createDoctorReadable (
			DoctorReadableRepository doctorReadableRepository) {
	return new DoctorReadable(doctorReadableRepository);
	}
	
	@Bean
	public IDoctorWritedable createDoctorWritedable (
			DoctorWritedableRepository doctorWritedableRepository) {
	return new DoctorWritedable(doctorWritedableRepository);
	}
}
