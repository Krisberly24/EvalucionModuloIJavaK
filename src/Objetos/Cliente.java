package Objetos;

public class Cliente extends Personas
{
	
	private String telefono;
	private String direccion;
	
	public Cliente(String nombre, String apellido, String rut, String telefono,String direccion) 
	{
		super(nombre, apellido, rut);
		this.telefono = telefono;
		this.direccion = direccion;
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
