package com.hospitalmanagment.repository.hospital;

import java.util.List;
import java.util.Optional;

import com.hospitalmanagment.aggreagate.Hospital;
import com.hospitalmanagment.valueobject.Specialty;
import com.hospitalmanagment.valueobject.hospital.HospitalId;
import com.hospitalmanagment.valueobject.hospital.HospitalName;
import com.hospitalmanagment.valueobject.hospital.HospitalRoom;
import com.hospitalmanagment.valueobject.hospital.HospitalState;

public interface HospitalReadableRepository {

	List<Hospital> findAllHospital();
	Optional<Hospital> findHospitalById(HospitalId hospitalId);
	Optional<Hospital> findHospitalByName(HospitalName hospitalName);
	Optional<Hospital> findHospitalByDepartment(Specialty specialty);
	Optional<Hospital> findHospitalByRoom(HospitalRoom hospitalRoom);
	Optional<Hospital> findHospitalByRoomWithFloor(int floorNumber);
	List<Hospital> findHospitalByRoomWithState(HospitalState hospitalState);
}
