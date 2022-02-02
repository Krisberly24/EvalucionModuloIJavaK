package Objetos;

public class Preparacion 
{
	Encargado encargado;
	private String estado;
	
	public Preparacion(Encargado encargado, String estado) 
	{
	
		this.encargado = encargado;
		this.estado = estado;
	}

	public Encargado getEncargado() {
		return encargado;
	}

	public void setEncargado(Encargado encargado) {
		this.encargado = encargado;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	

}
