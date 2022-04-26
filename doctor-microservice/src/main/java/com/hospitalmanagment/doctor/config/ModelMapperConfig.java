package com.hospitalmanagment.doctor.config;

import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hospitalmanagment.aggreagate.Doctor;
import com.hospitalmanagment.doctor.dto.DoctorRequest;
import com.hospitalmanagment.doctor.dto.DoctorResponse;
import com.hospitalmanagment.doctor.entity.DoctorEntity;


@Configuration
public class ModelMapperConfig {
			
	private static final Converter<DoctorRequest, Doctor>
		DOCTOR_REQUEST_TO_DOCTOR_CONVERTER = (context)-> {
			var request = context.getSource();
			var convertVariable = new Doctor.Builder()
									.identityNo(request.getIdentityNo())
									.fullName(request.getFirstName(), request.getLastName())
									.birthYear(request.getBirthYear())
									.gender(request.getGender())
									.specialty(request.getSpecialty())
									.statu(request.getStatu())
									.build();
			return convertVariable;
		};
		
	private static final Converter<DoctorEntity,Doctor>
		DOCTOR_ENTITY_TO_DOCTOR_CONVERTER = (context) -> {
			var entity = context.getSource();
			var result = new Doctor.Builder()
							.doctorId(entity.getDoctorId())
							.identityNo(entity.getIdentityNo())
							.birthYear(entity.getBirthYear())
							.gender(entity.getGender())
							.statu(entity.getStatu())
							.specialty(entity.getSpecialty())
							.build();
			return result;
		};
		
	private static final Converter<Doctor, DoctorResponse>
		DOCTOR_TO_DOCTOR_RESPONSE_CONVERTER = context -> new DoctorResponse(
																		context.getSource().getIdentityNo().getIdentityNo(),
																		context.getSource().getFullName().getFirstName(),
																		context.getSource().getFullName().getLastName(),
																		context.getSource().getBirthYear().getBirthYear(),
																		context.getSource().getGender(),
																		context.getSource().getStatu(),
																		context.getSource().getSpecialty());
	
	private static final Converter<Doctor,DoctorEntity>
		DOCTOR_TO_DOCTOR_ENTITY_CONVERTER = context -> new DoctorEntity(
							context.getSource().getIdentityNo().getIdentityNo(),
							context.getSource().getFullName().getFirstName(),
							context.getSource().getFullName().getLastName(),
							context.getSource().getBirthYear().getBirthYear(),
							context.getSource().getGender(),
							context.getSource().getStatu(),
							context.getSource().getSpecialty());
		
	@Bean
	public ModelMapper modelMapper() {
		var modelMapper = new ModelMapper();
		modelMapper.addConverter(DOCTOR_REQUEST_TO_DOCTOR_CONVERTER, 
				DoctorRequest.class, Doctor.class);
		modelMapper.addConverter(DOCTOR_ENTITY_TO_DOCTOR_CONVERTER, 
				DoctorEntity.class, Doctor.class);
		modelMapper.addConverter(DOCTOR_TO_DOCTOR_RESPONSE_CONVERTER, 
				Doctor.class, DoctorResponse.class);
		modelMapper.addConverter(DOCTOR_TO_DOCTOR_ENTITY_CONVERTER, 
				Doctor.class, DoctorEntity.class);
		return modelMapper;
	}
}
