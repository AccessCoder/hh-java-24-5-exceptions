package org.example;



public class Main {
    public static void main(String[] args)  {
        try {
            organizeZooTrip();
        }catch (TicketException e){
            System.out.println("Probleme mit den Tickets: "  + e.getMessage());
        }catch (RuntimeException e){
            System.out.println("Unerwartbarer Fehler: " + e.getMessage());
        }

    }


    public static void organizeZooTrip() throws TicketException {
        System.out.println("Lehrer: Organisiere den Ausflug...");
        prepareChildren();
        driveToZoo();
        checkTickets();
        System.out.println("Lehrer: Ausflug erfolgreich!");
    }


    public static void prepareChildren() {
        System.out.println("Eltern: Kinder werden vorbereitet...");
        if (Math.random() > 0.6) {
            throw new RuntimeException("Ein Kind hat die Schuhe vergessen!");
        }
        System.out.println("Eltern: Kinder sind bereit.");
    }


    public static void driveToZoo() {
        System.out.println("Busfahrer: Fährt zum Zoo...");
        if (Math.random() > 0.6) {
            throw new RuntimeException("Der Bus hat eine Panne!");
        }
        System.out.println("Busfahrer: Bus ist sicher angekommen.");
    }


    public static void checkTickets() throws TicketException {
        System.out.println("Zoo-Mitarbeiter: Überprüft die Tickets...");
        if (Math.random() > 0.6) {
            throw new TicketException("Ein Ticket ist ungültig!");
        }
        System.out.println("Zoo-Mitarbeiter: Alle Tickets sind gültig.");
    }
}