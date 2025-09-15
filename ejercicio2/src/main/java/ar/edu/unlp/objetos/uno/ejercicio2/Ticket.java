package ar.edu.unlp.objetos.uno.ejercicio2;

import java.time.LocalDate;

public class Ticket {
    private LocalDate fecha;
    private Integer cantidadDeProductos;
    private double pesoTotal;
    private double precioTotal;
    
    public Ticket(Integer cantidadDeProductos, double pesoTotal, double precioTotal) {
        this.fecha = LocalDate.now();
        this.cantidadDeProductos = cantidadDeProductos;
        this.pesoTotal = pesoTotal;
        this.precioTotal = precioTotal;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Integer getCantidadDeProductos() {
        return cantidadDeProductos;
    }

    public double getPesoTotal() {
        return pesoTotal;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }


    public double impuesto() {
        return this.precioTotal * 0.21;
    }
}
