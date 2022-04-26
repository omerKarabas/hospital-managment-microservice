package com.hospitalmanagment.doctor.adapter;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.hospitalmanagment.aggreagate.Doctor;
import com.hospitalmanagment.doctor.entity.DoctorEntity;
import com.hospitalmanagment.doctor.repository.DoctorEntityReadableRepository;
import com.hospitalmanagment.repository.doctor.DoctorReadableRepository;
import com.hospitalmanagment.valueobject.BirthYear;
import com.hospitalmanagment.valueobject.FullName;
import com.hospitalmanagment.valueobject.Gender;
import com.hospitalmanagment.valueobject.IdentityNo;
import com.hospitalmanagment.valueobject.Specialty;
import com.hospitalmanagment.valueobject.doctor.DoctorId;
import com.hospitalmanagment.valueobject.doctor.Status;

@Component
public class DoctorReadableRepositorySpringDataAdapter implements DoctorReadableRepository {

	private DoctorEntityReadableRepository doctorEntityReadableRepository;
	private ModelMapper modelMapper;

	public DoctorReadableRepositorySpringDataAdapter(DoctorEntityReadableRepository doctorEntityReadableRepository,
			ModelMapper modelMapper) {
		super();
		this.doctorEntityReadableRepository = doctorEntityReadableRepository;
		this.modelMapper = modelMapper;
	}

	@Override
	public List<Doctor> findAllDoctor() {
		List<Doctor> doctors = doctorEntityReadableRepository.findAll()
															 .stream()
															 .map(doctor -> modelMapper.map(doctor, Doctor.class))
															 .toList();
		return doctors;
	}

	@Override
	public Optional<Doctor> findDoctorByDoctorId(DoctorId doctorId) {
		var doctor = doctorEntityReadableRepository.findById(doctorId.getDoctorId());
		if (doctor.isEmpty())
			return Optional.empty();
		return Optional.of(modelMapper.map(doctor, Doctor.class));

	}

	@Override
	public Optional<Doctor> findDoctorByIdentityNo(IdentityNo identityNo) {
		var doctor = doctorEntityReadableRepository.findById(identityNo.getIdentityNo());
		if (doctor.isEmpty())
			return Optional.empty();
		return Optional.of(modelMapper.map(doctor, Doctor.class));
	}

	@Override
	public List<Doctor> findDoctorByFullName(FullName fullName) {
		
		Predicate<DoctorEntity> isFirstName = doctorWithFirstName -> doctorWithFirstName.getFirstName().equals(fullName.getFirstName());
		Predicate<DoctorEntity> isLastName = doctorWithLastName -> doctorWithLastName.getLastName().equals(fullName.getLastName());
		
		var doctors = doctorEntityReadableRepository.findAll() 
													.stream()
													.filter(isFirstName.and(isLastName))
													.map(doctorList -> modelMapper.map(doctorList, Doctor.class))
													.toList();	
		return doctors;
	}

	@Override
	public List<Doctor> findDoctorByFirstName(String firstName) {
		var doctors = doctorEntityReadableRepository.findAll()
									                .stream()
									                .filter(doctorFirstName -> doctorFirstName.getFirstName().equals(firstName))
									                .map(doctorList -> modelMapper.map(doctorList, Doctor.class))
													.toList();	
									                
		return doctors;
	}

	@Override
	public List<Doctor> findDoctorByLastName(String lastName) {
		var doctors = doctorEntityReadableRepository.findAll()
                .stream()
                .filter(doctorLastName -> doctorLastName.getLastName().equals(lastName))
                .map(doctorList -> modelMapper.map(doctorList, Doctor.class))
				.toList();
		return doctors;
	}

	@Override
	public List<Doctor> findDoctorByGender(Gender gender) {
		var doctors = doctorEntityReadableRepository.findAll()
													.stream()
													.filter(doctorGender -> doctorGender.getGender().equals(gender))
													.map(doctorList -> modelMapper.map(doctorList, Doctor.class))
													.toList();
		return doctors;
	}

	@Override
	public List<Doctor> findDoctorByStatu(Status statu) {
		var doctors = doctorEntityReadableRepository.findAll()
													.stream()
													.filter(doctorStatu -> doctorStatu.getStatu().equals(statu))
													.map(doctorList -> modelMapper.map(doctorList, Doctor.class))
													.toList();
		return doctors;
	}

