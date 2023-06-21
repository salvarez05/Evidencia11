package universidad;

public class Persona {
	private String run;
	private String nombre;
	private EstadoCivil estadoCivil;
	public enum EstadoCivil{viudo, casado,soltero}

	public String getRun() {
		return this.run;
	}

	public void setRun(String run) {
		this.run = run;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public EstadoCivil getEstadoCivil() {
		return this.estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Persona(String run, String nombre, EstadoCivil estadoCivil) {
		this.run=run;
		this.nombre=nombre;
		this.estadoCivil=estadoCivil;
	}

}