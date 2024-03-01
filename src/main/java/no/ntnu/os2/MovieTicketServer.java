package no.ntnu.os2;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MovieTicketServer {
	private static final Logger LOGGER = Logger.getLogger(MovieTicketServer.class.getName());

	private final String movieName;
	private final int totalSeats;

	private int availableSeats;

	public MovieTicketServer(String movieName, int totalSeats) {
		this.movieName = movieName;
		this.totalSeats = totalSeats;
		this.availableSeats = totalSeats;
	}

	public synchronized void bookTicket(String name, int numberOfTickets) throws IllegalStateException {
		LOGGER.log(
				Level.INFO,
				"Booker name: {0} | Available seats: {1}",
				new Object[]{name, availableSeats}
		);

		if ((availableSeats - numberOfTickets) < 0) {
			LOGGER.warning("Not enough available seats");
			throw new IllegalStateException("Out of seats");
		} else {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException ie) {
				LOGGER.log(Level.WARNING, "Interrupted", ie);
				Thread.currentThread().interrupt();
			}
			availableSeats -= numberOfTickets;
			LOGGER.log(Level.INFO, "Successfully booked {0} tickets", numberOfTickets);
		}
	}
}
