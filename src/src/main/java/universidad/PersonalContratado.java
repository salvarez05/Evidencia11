package universidad;

public abstract class PersonalContratado extends Persona {
	private int añoContratacion;
	private String tipo;

	public int getAñoContratacion() {
		return this.añoContratacion;
	}

	public void setAñoContratacion(int añoContratacion) {
		this.añoContratacion = añoContratacion;
	}

	public abstract String getTipo();

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public PersonalContratado(String run, String nombre, EstadoCivil estadoCivil, int añoContratacion) {
		super(run, nombre, estadoCivil);
		this.añoContratacion=añoContratacion;
	}
	@Override
	public String toString() {
		return getTipo()+" "+getNombre()+ " rut: "+getRun()+" "+getEstadoCivil()+" contratado en "+getAñoContratacion();
	}
}