package com.cg.service;

import com.cg.exception.InvalidBookingException;

public interface CancelTicketBookingService {
	public boolean deleteBooking(String bookingId)throws InvalidBookingException;

}
