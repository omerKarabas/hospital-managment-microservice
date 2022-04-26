package com.hospitalmanagment.doctor.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.hospitalmanagment.doctor.dto.DoctorResponse;
import com.hospitalmanagment.doctor.exception.RestExceptionBase;
import com.hospitalmanagment.doctor.iservice.IDoctorReadableService;
import com.hospitalmanagment.iservice.doctor.IDoctorReadable;
import com.hospitalmanagment.valueobject.BirthYear;
import com.hospitalmanagment.valueobject.FullName;
import com.hospitalmanagment.valueobject.Gender;
import com.hospitalmanagment.valueobject.IdentityNo;
import com.hospitalmanagment.valueobject.Specialty;
import com.hospitalmanagment.valueobject.doctor.DoctorId;
import com.hospitalmanagment.valueobject.doctor.Status;

@Service
public class DoctorReadableService implements IDoctorReadableService {

	private IDoctorReadable idoctorReadable;
	private ModelMapper modelMapper;

	public DoctorReadableService(IDoctorReadable idoctorReadable, ModelMapper modelMapper) {
		super();
		this.idoctorReadable = idoctorReadable;
		this.modelMapper = modelMapper;
	}

	public List<DoctorResponse> findAllDoctor() {

		try {
			var doctors = idoctorReadable.findAllDoctor()
										 .stream()
					                     .map(doc -> modelMapper.map(doc, DoctorResponse.class))
					                     .toList();
			return doctors;
		} catch (Exception e) {
			throw new RestExceptionBase("There is not doctor.", 0);
		}
	}
	
	public Optional<DoctorResponse> findDoctorByDoctorId(DoctorId doctorId) {
		
		try {
			var doctor = idoctorReadable.findDoctorByDoctorId(doctorId);
			var result = modelMapper.map(doctor, DoctorResponse.class);							
			return Optional.of(result);
		} catch (Exception e) {
			throw new RestExceptionBase("There is not doctor with this doctor id.", 1);
		}	
	}
	
	public Optional<DoctorResponse> findDoctorByIdentityNo(IdentityNo identityNo){
		
		try {
			var doctor = idoctorReadable.findDoctorByIdentityNo(identityNo);
			var result = modelMapper.map(doctor, DoctorResponse.class);
			return Optional.of(result);
		} catch (Exception e) {
			throw new RestExceptionBase("There is not doctor with this identity no.", 2);
		}	
	}
	
	public List<DoctorResponse> findDoctorByFullName(FullName fullName) {
		
		try {
			var doctor = idoctorReadable.findDoctorByFullName(fullName)
										.stream()
										.map(doctorFilter -> modelMapper.map(doctorFilter, DoctorResponse.class))
										.toList();
			return doctor;
			
		} catch (Exception e) {
			throw new RestExceptionBase("There is not doctor with this full name.", 3);
		}	
	}
	
	public List<DoctorResponse> findDoctorByFirstName(String firstName){
		
		try {
			var doctors = idoctorReadable.findDoctorByFirstName(firstName)
										 .stream()
										 .map(doctorWithFirstName -> modelMapper.map(doctorWithFirstName, DoctorResponse.class))
										 .toList();
			return doctors;
			
		} catch (Exception e) {
			throw new RestExceptionBase("There is not doctor with this name.", 4);
		}	
	}
	
	public List<DoctorResponse> findDoctorByLastName (String lastName){
		
		try {
			var doctors = idoctorReadable.findDoctorByLastName(lastName)
										 .stream()
										 .map(doctorWithLastName -> modelMapper.map(doctorWithLastName, DoctorResponse.class))
										 .toList();
			return doctors;
			
		} catch (Exception e) {
			throw new RestExceptionBase("There is not doctor with this  last name.", 5);
		}	
	}
	
	public List<DoctorResponse> findDoctorByGender(Gender gender){
		
		try {
			var doctors = idoctorReadable.findDoctorByGender(gender)
										 .stream()
										 .map(doctorWithGender -> modelMapper.map(doctorWithGender, DoctorResponse.class))
										 .toList();
			return doctors;
			
		} catch (Exception e) {
			throw new RestExceptionBase("There is not doctor with this gender.", 6);
		}	
	}
	
