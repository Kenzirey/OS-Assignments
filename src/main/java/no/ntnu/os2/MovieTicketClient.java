package no.ntnu.os2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class represents a client that books tickets for a movie.
 */
public class MovieTicketClient extends Thread {
	private static final Logger LOGGER = Logger.getLogger(MovieTicketClient.class.getName());

	private final String name;
	private final int numberOfTickets;
	private final MovieTicketServer server;

	public MovieTicketClient(MovieTicketServer server, String name, int tickets) {
		this.name = name;
		this.server = server;
		this.numberOfTickets = tickets;
	}

	@Override
	public void run() {
		server.bookTicket(name, numberOfTickets);
		LOGGER.log(Level.INFO, "{0} booked {1} tickets", new Object[]{name, numberOfTickets});
	}

}
