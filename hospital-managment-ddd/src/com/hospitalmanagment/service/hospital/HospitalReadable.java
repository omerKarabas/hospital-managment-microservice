package com.hospitalmanagment.service.hospital;

import java.util.List;
import java.util.Optional;

import com.hospitalmanagment.aggreagate.Hospital;
import com.hospitalmanagment.iservice.hospital.IHosppitalReadable;
import com.hospitalmanagment.repository.hospital.HospitalReadableRepository;
import com.hospitalmanagment.valueobject.Specialty;
import com.hospitalmanagment.valueobject.hospital.HospitalId;
import com.hospitalmanagment.valueobject.hospital.HospitalName;
import com.hospitalmanagment.valueobject.hospital.HospitalRoom;
import com.hospitalmanagment.valueobject.hospital.HospitalState;

public class HospitalReadable implements IHosppitalReadable {

	private HospitalReadableRepository hospitalReadableRepository;

	public HospitalReadable(HospitalReadableRepository hospitalReadableRepository) {
		super();
		this.hospitalReadableRepository = hospitalReadableRepository;
	}

	@Override
	public List<Hospital> findAllHospital() {
		var hospitals = hospitalReadableRepository.findAllHospital();
		return hospitals;
	}

	@Override
	public Optional<Hospital> findHospitalById(HospitalId hospitalId) {
		var hospitalById = hospitalReadableRepository.findHospitalById(hospitalId);
		return hospitalById;
	}

	@Override
	public Optional<Hospital> findHospitalByName(HospitalName hospitalName) {
		var hospitalByName = hospitalReadableRepository.findHospitalByName(hospitalName);
		return hospitalByName;
	}

	@Override
	public Optional<Hospital> findHospitalByDepartment(Specialty specialty) {
		var hospitalByDepartment = hospitalReadableRepository.findHospitalByDepartment(specialty);
		return hospitalByDepartment;
	}

	@Override
	public Optional<Hospital> findHospitalByRoom(HospitalRoom hospitalRoom) {
		var hospitalByRoom = hospitalReadableRepository.findHospitalByRoom(hospitalRoom);
		return hospitalByRoom;
	}

	@Override
	public Optional<Hospital> findHospitalByRoomWithFloor(int floorNumber) {
		var hospitalRoomWtihFloor = hospitalReadableRepository.findHospitalByRoomWithFloor(floorNumber);
		return hospitalRoomWtihFloor;
	}

	@Override
	public List<Hospital> findHospitalByRoomWithState(HospitalState hospitalState) {
		var findHospitalRoom= hospitalReadableRepository.findHospitalByRoomWithState(hospitalState);
		return findHospitalRoom;
	}

}
