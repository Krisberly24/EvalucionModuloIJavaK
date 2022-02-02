package Objetos;

public class Producto 
{
	private String nombre;
	private String tipoDeproducto;
	private String cantidad;
	private double precio;
	
	public Producto(String nombre, String tipoDeproducto, String cantidad,double precio) {
		this.nombre = nombre;
		this.tipoDeproducto = tipoDeproducto;
		this.cantidad = cantidad;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoDeproducto() {
		return tipoDeproducto;
	}

	public void setTipoDeproducto(String tipoDeproducto) {
		this.tipoDeproducto = tipoDeproducto;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	
	
	

}
