package com.hospitalmanagment.valueobject.medicine;

import java.util.Date;
import java.util.Objects;

import com.hospitalmanagment.annotaions.ValueObject;

@ValueObject
public final class DateOfValidty {

	private Date dateOfValidty;

	public static DateOfValidty of (Date dateOfValidty) {
		return new DateOfValidty(dateOfValidty);
	}
	private DateOfValidty(Date dateOfValidty) {
		super();
		this.dateOfValidty = dateOfValidty;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dateOfValidty);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DateOfValidty other = (DateOfValidty) obj;
		return Objects.equals(dateOfValidty, other.dateOfValidty);
	}

	@Override
	public String toString() {
		return "DateOfValidty [dateOfValidty=" + dateOfValidty + "]";
	}
	
	
}
