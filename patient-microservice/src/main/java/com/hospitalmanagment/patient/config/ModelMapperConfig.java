package com.hospitalmanagment.patient.config;

import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hospitalmanagment.aggreagate.Patient;
import com.hospitalmanagment.patient.dto.PatientRequest;
import com.hospitalmanagment.patient.dto.PatientResponse;
import com.hospitalmanagment.patient.entity.PatientEntity;
@Configuration
public class ModelMapperConfig {

	private final static Converter<Patient, PatientEntity> 
		PATIENT_TO_PATIENT_ENTITY_CONVERTER = context -> new PatientEntity(context.getSource().getPatientId().getPatientId(), 
																		   context.getSource().getFullName().getFirstName(), 
																		   context.getSource().getFullName().getLastName(), 
																		   context.getSource().getBirthYear().getBirthYear(), 
																		   context.getSource().getGender());
		
	private final static Converter<PatientEntity, Patient>
		PATIENT_ENTITY_TO_PATIENT_CONVERTER = context -> new Patient.Builder()
																			.patientId(context.getSource().getIdentityNo())
																			.identityNo(context.getSource().getIdentityNo())
																			.fullName(context.getSource().getFirstName(), 
																					  context.getSource().getLastName())
																			.birthYear(context.getSource().getBirthYear())
																			.gender(context.getSource().getGender())
																			.build();
		
	private final static Converter<PatientRequest,Patient>
		PATIENT_REQUEST_TO_PATIENT_CONVERTER = context -> new Patient.Builder()
																			.identityNo(context.getSource().getIdentityNo())
																			.fullName(context.getSource().getFirstName(), 
																					  context.getSource().getLastName())
																			.birthYear(context.getSource().getBirthYear())
																			.gender(context.getSource().getGender())
																			.build();
	private final static Converter<Patient,PatientResponse>
		PATIENT_TO_PATIENT_RESPONSE_CONVERTER = context -> new PatientResponse(context.getSource().getPatientId().getPatientId(), 
																			   context.getSource().getIdentityNo().getIdentityNo(), 
																			   context.getSource().getFullName().getFirstName(), 
																			   context.getSource().getFullName().getLastName(), 
																			   context.getSource().getBirthYear().getBirthYear(), 
																			   context.getSource().getGender());
	@Bean
	public ModelMapper modelMapper() {
		var modelMapper = new ModelMapper();
		modelMapper.addConverter(PATIENT_TO_PATIENT_ENTITY_CONVERTER, 
				Patient.class, PatientEntity.class);
		modelMapper.addConverter(PATIENT_ENTITY_TO_PATIENT_CONVERTER, 
				PatientEntity.class, Patient.class);
		modelMapper.addConverter(PATIENT_REQUEST_TO_PATIENT_CONVERTER, 
				PatientRequest.class, Patient.class);
		modelMapper.addConverter(PATIENT_TO_PATIENT_RESPONSE_CONVERTER, 
				Patient.class, PatientResponse.class);
		return modelMapper;
	}	
}
