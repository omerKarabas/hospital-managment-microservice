package com.hospitalmanagment.valueobject.doctor;

import java.util.Objects;

import com.hospitalmanagment.annotaions.ValueObject;

@ValueObject
public final class DoctorId {

	private int doctorId;

	public static DoctorId of(int doctorId) {
		return new DoctorId(doctorId);
	}

	private DoctorId(int doctorId) {
		super();
		this.doctorId = doctorId;
	}

	public int getDoctorId() {
		return doctorId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(doctorId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DoctorId other = (DoctorId) obj;
		return doctorId == other.doctorId;
	}

	@Override
	public String toString() {
		return "DoctorId [doctorId=" + doctorId + "]";
	}

}
