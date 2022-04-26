package com.hospitalmanagment.doctor.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import com.hospitalmanagment.doctor.dto.DoctorResponse;
import com.hospitalmanagment.doctor.iservice.IDoctorReadableService;
import com.hospitalmanagment.valueobject.BirthYear;
import com.hospitalmanagment.valueobject.FullName;
import com.hospitalmanagment.valueobject.Gender;
import com.hospitalmanagment.valueobject.IdentityNo;
import com.hospitalmanagment.valueobject.Specialty;
import com.hospitalmanagment.valueobject.doctor.DoctorId;
import com.hospitalmanagment.valueobject.doctor.Status;

@RestController
@RequestMapping("/doctorReadable")
@RequestScope
@CrossOrigin
public class DoctorReadableRestController {

	private IDoctorReadableService idoctorReadableService;

	public DoctorReadableRestController(IDoctorReadableService idoctorReadableService) {
		super();
		this.idoctorReadableService = idoctorReadableService;
	}

	@GetMapping("/findAllDoctor")
	public List<DoctorResponse> findAllDoctor (){
		return idoctorReadableService.findAllDoctor();
	}
	
	@GetMapping("/{doctorId}")
	public Optional<DoctorResponse> findDoctorByDoctorId(@PathVariable(name="doctorId") DoctorId doctorId) {
		return idoctorReadableService.findDoctorByDoctorId(doctorId);
	}
	
	@GetMapping("/{identityNo}")
	public Optional<DoctorResponse> findDoctorByIdentityNo(@PathVariable(name="identityNo") IdentityNo identityNo) {
		return  idoctorReadableService.findDoctorByIdentityNo(identityNo);
	}
	
	@GetMapping("/{fullName}")
	public List<DoctorResponse> findDoctorByFullName(@PathVariable(name="fullName") FullName fullName){
		return  idoctorReadableService.findDoctorByFullName(fullName);
	}
	
	@GetMapping("/{firstName}")
	public List<DoctorResponse> findDoctorByFirstName(@PathVariable(name="firstName") String firstName){
		return idoctorReadableService.findDoctorByFirstName(firstName);
	}
	
	public List<DoctorResponse> findDoctorByLastName (@PathVariable(name="lastName") String lastName){
		return idoctorReadableService.findDoctorByLastName(lastName);
	}
	
	@GetMapping("/{gender}")
	public List<DoctorResponse>  findDoctorByGender(@PathVariable(name="gender") Gender gender){
		return idoctorReadableService.findDoctorByGender(gender);
	}
	
	@GetMapping("/{statu}")
	public List<DoctorResponse> findDoctorByStatu(@PathVariable(name="statu") Status statu){
		return idoctorReadableService.findDoctorByStatu(statu);
	}
	
	@GetMapping("/{specialty}")
	public List<DoctorResponse> findDoctorBySpecialty(@PathVariable(name="specialty") Specialty specialty) {
		return idoctorReadableService.findDoctorBySpecialty(specialty);
	}
	
	@GetMapping("/{statu}/{gender}")
	public List<DoctorResponse> findDoctorByStatuAndGender(@PathVariable(name="statu") Status statu,
														   @PathVariable(name="gender") Gender gender){
		return idoctorReadableService.findDoctorByStatuAndGender(statu, gender);
	}
	
	@GetMapping("/{statu}/{birthYear}")
	public List<DoctorResponse> findDoctorByStatuAndBirthYear(@PathVariable(name = "statu") Status statu, 
															  @PathVariable(name = "birthYear") BirthYear birthYear){
		return idoctorReadableService.findDoctorByStatuAndBirthYear(statu, birthYear);
	}
	
	@GetMapping("/{statu}/{specialty}")
	public List<DoctorResponse> findDoctorByStatuAndSpecialty(@PathVariable(name = "statu")  Status statu, 
															  @PathVariable(name="specialty") Specialty specialty){
		return idoctorReadableService.findDoctorByStatuAndSpecialty(statu, specialty);
	}
	
	@GetMapping("/{specialty}/{gender}")
	public List<DoctorResponse> findDoctorBySpecialtyAndGender( @PathVariable(name="specialty") Specialty specialty, 
																@PathVariable(name="gender") Gender gender){
		return idoctorReadableService.findDoctorBySpecialtyAndGender(specialty, gender);
	}
	
	@GetMapping("/{specialty}/{birthYear}")
	public List<DoctorResponse> findDoctorBySpecialtyAndBirthYear(@PathVariable(name="specialty") Specialty specialty, 
																  @PathVariable(name = "birthYear") BirthYear birthYear){
		return idoctorReadableService.findDoctorBySpecialtyAndBirthYear(specialty, birthYear);
	}
	
	@GetMapping("/{statu}/{specialty}/{gender}")
	public List<DoctorResponse> findDoctorByStatuAndSpecialtyAndGender(@PathVariable(name = "statu") Status statu, 
																	   @PathVariable(name="specialty") Specialty specialty, 
																	   @PathVariable(name="gender") Gender gender){
		return idoctorReadableService.findDoctorByStatuAndSpecialtyAndGender(statu, specialty, gender);
	}
}
