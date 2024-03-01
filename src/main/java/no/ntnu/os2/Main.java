package no.ntnu.os2;

import no.ntnu.os2.MovieTicketServer;
import no.ntnu.os2.MovieTicketClient;
public class Main {

	public static void main(String[] args) {
		MovieTicketServer server = new MovieTicketServer("Troll", 10);
		Thread t1 = new MovieTicketClient(server, "Xiangming", 3);
		Thread t2 = new MovieTicketClient(server, "Ilaria", 2);
		Thread t3 = new MovieTicketClient(server, "Sam", 3);
		Thread t4 = new MovieTicketClient(server, "Andreas", 4);

		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}
}
