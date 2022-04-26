package com.hospitalmanagment.aggreagate;

import java.util.List;
import java.util.Objects;

import com.hospitalmanagment.annotaions.Aggreagate;
import com.hospitalmanagment.valueobject.Specialty;
import com.hospitalmanagment.valueobject.hospital.HospitalId;
import com.hospitalmanagment.valueobject.hospital.HospitalName;
import com.hospitalmanagment.valueobject.hospital.HospitalRoom;

@Aggreagate
public class Hospital {

	private HospitalId hospitalId;
	private HospitalName hospitalName;
	private List<Doctor> doctors;
	private List<Specialty> departments;
	private List<HospitalRoom> hospitalRooms;

	public Hospital(Builder builder) {
		this.hospitalId = builder.hospitalId;
		this.hospitalName = builder.hospitalName;
		this.doctors = builder.doctors;
		this.departments = builder.departments;
		this.hospitalRooms = builder.hospitalRooms;
	}

	public HospitalId getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(HospitalId hospitalId) {
		this.hospitalId = hospitalId;
	}

	public HospitalName getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(HospitalName hospitalName) {
		this.hospitalName = hospitalName;
	}

	public List<Doctor> getDoctors() {
		return doctors;
	}

	public void setDoctors(List<Doctor> doctors) {
		this.doctors = doctors;
	}

	public List<Specialty> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Specialty> departments) {
		this.departments = departments;
	}

	public List<HospitalRoom> getHospitalRooms() {
		return hospitalRooms;
	}

	public void setHospitalRooms(List<HospitalRoom> hospitalRooms) {
		this.hospitalRooms = hospitalRooms;
	}

	@Override
	public int hashCode() {
		return Objects.hash(departments, doctors, hospitalId, hospitalName, hospitalRooms);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hospital other = (Hospital) obj;
		return Objects.equals(departments, other.departments) && Objects.equals(doctors, other.doctors)
				&& Objects.equals(hospitalId, other.hospitalId) && Objects.equals(hospitalName, other.hospitalName)
				&& Objects.equals(hospitalRooms, other.hospitalRooms);
	}

	@Override
	public String toString() {
		return "Hospital [hospitalId=" + hospitalId + ", hospitalName=" + hospitalName + ", doctors=" + doctors
				+ ", departments=" + departments + ", hospitalRooms=" + hospitalRooms + "]";
	}

	public static class Builder {
		private HospitalId hospitalId;
		private HospitalName hospitalName;
		private List<Doctor> doctors;
		private List<Specialty> departments;
		private List<HospitalRoom> hospitalRooms;

		public Builder hospitalId(int hospitalId) {
			this.hospitalId = HospitalId.of(hospitalId);
			return (this);
		}

		public Builder hospitalName(String hospitalName) {
			this.hospitalName = HospitalName.of(hospitalName);
			return (this);
		}

		public Builder doctors(List<Doctor> doctors) {
			this.doctors = doctors;
			return (this);
		}

		public Builder departments(List<Specialty> departments) {
			this.departments = departments;
			return (this);
		}

		public Builder hospitalRooms(List<HospitalRoom> hospitalRooms) {
			this.hospitalRooms = hospitalRooms;
			return (this);
		}

		public Hospital build() {
			// validation
			// business rule
			// constraint
			// invariance

			return new Hospital(this);
		}
	}
}
