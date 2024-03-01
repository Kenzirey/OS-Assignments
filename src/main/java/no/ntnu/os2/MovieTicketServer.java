package no.ntnu.os2;

public class MovieTicketServer {
	private final String movieName;
	private final int totalSeats;

	public MovieTicketServer(String movieName, int totalSeats) {
		this.movieName = movieName;
		this.totalSeats = totalSeats;
	}

	public void bookTicket(int numberOfSeats) {
		// TODO: Write code

		if ((availableSeats - numberOfSeats) < 0) {
			// TODO: Write code
		}

		// TODO: Write code
	}
}
