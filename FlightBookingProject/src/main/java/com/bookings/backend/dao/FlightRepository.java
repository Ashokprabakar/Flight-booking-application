package com.bookings.backend.dao;

import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bookings.backend.entities.Flight;
@Repository
public interface FlightRepository extends CrudRepository<Flight,BigInteger>{

}
