package com.hospitalmanagment.valueobject;

import java.util.Date;
import java.util.Objects;

import com.hospitalmanagment.annotaions.ValueObject;

@ValueObject
public final class BirthYear {

	private Date birthYear;

	public static BirthYear of(Date birthYear) {
		return new BirthYear(birthYear);
	}
	
	private BirthYear(Date birthYear) {
		this.birthYear = birthYear;
	}

	public Date getBirthYear() {
		return birthYear;
	}

	@Override
	public int hashCode() {
		return Objects.hash(birthYear);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BirthYear other = (BirthYear) obj;
		return Objects.equals(birthYear, other.birthYear);
	}

	@Override
	public String toString() {
		return "BirthYear [birthYear=" + birthYear + "]";
	}
	
	
}
