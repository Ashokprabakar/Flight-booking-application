package com.bookings.backend.service;

import java.math.BigInteger;
import org.springframework.http.ResponseEntity;

import com.bookings.backend.entities.Flight;

public interface FlightService {
	public ResponseEntity<Flight> addFlight(Flight flight);
	public Iterable<Flight> viewAllFlight();
	public Flight viewFlight(BigInteger flightNumber);
	public Flight modifyFlight(Flight flight);
	public String removeFlight(BigInteger flightNumber);

}