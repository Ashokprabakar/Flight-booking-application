package com.bookings.backend.dao;

import java.math.BigInteger;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bookings.backend.entities.Schedule;

@Repository
public interface ScheduleRepository extends CrudRepository<Schedule, BigInteger> {

}
