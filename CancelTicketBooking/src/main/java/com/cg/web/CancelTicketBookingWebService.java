package com.cg.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cg.exception.InvalidBookingException;
import com.cg.service.CancelTicketBookingService;
import com.cg.util.ErrorConstants;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class CancelTicketBookingWebService {
@Autowired
CancelTicketBookingService bookingService;

@DeleteMapping(ErrorConstants.SEARCH_URL)
public boolean deleteBooking(@PathVariable String bookingId) throws InvalidBookingException {

		return bookingService.deleteBooking(bookingId);
}
}
