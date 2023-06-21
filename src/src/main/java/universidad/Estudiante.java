package universidad;

import java.util.ArrayList;
import universidad.Asignatura;

public class Estudiante extends Persona {
	private int añoMatricula;
	private int matricula;
	private ArrayList<Asignatura> cursoInscrito = new ArrayList<Asignatura>();

	public Estudiante(String run, String nombre, EstadoCivil estadoCivil, int matricula, int añoMatricula) {
		super(run, nombre, estadoCivil);
		this.matricula=matricula;
		this.añoMatricula=añoMatricula;
	}

	public int getAñoMatricula() {
		return this.añoMatricula;
	}

	public void setAñoMatricula(int añoMatricula) {
		this.añoMatricula = añoMatricula;
	}

	public int getMatricula() {
		return this.matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Estudiante "+getNombre()+" matricula: "+getMatricula()+" matriculado en "+getAñoMatricula();
	}
}