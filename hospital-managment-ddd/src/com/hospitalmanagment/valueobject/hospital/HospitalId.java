package com.hospitalmanagment.valueobject.hospital;

import java.util.Objects;

import com.hospitalmanagment.annotaions.ValueObject;

@ValueObject
public final class HospitalId {

	private int hospitalRoom;

	public static HospitalId of(int hospitalRoom) {
		return new HospitalId(hospitalRoom);
	}
	private HospitalId(int hospitalRoom) {
		super();
		this.hospitalRoom = hospitalRoom;
	}

	public int getHospitalRoom() {
		return hospitalRoom;
	}

	public void setHospitalRoom(int hospitalRoom) {
		this.hospitalRoom = hospitalRoom;
	}

	@Override
	public int hashCode() {
		return Objects.hash(hospitalRoom);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HospitalId other = (HospitalId) obj;
		return hospitalRoom == other.hospitalRoom;
	}

	@Override
	public String toString() {
		return "HospitalId [hospitalRoom=" + hospitalRoom + "]";
	}
	
	
}
