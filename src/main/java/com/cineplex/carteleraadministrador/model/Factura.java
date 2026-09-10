package main.java.com.cineplex.carteleraadministrador.model;

import java.time.LocalDateTime;

/**
 *
 * @author dbarrientos
 */

public class Factura {
    
    private String id_factura;
    private String id_usuario;
    private String id_ticket;
    private double monto;
    private LocalDateTime fecha;

    public Factura(){
        
    }
    
    public Factura(String id_factura, String id_usuario, String id_ticket, double monto, LocalDateTime fecha) {
        this.id_factura = id_factura;
        this.id_usuario = id_usuario;
        this.id_ticket = id_ticket;
        this.monto = monto;
        this.fecha = fecha;
    }

    public String getId_factura() {
        return id_factura;
    }

    public String getId_usuario() {
        return id_usuario;
    }

    public String getId_ticket() {
        return id_ticket;
    }

    public double getMonto() {
        return monto;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setId_factura(String id_factura) {
        this.id_factura = id_factura;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public void setId_ticket(String id_ticket) {
        this.id_ticket = id_ticket;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
    
    
    
}
