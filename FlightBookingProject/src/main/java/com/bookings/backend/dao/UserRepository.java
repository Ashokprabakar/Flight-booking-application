package com.bookings.backend.dao;

import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;

import com.bookings.backend.entities.Users;

public interface UserRepository extends CrudRepository<Users, BigInteger>{

}