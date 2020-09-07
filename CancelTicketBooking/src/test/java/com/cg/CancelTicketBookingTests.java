package com.cg;

import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.entity.Booking;
import com.cg.exception.InvalidBookingException;

import com.cg.service.CancelTicketBookingService;

@SpringBootTest
class CancelTicketBookingTests {
@Autowired
	private CancelTicketBookingService service;
@Test
public void testCancelBooking() throws InvalidBookingException { }
	 
}

