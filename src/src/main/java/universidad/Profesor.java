package universidad;

import java.util.ArrayList;

public class Profesor extends PersonalContratado {
	private ArrayList<Asignatura> asignatura = new ArrayList<Asignatura>();
	private Departamento departamento;

	public Profesor(String run, String nombre, EstadoCivil estadoCivil, int añoContratacion) {
		super(run, nombre, estadoCivil, añoContratacion);
	}

	public void setAsignatura(ArrayList<Asignatura> asignatura) {
		this.asignatura = asignatura;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public ArrayList<Asignatura> getAsignatura() {
		return asignatura;
	}

	public String getTipo() {
		return "Profesor";
	}

	@Override
	public String toString() {
		return super.toString();
	}
}