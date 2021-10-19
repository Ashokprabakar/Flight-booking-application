package com.bookings.backend.service;

import java.math.BigInteger;

import com.bookings.backend.entities.ScheduledFlight;
import com.bookings.backend.exception.RecordNotFoundException;
import com.bookings.backend.exception.ScheduledFlightNotFoundException;

public interface ScheduledFlightService {
	public ScheduledFlight addScheduledFlight(ScheduledFlight scheduledFlight);
	public ScheduledFlight modifyScheduledFlight(ScheduledFlight scheduledFlight);
	public String removeScheduledFlight(BigInteger id) throws RecordNotFoundException;
	public Iterable<ScheduledFlight> viewAllScheduledFlights();
	public ScheduledFlight viewScheduledFlight(BigInteger id) throws ScheduledFlightNotFoundException;
	

}
