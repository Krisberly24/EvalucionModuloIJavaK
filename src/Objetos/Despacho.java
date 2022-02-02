package Objetos;

public class Despacho
{
	private String direccionBusquedaDelPedido;
	private String direcciónEntrega;
	Preparacion preparacion;
	Cliente cliente;
	Delivery delivery;
	private double precio;
	
	public Despacho(Preparacion preparacion,String direccionBusquedaDelPedido, String direcciónEntrega, Cliente cliente, Delivery delivery, double precio) {
		this.direccionBusquedaDelPedido = direccionBusquedaDelPedido;
		this.delivery = delivery;
		this.preparacion = preparacion;
		this.direcciónEntrega = direcciónEntrega;
		this.cliente = cliente;
		this.precio = precio;
	}

	public String getDireccionBusquedaDelPedido() {
		return direccionBusquedaDelPedido;
	}

	public void setDireccionBusquedaDelPedido(String direccionBusquedaDelPedido) {
		this.direccionBusquedaDelPedido = direccionBusquedaDelPedido;
	}

	public String getDirecciónEntrega() {
		return direcciónEntrega;
	}

	public void setDirecciónEntrega(String direcciónEntrega) {
		this.direcciónEntrega = direcciónEntrega;
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
