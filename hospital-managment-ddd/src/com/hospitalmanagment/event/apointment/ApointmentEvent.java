package com.hospitalmanagment.event.apointment;

import java.time.ZonedDateTime;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

import com.hospitalmanagment.valueobject.appointment.ApointmentId;

public class ApointmentEvent {

	private static AtomicLong counter = new AtomicLong();
	private final String eventId;
	private final ZonedDateTime dateTime;
	private final long orderId;
	private final ApointmentId apointmentId;

	public ApointmentEvent(ApointmentId apointmentId) {
		this.eventId = UUID.randomUUID().toString();
		this.dateTime = ZonedDateTime.now();
		this.orderId = counter.getAndIncrement();
		this.apointmentId= apointmentId; 
	}

	public static AtomicLong getCounter() {
		return counter;
	}

	public String getEventId() {
		return eventId;
	}

	public ZonedDateTime getDateTime() {
		return dateTime;
	}

	public long getOrderId() {
		return orderId;
	}

	public ApointmentId getApointmentId() {
		return apointmentId;
	}
	

}
