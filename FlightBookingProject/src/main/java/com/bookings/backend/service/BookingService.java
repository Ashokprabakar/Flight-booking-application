package com.bookings.backend.service;

import java.math.BigInteger;
import org.springframework.http.ResponseEntity;

import com.bookings.backend.entities.Booking;

public interface BookingService {

	public ResponseEntity<Booking> createBooking(Booking newBooking);
	public Booking updateBooking(Booking newBooking);
	public String deleteBooking(BigInteger bookingId);
	public Iterable<Booking> displayAllBooking();
	public ResponseEntity<?> findBookingById(BigInteger bookingId);
}
