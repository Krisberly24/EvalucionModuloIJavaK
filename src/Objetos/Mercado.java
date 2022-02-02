package Objetos;

public class Mercado 
{
	private String nombre;
	private int numeroLocal;
	private String telefono;
	private String direccion;
	
	public Mercado(String nombre, int numeroLocal, String telefono, String direccion) {

		this.nombre = nombre;
		this.numeroLocal = numeroLocal;
		this.telefono = telefono;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroLocal() {
		return numeroLocal;
	}

	public void setNumeroLocal(int numeroLocal) {
		this.numeroLocal = numeroLocal;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	

	
	
	

}
