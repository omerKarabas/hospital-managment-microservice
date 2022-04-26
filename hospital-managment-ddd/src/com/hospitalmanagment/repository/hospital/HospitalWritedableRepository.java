package com.hospitalmanagment.repository.hospital;

import java.util.List;
import java.util.Optional;

import com.hospitalmanagment.aggreagate.Doctor;
import com.hospitalmanagment.aggreagate.Hospital;
import com.hospitalmanagment.valueobject.IdentityNo;
import com.hospitalmanagment.valueobject.Specialty;
import com.hospitalmanagment.valueobject.doctor.DoctorId;
import com.hospitalmanagment.valueobject.hospital.HospitalId;
import com.hospitalmanagment.valueobject.hospital.HospitalName;
import com.hospitalmanagment.valueobject.hospital.HospitalRoom;

public interface HospitalWritedableRepository {

	Optional<Hospital> addHospital(Hospital hospital);
	Optional<Doctor> addDoctor(Doctor doctor);
	Optional<HospitalRoom> addHospitalRoom(HospitalRoom hospitalRoom);
	Optional<Specialty> addDepartments(Specialty specialty);
	
	Optional<Hospital> removeHospitalById(HospitalId hospitalId);
	Optional<Hospital> removeHospitalByName(HospitalName hospitalName);
	Optional<Doctor>  removeDoctorByDoctorId(HospitalId hospitalId,DoctorId doctorId);
	Optional<Doctor> removeDocotorByIdentityNo(HospitalId hospitalId,IdentityNo identityNo);
	Optional<HospitalRoom> removeHospitalRoomById(HospitalId hospitalId, int hospitalRoomNumber);
	Optional<HospitalRoom> removeHospitalRoom(HospitalId hospitalId,HospitalRoom hospital);
	List<HospitalRoom> removeAllHospitalRoom(HospitalId hospitalId);
	List<Doctor> removeAllDoctor(HospitalId hospitalId);
	List<Specialty> removeAllDepartments(HospitalId hospitalId);
	Optional<Specialty> removeDepartments(HospitalId hospitalId, Specialty specialty);
	
	Optional<Hospital> updateHospitalName(HospitalId hospitalId, HospitalName hospitalName);
	Optional<HospitalRoom> updateHospitalRoomNameById(HospitalId hospitalId, HospitalRoom hospitalRoom);
	Optional<Doctor> updateDoctorInformetionByIdentityNo(HospitalId hospitalId, Doctor doctor);
	
}
