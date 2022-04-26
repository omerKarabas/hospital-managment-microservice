package com.hospitalmanagment.valueobject;

import java.util.Objects;

import com.hospitalmanagment.annotaions.ValueObject;

@ValueObject
public final class IdentityNo {

	private int identityNo;

	public static IdentityNo of (int identityNo) {
		return new IdentityNo(identityNo);
	}
	private IdentityNo(int identityNo) {
		super();
		this.identityNo = identityNo;
	}

	public int getIdentityNo() {
		return identityNo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(identityNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IdentityNo other = (IdentityNo) obj;
		return identityNo == other.identityNo;
	}

	@Override
	public String toString() {
		return "IdentityNo [identityNo=" + identityNo + "]";
	}
	
	
}
