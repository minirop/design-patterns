package com.formation.facade;

public class VoyageFacade {
	private Airline airline = new Airline();
	private Hotel hotel = new Hotel();
	private Bus bus = new Bus();

	public void planTrip() {
		airline.bookTicket();
		bus.bookTicket();
		hotel.bookRoom();
	}
}
