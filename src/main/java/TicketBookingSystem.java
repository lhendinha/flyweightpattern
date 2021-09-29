import java.io.IOException;

public class TicketBookingSystem {
    public static void main(String args[]) throws IOException {
        Ticket ticket;

        for (int i = 0; i < 5; i++) {
            System.out.println("Creating ticket with type, name and fare...");

            ticket = TicketFactory.getTicket("Type_" + i, "Name_" + i,
                    (int) Math.round(i * 1.34));

            ticket.getTicketInfo();
        }
    }
}