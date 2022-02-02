package Objetos;

public class Despacho
{
	private String direccionBusquedaDelPedido;
	private String direcci�nEntrega;
	Preparacion preparacion;
	Cliente cliente;
	Delivery delivery;
	private double precio;
	
	public Despacho(Preparacion preparacion,String direccionBusquedaDelPedido, String direcci�nEntrega, Cliente cliente, Delivery delivery, double precio) {
		this.direccionBusquedaDelPedido = direccionBusquedaDelPedido;
		this.delivery = delivery;
		this.preparacion = preparacion;
		this.direcci�nEntrega = direcci�nEntrega;
		this.cliente = cliente;
		this.precio = precio;
	}

	public String getDireccionBusquedaDelPedido() {
		return direccionBusquedaDelPedido;
	}

	public void setDireccionBusquedaDelPedido(String direccionBusquedaDelPedido) {
		this.direccionBusquedaDelPedido = direccionBusquedaDelPedido;
	}

	public String getDirecci�nEntrega() {
		return direcci�nEntrega;
	}

	public void setDirecci�nEntrega(String direcci�nEntrega) {
		this.direcci�nEntrega = direcci�nEntrega;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Preparacion getPreparacion() {
		return preparacion;
	}

	public void setPreparacion(Preparacion preparacion) {
		this.preparacion = preparacion;
	}

	public Delivery getDelivery() {
		return delivery;
	}

	public void setDelivery(Delivery delivery) {
		this.delivery = delivery;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
	
	
	
	

}
