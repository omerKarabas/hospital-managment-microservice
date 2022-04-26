package com.hospitalmanagment.valueobject;

import com.hospitalmanagment.annotaions.ValueObject;

@ValueObject
public enum Specialty {
	GENARALMEDICINE(0),HEARTHDISAEASES(1),NEOROSURGEY(2),CHILD(3);

	int specialtyCode;

	private Specialty(int specialtyCode) {
		this.specialtyCode = specialtyCode;
	}
	
}
