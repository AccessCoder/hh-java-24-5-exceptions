package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void checkTickets_shouldThrowException() {
        //Möglichkeit 1
        try {
            Main.checkTickets();
            fail();
        } catch (TicketException e) {
            assertTrue(true);
        }
        //Möglichkeit 2
        assertThrows(TicketException.class, () -> Main.checkTickets());

    }
}