package ar.edu.unlp.objetos.uno.ejercicio2;

public class Balanza {
	
	private Integer cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;

	// Constructor para asegurar que empieza en 0
	public Balanza() {
		this.ponerEnCero();
	}

	public Integer getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public double getPesoTotal() {
		return pesoTotal;
	}

	public void ponerEnCero() {
		this.cantidadDeProductos = 0;
		this.pesoTotal = 0;
		this.precioTotal = 0; 
	}
	
	public void agregarProducto(Producto prod) {
		this.pesoTotal += prod.getPeso();
		this.precioTotal += prod.getPrecio();
		this.cantidadDeProductos++;
	}
	
	public Ticket emitirTicket() {
		return new Ticket(this.cantidadDeProductos, this.pesoTotal, this.precioTotal);
	}
}
