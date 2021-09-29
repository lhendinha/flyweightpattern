import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FlyweightTest {
    Ticket ticket;

    @Test
    void testBookingAdult() {
        System.out.println("Running: testBookingAdult");

        ticket = TicketFactory.getTicket("Adult", "Pedro", 10);

        assertEquals(ticket.getName(), "Pedro");
        assertEquals(ticket.getType(), "Adult");
        assertEquals(ticket.getFare(), 10);
    }

    @Test
    void testBookingInfant() {
        System.out.println("Running: testBookingInfant");

        ticket = TicketFactory.getTicket("Infant", "Julia", 50);

        assertEquals(ticket.getName(), "Julia");
        assertEquals(ticket.getType(), "Infant");
        assertEquals(ticket.getFare(), 50);
    }
}
