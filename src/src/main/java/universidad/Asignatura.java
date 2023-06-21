package universidad;

import java.util.ArrayList;

public class Asignatura {
	private String nombre;
	private Profesor profesor;
	private ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Asignatura(String nombre) {
		this.nombre=nombre;
	}

	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public Profesor getProfesor() {
		return profesor;
	}
	public void añadirEstudiante(String run, String nombre, Persona.EstadoCivil estadoCivil, int matricula, int añoMatricula){
		Estudiante estudiante = new Estudiante(run, nombre, estadoCivil, matricula, añoMatricula);
		getEstudiantes().add(estudiante);
	}

}