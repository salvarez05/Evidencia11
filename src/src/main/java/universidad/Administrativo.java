package universidad;

public class Administrativo extends PersonalContratado {
	private Departamento departamento;

	public Administrativo(String run, String nombre, EstadoCivil estadoCivil, int añoContratacion) {
		super(run, nombre, estadoCivil, añoContratacion);
	}

	public String getTipo() {
		return "Administrativo";
	}
	@Override
	public String toString() {
		return super.toString();
	}
}