	public List<DoctorResponse> findDoctorByStatu(Status statu){
		
		try {
			var doctors = idoctorReadable.findDoctorByStatu(statu)
										 .stream()
										 .map(doctorWithStatu -> modelMapper.map(doctorWithStatu, DoctorResponse.class))
										 .toList();
			return doctors;
			
		} catch (Exception e) {
			throw new RestExceptionBase("There is not doctor with this statu.", 7);
		}	
	}
	
	public List<DoctorResponse> findDoctorBySpecialty(Specialty specialty) {
		
		try {
			var doctors = idoctorReadable.findDoctorBySpecialty(specialty)
										 .stream()
										 .map(doctorWithSpecialty -> modelMapper.map(doctorWithSpecialty, DoctorResponse.class))
										 .toList();
			return doctors;
			
		} catch (Exception e) {
			throw new RestExceptionBase("There is not doctor with this specialty.", 8);
		}	
	}
	
	public List<DoctorResponse> findDoctorByStatuAndGender(Status statu, Gender gender){
		
		try {
			var doctors = idoctorReadable.findDoctorByStatuAndGender(statu, gender)
										 .stream()
										 .map(doctorWithStatuAndGender -> modelMapper.map(doctorWithStatuAndGender, DoctorResponse.class))
										 .toList();
			return doctors;
			
		} catch (Exception e) {
			throw new RestExceptionBase("There is not doctor with this statu and gender.", 9);
		}	
	}
	
	public List<DoctorResponse> findDoctorByStatuAndBirthYear(Status statu, BirthYear birthYear){
		
		try {
			var doctors = idoctorReadable.findDoctorByStatuAndBirthYear(statu, birthYear)
										 .stream()
										 .map(doctorWithStatuAndBirthYear -> modelMapper.map(doctorWithStatuAndBirthYear, DoctorResponse.class))
										 .toList();
			return doctors;
			
		}  catch (Exception e) {
			throw new RestExceptionBase("There is not doctor with this statu and birthyear.", 10);
		}	
	}
	
	public List<DoctorResponse> findDoctorByStatuAndSpecialty(Status statu, Specialty specialty){
		
		try {
			var doctors = idoctorReadable.findDoctorByStatuAndSpecialty(statu, specialty)
										 .stream()
										 .map(DoctorWithStatuAndSpecialty -> modelMapper.map(DoctorWithStatuAndSpecialty, DoctorResponse.class))
										 .toList();
			return doctors;
			
		} catch (Exception e) {
			throw new RestExceptionBase("There is not doctor with this statu and specialty.", 11);
		}	
	}
	
	public List<DoctorResponse> findDoctorBySpecialtyAndGender(Specialty specialty, Gender gender){
		
		try {
			var doctors = idoctorReadable.findDoctorBySpecialtyAndGender(specialty, gender)
										 .stream()
										 .map(doctorWithSpecialtyAndGender -> modelMapper.map(doctorWithSpecialtyAndGender, 
												 											  DoctorResponse.class))
										 .toList();
			return doctors;
			
		} catch (Exception e) {
			throw new RestExceptionBase("There is not doctor with specialty and gender.", 12);
		}	
	}
	
	public List<DoctorResponse> findDoctorBySpecialtyAndBirthYear(Specialty specialty, BirthYear birthYear) {
		
		try {
			var doctors = idoctorReadable.findDoctorBySpecialtyAndBirthYear(specialty, birthYear)
									   .stream()
									   .map(doctorWithSpecialtyAndBirthYear -> modelMapper.map(doctorWithSpecialtyAndBirthYear,
											   												   DoctorResponse.class))
									   .toList();
			return doctors;
			
		}catch (Exception e) {
			throw new RestExceptionBase("There is not doctor with specialty and birthyear.", 12);
		}	
	}
	
	public List<DoctorResponse> findDoctorByStatuAndSpecialtyAndGender(Status statu, Specialty specialty, Gender gender){
		
		try {
			var doctors = idoctorReadable.findDoctorByStatuAndSpecialtyAndGender(statu, specialty, gender)
										 .stream()
										 .map(doctorWithFilter -> modelMapper.map(doctorWithFilter, DoctorResponse.class))
										 .toList();
			return doctors;
			
		} catch (Exception e) {
			throw new RestExceptionBase("There is not doctor with thees statu, specialty and birthyear.", 13);
		}	
	}

}