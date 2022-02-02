package Objetos;

public class Encargado extends Personas {

	private String tipoDeEncargado;
	public Encargado(String nombre, String apellido, String rut, String tipoDeEncargado) {
		super(nombre, apellido, rut);
		this.tipoDeEncargado = tipoDeEncargado;
	}
	public String getTipoDeEncargado() {
		return tipoDeEncargado;
	}
	public void setTipoDeEncargado(String tipoDeEncargado) {
		this.tipoDeEncargado = tipoDeEncargado;
	}
	

}
