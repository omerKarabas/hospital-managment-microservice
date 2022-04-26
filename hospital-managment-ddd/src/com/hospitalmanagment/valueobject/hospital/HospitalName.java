package com.hospitalmanagment.valueobject.hospital;

import java.util.Objects;

import com.hospitalmanagment.annotaions.ValueObject;

@ValueObject
public final class HospitalName {

	private String hospitalName;

	public static HospitalName of (String hospitalName) {
		return new HospitalName(hospitalName);
	}
	private HospitalName(String hospitalName) {
		super();
		this.hospitalName = hospitalName;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(hospitalName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HospitalName other = (HospitalName) obj;
		return Objects.equals(hospitalName, other.hospitalName);
	}

	@Override
	public String toString() {
		return "HospitalName [hospitalName=" + hospitalName + "]";
	}
	
	
	
}
