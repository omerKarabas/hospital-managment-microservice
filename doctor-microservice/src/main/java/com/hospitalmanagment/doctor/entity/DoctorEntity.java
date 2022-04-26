package com.hospitalmanagment.doctor.entity;

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
import com.hospitalmanagment.valueobject.Specialty;
import com.hospitalmanagment.valueobject.doctor.Status;

@Entity
@Table(name = "doctors")
public class DoctorEntity {

	@Id
	@Column(name = "doctor_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int doctorId;

	@Column(name = "doctor_identity")
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

	@Column(name = "statu")
	@NotBlank
	private Status statu;

	@Column(name = "specialty")
	@NotBlank
	private Specialty specialty;

	public DoctorEntity(@NotBlank @Min(11) @Max(11) int identityNo, @NotBlank @Min(3) @Max(25) String firstName,
			@NotBlank @Min(2) @Max(25) String lastName, @NotBlank Date birthYear, @NotBlank Gender gender,
			@NotBlank Status statu, @NotBlank Specialty specialty) {
		super();
		this.identityNo = identityNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
		this.gender = gender;
		this.statu = statu;
		this.specialty = specialty;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
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

	public Status getStatu() {
		return statu;
	}

	public void setStatu(Status statu) {
		this.statu = statu;
	}

	public Specialty getSpecialty() {
		return specialty;
	}

	public void setSpecialty(Specialty specialty) {
		this.specialty = specialty;
	}

	@Override
	public int hashCode() {
		return Objects.hash(birthYear, doctorId, firstName, gender, identityNo, lastName, specialty, statu);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DoctorEntity other = (DoctorEntity) obj;
		return Objects.equals(birthYear, other.birthYear) && doctorId == other.doctorId
				&& Objects.equals(firstName, other.firstName) && gender == other.gender
				&& identityNo == other.identityNo && Objects.equals(lastName, other.lastName)
				&& specialty == other.specialty && statu == other.statu;
	}

	@Override
	public String toString() {
		return "DoctorEntity [doctorId=" + doctorId + ", identityNo=" + identityNo + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", birthYear=" + birthYear + ", gender=" + gender + ", statu=" + statu
				+ ", specialty=" + specialty + "]";
	}

}