package in.flightTicketBooking.service;

import java.util.List;

import in.flightTicketBooking.model.Flight;

public interface FlightService {	
	int saveFlight(Flight flight);
	Flight getFlight(String from, String to);
	List<Flight> list();
	boolean updateFlight(Flight flight);
	boolean deleteFlight(Flight flight);
}
