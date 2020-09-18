package com.cg.dto;

public class CancelTicketBookingDto {
private String message;

public CancelTicketBookingDto(String message) {
	super();
	this.message = message;
}

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

}
