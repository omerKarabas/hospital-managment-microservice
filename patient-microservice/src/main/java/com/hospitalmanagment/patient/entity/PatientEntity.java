package com.hospitalmanagment.patient.entity;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import com.hospitalmanagment.valueobject.Gender;

@Entity
@Table(name = "patients")
public class PatientEntity {

	@Id
	@Column(name = "patient_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int patientId;
	
	@Column(name = "patient_identity")
	@NotBlank
	@Min(11)
	@Max(11)
	private int identityNo;
	
	@Column(name = "firstname")
	@NotBlank
	@Min(3)
	@Max(25)
	private String firstName;

	@Column(name = "lastname")
	@NotBlank
	@Min(2)
	@Max(25)
	private String lastName;
	
	@Column(name = "birthyear")
	@NotBlank
	private Date birthYear;

	@Column(name = "gender")
	@NotBlank
	private Gender gender;

	public PatientEntity(@NotBlank @Min(11) @Max(11) int identityNo, @NotBlank @Min(3) @Max(25) String firstName,
			@NotBlank @Min(2) @Max(25) String lastName, @NotBlank Date birthYear, @NotBlank Gender gender) {
		super();
		this.identityNo = identityNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
		this.gender = gender;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
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
		return Objects.hash(birthYear, firstName, gender, identityNo, lastName, patientId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PatientEntity other = (PatientEntity) obj;
		return Objects.equals(birthYear, other.birthYear) && Objects.equals(firstName, other.firstName)
				&& gender == other.gender && identityNo == other.identityNo && Objects.equals(lastName, other.lastName)
				&& patientId == other.patientId;
	}

	@Override
	public String toString() {
		return "PatientEntity [patientId=" + patientId + ", identityNo=" + identityNo + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", birthYear=" + birthYear + ", gender=" + gender + "]";
	}
	
	
}
