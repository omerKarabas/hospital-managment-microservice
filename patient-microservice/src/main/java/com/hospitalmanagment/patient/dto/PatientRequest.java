package com.hospitalmanagment.patient.dto;

import java.util.Date;
import java.util.Objects;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import com.hospitalmanagment.valueobject.Gender;

public class PatientRequest {

	@NotBlank
	@Min(11)
	@Max(11)
	private int identityNo;

	@NotBlank
	@Min(3)
	@Max(25)
	private String firstName;

	@NotBlank
	@Min(2)
	@Max(25)
	private String lastName;

	@NotBlank
	private Date birthYear;

	@NotBlank
	private Gender gender;

	public PatientRequest(@NotBlank @Min(11) @Max(11) int identityNo, @NotBlank @Min(3) @Max(25) String firstName,
			@NotBlank @Min(2) @Max(25) String lastName, @NotBlank Date birthYear, @NotBlank Gender gender) {
		super();
		this.identityNo = identityNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
		this.gender = gender;
	}

	public int getIdentityNo() {
		return identityNo;
	}

	public void setIdentityNo(int identityNo) {
		this.identityNo = identityNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(Date birthYear) {
		this.birthYear = birthYear;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public int hashCode() {
		return Objects.hash(birthYear, firstName, gender, identityNo, lastName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PatientRequest other = (PatientRequest) obj;
		return Objects.equals(birthYear, other.birthYear) && Objects.equals(firstName, other.firstName)
				&& gender == other.gender && identityNo == other.identityNo && Objects.equals(lastName, other.lastName);
	}

	@Override
	public String toString() {
		return "PatientRequest [identityNo=" + identityNo + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", birthYear=" + birthYear + ", gender=" + gender + "]";
	}

	
	
}
