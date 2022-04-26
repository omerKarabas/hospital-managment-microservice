package com.hospitalmanagment.valueobject.appointment;

import java.util.Objects;

import com.hospitalmanagment.annotaions.ValueObject;

@ValueObject
public final class ApointmentId {

	private int appointmentId;

	public static ApointmentId of(int apointmentId) {
		return new ApointmentId(apointmentId);
	}
	private ApointmentId(int appointmentId) {
		super();
		this.appointmentId = appointmentId;
	}

	public int getAppointmentId() {
		return appointmentId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(appointmentId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ApointmentId other = (ApointmentId) obj;
		return appointmentId == other.appointmentId;
	}

	@Override
	public String toString() {
		return "ApointmentId [appointmentId=" + appointmentId + "]";
	}
	
}
