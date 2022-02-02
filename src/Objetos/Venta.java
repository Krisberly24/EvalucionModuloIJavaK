package Objetos;

public class Venta 
{
	private String numeroVenta;
	Cliente cliente;
	Preparacion preparacion;
	Pedido pedido;
	Despacho despacho;
	
	public Venta(String numeroVenta, Cliente cliente, Preparacion preparacion, Pedido pedido, Despacho despacho) {
		super();
		this.numeroVenta = numeroVenta;
		this.cliente = cliente;
		this.preparacion = preparacion;
		this.pedido = pedido;
		this.despacho = despacho;
	}

	public String getNumeroVenta() {
		return numeroVenta;
	}

	public void setNumeroVenta(String numeroVenta) {
		this.numeroVenta = numeroVenta;
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

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Despacho getDespacho() {
		return despacho;
	}

	public void setDespacho(Despacho despacho) {
		this.despacho = despacho;
	}
	
	

}
