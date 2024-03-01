package no.ntnu.os2;

/**
 * This class represents a client that books tickets for a movie.
 */
public class MovieTicketClient extends Thread {
	private String name;
	private int numberOfTickets;
	private MovieTicketServer server;
	public MovieTicketClient(MovieTicketServer server, String name, int tickets) {
		this.name = name;
		this.server = server;
		this.numberOfTickets = tickets;
	}

	@Override
	public void run() {
		server.bookTicket(numberOfTickets);
		System.out.println(name + " booked " + numberOfTickets + " tickets");
	}

}
