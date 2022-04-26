package com.hospitalmanagment.infra;

import com.hospitalmanagment.event.apointment.ApointmentEvent;

public interface EventPublisher {

	void publish(ApointmentEvent apointmentEvent);
}
