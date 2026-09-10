package main.java.com.cineplex.carteleraadministrador.model;

/**
 *
 * @author dbarrientos
 */
public class Ticket {
    
    private String id_ticket;
    private double ticket_price;
    private int id_movie;
    private String id_functions;

    public Ticket(){
    
    }
    
    public Ticket(String id_ticket, double ticket_price, int id_movie, String id_functions) {
        this.id_ticket = id_ticket;
        this.ticket_price = ticket_price;
        this.id_movie = id_movie;
        this.id_functions = id_functions;
    }

    public String getId_ticket() {
        return id_ticket;
    }

    public double getTicket_price() {
        return ticket_price;
    }

    public int getId_movie() {
        return id_movie;
    }

    public String getId_functions() {
        return id_functions;
    }

    public void setId_ticket(String id_ticket) {
        this.id_ticket = id_ticket;
    }

    public void setTicket_price(double ticket_price) {
        this.ticket_price = ticket_price;
    }

    public void setId_movie(int id_movie) {
        this.id_movie = id_movie;
    }

    public void setId_functions(String id_functions) {
        this.id_functions = id_functions;
    }
    
    
    
}
