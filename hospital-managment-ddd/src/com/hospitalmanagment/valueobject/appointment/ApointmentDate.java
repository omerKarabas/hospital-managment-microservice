package com.hospitalmanagment.valueobject.appointment;

import java.util.Date;
import java.util.Objects;

import com.hospitalmanagment.annotaions.ValueObject;

@ValueObject
public final class ApointmentDate {

	private Date apointmentDate;

	public static ApointmentDate of (Date apointmentDate) {
		return new ApointmentDate(apointmentDate);
	}
	private ApointmentDate(Date apointmentDate) {
		super();
		this.apointmentDate = apointmentDate;
	}

	public Date getApointmentDate() {
		return apointmentDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apointmentDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ApointmentDate other = (ApointmentDate) obj;
		return Objects.equals(apointmentDate, other.apointmentDate);
	}

	@Override
	public String toString() {
		return "ApointmentDate [apointmentDate=" + apointmentDate + "]";
	}

}
