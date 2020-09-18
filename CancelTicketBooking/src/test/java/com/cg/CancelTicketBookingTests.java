package com.cg;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.dao.BookingDao;
import com.cg.entity.Booking;
import com.cg.exception.InvalidBookingException;

@SpringBootTest

class CancelTicketBookingTests {
	@Autowired
	private  BookingDao bookingDao;
@Test
public void TC_FMS_Ser_03() throws InvalidBookingException {
	Optional<Booking> findBookingById = bookingDao.findById("BK88990067877");
	//Booking booking=findBookingById.get();
	//Assertions.assertTrue(deleteBybookingId(null));
}
}

