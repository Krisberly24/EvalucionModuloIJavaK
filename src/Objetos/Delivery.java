package Objetos;

public class Delivery extends Personas
{
	private String telefono;

	public Delivery(String nombre, String apellido, String rut,String telefono ) 
	{
		super(nombre, apellido, rut);
		this.telefono = telefono;
		
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	

}
