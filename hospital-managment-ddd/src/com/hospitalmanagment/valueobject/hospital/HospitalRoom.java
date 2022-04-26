package com.hospitalmanagment.valueobject.hospital;

import java.util.Objects;

import com.hospitalmanagment.annotaions.Aggreagate;

@Aggreagate
public final class HospitalRoom {

	private int hospitalRoomNumber;
	private int floorNumber;
	private HospitalState hospitalState;

	public static HospitalRoom of(int hospitalRoomNumber, int floorNumber, HospitalState hospitalState) {
		return new HospitalRoom(hospitalRoomNumber, floorNumber, hospitalState);
	}

	private HospitalRoom(int hospitalRoomNumber, int floorNumber, HospitalState hospitalState) {
		super();
		this.hospitalRoomNumber = hospitalRoomNumber;
		this.floorNumber = floorNumber;
		this.hospitalState = hospitalState;
	}

	public int getHospitalRoomNumber() {
		return hospitalRoomNumber;
	}

	public int getFloorNumber() {
		return floorNumber;
	}

	public HospitalState getHospitalState() {
		return hospitalState;
	}

	@Override
	public int hashCode() {
		return Objects.hash(floorNumber, hospitalRoomNumber, hospitalState);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HospitalRoom other = (HospitalRoom) obj;
		return floorNumber == other.floorNumber && hospitalRoomNumber == other.hospitalRoomNumber
				&& hospitalState == other.hospitalState;
	}

	@Override
	public String toString() {
		return "HospitalRoom [hospitalRoomNumber=" + hospitalRoomNumber + ", floorNumber=" + floorNumber
				+ ", hospitalState=" + hospitalState + "]";
	}

}
