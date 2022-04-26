package com.hospitalmanagment.event.apointment;

import com.hospitalmanagment.aggreagate.Apointment;

public class ApointmentSaveSuccesfulAndRemove extends ApointmentEvent {

	private final Apointment aponitment;

	public ApointmentSaveSuccesfulAndRemove(Apointment aponitment) {
		super(aponitment.getApointmentId());
		this.aponitment = aponitment;
	}

	public Apointment getAponitment() {
		return aponitment;
	}
}
