package com.hospitalmanagment.service.hospital;

import java.util.List;
import java.util.Optional;

import com.hospitalmanagment.aggreagate.Doctor;
import com.hospitalmanagment.aggreagate.Hospital;
import com.hospitalmanagment.iservice.hospital.IHospitalWritedable;
import com.hospitalmanagment.repository.hospital.HospitalWritedableRepository;
import com.hospitalmanagment.valueobject.IdentityNo;
import com.hospitalmanagment.valueobject.Specialty;
import com.hospitalmanagment.valueobject.doctor.DoctorId;
import com.hospitalmanagment.valueobject.hospital.HospitalId;
import com.hospitalmanagment.valueobject.hospital.HospitalName;
import com.hospitalmanagment.valueobject.hospital.HospitalRoom;

public class HospitalWrittedable  implements IHospitalWritedable{

	private HospitalWritedableRepository hospitalWritedableRepository;
	
	public HospitalWrittedable(HospitalWritedableRepository hospitalWritedableRepository) {
		super();
		this.hospitalWritedableRepository = hospitalWritedableRepository;
	}

	@Override
	public Optional<Hospital> addHospital(Hospital hospital) {
		var addedHospital = hospitalWritedableRepository.addHospital(hospital); 
		return addedHospital;
	}

	@Override
	public Optional<Doctor> addDoctor(Doctor doctor) {
		var addedDoctor = hospitalWritedableRepository.addDoctor(doctor);
		return addedDoctor;
	}

	@Override
	public Optional<HospitalRoom> addHospitalRoom(HospitalRoom hospitalRoom) {
		var addHospitalRoom = hospitalWritedableRepository.addHospitalRoom(hospitalRoom);
		return addHospitalRoom;
	}

	@Override
	public Optional<Specialty> addDepartments(Specialty specialty) {
		var addDepartments = hospitalWritedableRepository.addDepartments(specialty);
		return addDepartments;
	}

	@Override
	public Optional<Hospital> removeHospitalById(HospitalId hospitalId) {
		var removedHospital= hospitalWritedableRepository.removeHospitalById(hospitalId);
		return removedHospital;
	}

	@Override
	public Optional<Hospital> removeHospitalByName(HospitalName hospitalName) {
		var removeHospitalWithName = hospitalWritedableRepository.removeHospitalByName(hospitalName);
		return removeHospitalWithName;
	}

	@Override
	public Optional<Doctor> removeDoctorByDoctorId(HospitalId hospitalId, DoctorId doctorId) {
		var removeDoctor = hospitalWritedableRepository.removeDoctorByDoctorId(hospitalId, doctorId);
		return removeDoctor;
	}

	@Override
	public Optional<Doctor> removeDocotorByIdentityNo(HospitalId hospitalId, IdentityNo identityNo) {
		var removeDoctor = hospitalWritedableRepository.removeDocotorByIdentityNo(hospitalId, identityNo);
		return removeDoctor;
	}

	@Override
	public Optional<HospitalRoom> removeHospitalRoomById(HospitalId hospitalId, int hospitalRoomNumber) {
		var removeHospitalRoom = hospitalWritedableRepository.removeHospitalRoomById(hospitalId, hospitalRoomNumber);
		return removeHospitalRoom;
	}

	@Override
	public Optional<HospitalRoom> removeHospitalRoom(HospitalId hospitalId, HospitalRoom hospital) {
		var removeHospitalRoom = hospitalWritedableRepository.removeHospitalRoom(hospitalId, hospital);
		return removeHospitalRoom;
	}

	@Override
	public List<HospitalRoom> removeAllHospitalRoom(HospitalId hospitalId) {
		var removeHospitalRooms = hospitalWritedableRepository.removeAllHospitalRoom(hospitalId);
		return removeHospitalRooms;
	}

	@Override
	public List<Doctor> removeAllDoctor(HospitalId hospitalId) {
		var removeDoctors = hospitalWritedableRepository.removeAllDoctor(hospitalId);
		return removeDoctors;
	}

	@Override
	public List<Specialty> removeAllDepartments(HospitalId hospitalId) {
		var removeAllDepartment = hospitalWritedableRepository.removeAllDepartments(hospitalId);
		return removeAllDepartment;
	}

	@Override
	public Optional<Specialty> removeDepartments(HospitalId hospitalId, Specialty specialty) {
		var removeDepartment = hospitalWritedableRepository.removeDepartments(hospitalId, specialty);
		return removeDepartment;
	}

	@Override
	public Optional<Hospital> updateHospitalName(HospitalId hospitalId, HospitalName hospitalName) {
		var updatedHospitalName= hospitalWritedableRepository.updateHospitalName(hospitalId, hospitalName);
		return updatedHospitalName;
	}

	@Override
	public Optional<HospitalRoom> updateHospitalRoomNameById(HospitalId hospitalId, HospitalRoom hospitalRoom) {
		var updatedHospitalRoom = hospitalWritedableRepository.updateHospitalRoomNameById(hospitalId, hospitalRoom);
		return updatedHospitalRoom;
	}

	@Override
	public Optional<Doctor> updateDoctorInformetionByIdentityNo(HospitalId hospitalId, Doctor doctor) {
		var updatedDoctor = hospitalWritedableRepository.updateDoctorInformetionByIdentityNo(hospitalId, doctor);
		return updatedDoctor;
	}

}
