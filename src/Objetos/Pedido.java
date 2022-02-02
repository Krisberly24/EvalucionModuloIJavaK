package Objetos;

import java.util.ArrayList;

public class Pedido
{
	public String codigo;
	private ArrayList<Producto> producto;
	Cliente cliente;
	private String direccionDeEntrega;
	private String comuna;
	
	public Pedido(String codigo, ArrayList<Producto> producto, Cliente cliente, String direccionDeEntrega, String comuna ) {
		this.codigo = codigo;
		this.producto = producto;
		this.cliente = cliente;
		this.direccionDeEntrega = direccionDeEntrega;
		this.comuna = comuna;
	}
	

	public String getComuna() {
		return comuna;
	}


	public void setComuna(String comuna) {
		this.comuna = comuna;
	}


	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public ArrayList<Producto> getProducto() {
		return producto;
	}

	public void setProducto(ArrayList<Producto> producto) {
		this.producto = producto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getDireccionDeEntrega() {
		return direccionDeEntrega;
	}

	public void setDireccionDeEntrega(String direccionDeEntrega) {
		this.direccionDeEntrega = direccionDeEntrega;
	}
	
	
	
	
	
	
	

}
