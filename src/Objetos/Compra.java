package Objetos;

import java.util.ArrayList;

public class Compra 
{
	private String numero;
	private ArrayList<Producto> producto;
	private double cantidad;
	Mercado mercado;
	public Compra(String numero, ArrayList<Producto> producto, double cantidad, Mercado mercado) {
		super();
		this.numero = numero;
		this.producto = producto;
		this.cantidad = cantidad;
		this.mercado = mercado;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public ArrayList<Producto> getProducto() {
		return producto;
	}
	public void setProducto(ArrayList<Producto> producto) {
		this.producto = producto;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	public Mercado getMercado() {
		return mercado;
	}
	public void setMercado(Mercado mercado) {
		this.mercado = mercado;
	}
	
	
	

}
