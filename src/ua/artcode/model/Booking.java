package ua.artcode.model;

public class Booking {

    private Flight flight;
    private Client client;

    public Booking(Flight flight, Client client) {
        this.flight = flight;
        this.client = client;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