	@Override
	public List<Doctor> findDoctorBySpecialty(Specialty specialty) {
		var doctors = doctorEntityReadableRepository.findAll()
													.stream()
													.filter(doctorSpecialty -> doctorSpecialty.getSpecialty().equals(specialty))
													.map(doctorList -> modelMapper.map(doctorList, Doctor.class))
													.toList();
		return doctors;
	}

	@Override
	public List<Doctor> findDoctorByStatuAndGender(Status statu, Gender gender) {
		
		Predicate<DoctorEntity> isStatu = doctor -> doctor.getStatu()==statu;
		Predicate<DoctorEntity> isGender = doctorWithGender -> doctorWithGender.getGender().equals(gender);
		
		var doctors = doctorEntityReadableRepository.findAll()
													.stream()
													.filter(isStatu.and(isGender))
													.map(doctorList -> modelMapper.map(doctorList, Doctor.class))
													.toList();
		return doctors;

	}

	@Override
	public List<Doctor> findDoctorByStatuAndBirthYear(Status statu, BirthYear birthYear) {
		
		Predicate<DoctorEntity> isStatu = doctor -> doctor.getStatu().equals(statu);
		Predicate<DoctorEntity> isBirthYear = doctorWithBirthYear -> doctorWithBirthYear.getBirthYear().equals(birthYear.getBirthYear());;
		
		var doctors = doctorEntityReadableRepository.findAll()
						                            .stream()
						                            .filter(isStatu.and(isBirthYear))
						                        	.map(doctorList -> modelMapper.map(doctorList, Doctor.class))
													.toList();
		return doctors;
	}

	@Override
	public List<Doctor> findDoctorByStatuAndSpecialty(Status statu, Specialty specialty) {
		
		Predicate<DoctorEntity> isStatu = doctor -> doctor.getStatu().equals(statu);
		Predicate<DoctorEntity> isSpecialty = doctorWithSpecialty -> doctorWithSpecialty.getSpecialty().equals(specialty);
		
		var doctors = doctorEntityReadableRepository.findAll()
									                .stream()
									                .filter(isStatu.and(isSpecialty))
									            	.map(doctorList -> modelMapper.map(doctorList, Doctor.class))
													.toList();
		return doctors;
	}

	@Override
	public List<Doctor> findDoctorBySpecialtyAndGender(Specialty specialty, Gender gender) {
		
		Predicate<DoctorEntity> isSpecialty = doctorWithSpecialty -> doctorWithSpecialty.getSpecialty().equals(specialty);
		Predicate<DoctorEntity> isGender = doctorWithGender -> doctorWithGender.getGender().equals(gender);
		
		var doctors = doctorEntityReadableRepository.findAll()
									                .stream()
									                .filter(isSpecialty.and(isGender))
									            	.map(doctorList -> modelMapper.map(doctorList, Doctor.class))
													.toList();
		return doctors;
	}

	@Override
	public List<Doctor> findDoctorBySpecialtyAndBirthYear(Specialty specialty, BirthYear birthYear) {
		
		Predicate<DoctorEntity> isSpecialty = doctorWithSpecialty -> doctorWithSpecialty.getSpecialty().equals(specialty);
		Predicate<DoctorEntity> isBirthYear = doctorWithBirthYear -> doctorWithBirthYear.getBirthYear().equals(birthYear.getBirthYear());
		
		var doctors = doctorEntityReadableRepository.findAll()
									                .stream()
									                .filter(isSpecialty.and(isBirthYear))
									            	.map(doctorList -> modelMapper.map(doctorList, Doctor.class))
													.toList();
		return doctors;
	}

	@Override
	public List<Doctor> findDoctorByStatuAndSpecialtyAndGender(Status statu, Specialty specialty, Gender gender) {
		
		Predicate<DoctorEntity> isStatu = doctor -> doctor.getStatu().equals(statu);
		Predicate<DoctorEntity> isSpecialty = doctorWithSpecialty -> doctorWithSpecialty.getSpecialty().equals(specialty);
		Predicate<DoctorEntity> isGender = doctorWithGender -> doctorWithGender.getGender().equals(gender);
		
		var doctors = doctorEntityReadableRepository.findAll()
									                .stream()
									                .filter(isStatu.and(isGender).and(isSpecialty))
									            	.map(doctorList -> modelMapper.map(doctorList, Doctor.class))
													.toList();
		return doctors;
	}

}
