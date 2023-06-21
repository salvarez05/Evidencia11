package universidad;

import java.util.ArrayList;
import universidad.Profesor;
import universidad.Estudiante;
import universidad.Asignatura;
import universidad.Administrativo;

public class Departamento {
	private String nombre;
	private ArrayList<Profesor> profesores = new ArrayList<Profesor>();
	private ArrayList<Estudiante> estudiante = new ArrayList<Estudiante>();
	private ArrayList<Asignatura> asignaturas = new ArrayList<Asignatura>();
	private ArrayList<Administrativo> administrativos = new ArrayList<Administrativo>();

	public String getNombre() {
		return this.nombre;
	}

	public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
		this.asignaturas= asignaturas;
	}

	public void setAdministrativos(ArrayList<Administrativo> administrativos) {
		this.administrativos = administrativos;
	}

	public ArrayList<Administrativo> getAdministrativos() {
		return administrativos;
	}

	public ArrayList<Asignatura> getAsignaturas() {
		return asignaturas;
	}

	public ArrayList<Estudiante> getEstudiante() {
		return estudiante;
	}

	public ArrayList<Profesor> getProfesores() {
		return profesores;
	}

	public void setEstudiante(ArrayList<Estudiante> estudiante) {
		this.estudiante = estudiante;
	}

	public void setProfesores(ArrayList<Profesor> profesores) {
		this.profesores = profesores;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void buscarEstudiantesYProfesorAsignatura(String nombreAsignatura) {
		for (int i = 0; i < asignaturas.size(); i++) {
			if (asignaturas.get(i).getNombre()==nombre){
				System.out.println("Profesor: "+asignaturas.get(i).getProfesor());
				System.out.println("Estudiantes: ");
				for (int j = 0; j < asignaturas.get(i).getEstudiantes().size(); j++) {
					System.out.println(asignaturas.get(i).getEstudiantes().get(j).toString());
				}
			}
		}
	}
	public void añadirProfesor(String run, String nombre, Persona.EstadoCivil estadoCivil, int añoContratacion){
		if (profesorContratado(run)==false){
			Profesor profesor= new Profesor(run, nombre, estadoCivil, añoContratacion);
			profesores.add(profesor);
		}
	}
	public boolean profesorContratado(String run){
		for (int i = 0; i < profesores.size(); i++) {
			if (profesores.get(i).getRun()==run){
				return true;
			}
		}return false;
	}
	public void añadirAdministrativo(String run, String nombre, Persona.EstadoCivil estadoCivil, int añoContratacion){
		if(administrativoContratado(run)==false){
			Administrativo administrativo= new Administrativo(run, nombre, estadoCivil, añoContratacion);
			administrativos.add(administrativo);
		}
	}
	public boolean administrativoContratado(String run){
		for (int i = 0; i < administrativos.size(); i++) {
			if (administrativos.get(i).getRun()==run){
				return true;
			}
		}return false;
	}
	public void añadirAsignatura(String nombre){
		Asignatura asignatura=new Asignatura(nombre);
		asignaturas.add(asignatura);
	}
	public void asignarProfesorAsignatura(Profesor profesor,String nombreAsignatura){
		for (int i = 0; i < asignaturas.size(); i++) {
			if(asignaturas.get(i).getNombre()==nombreAsignatura){
				if (asignaturas.get(i).getProfesor()==null){
					asignaturas.get(i).setProfesor(profesor);
					profesor.getAsignatura().add(asignaturas.get(i));
				}else{
					System.out.println("La asignatura ya tiene un profesor asignado");
				}
			}
		}
	}

	public void mostrarPersonal() {
		if (profesores.size() != 0) {
			System.out.println("Profesores:");
			for (int i = 0; i < profesores.size(); i++) {
				System.out.println(profesores.get(i).toString());
			}
		}else{
			System.out.println("Este departamento no tiene profesores");
		}
		if (administrativos.size() != 0) {
			System.out.println("Administrativos:");
			for (int i = 0; i < administrativos.size(); i++) {
				System.out.println(administrativos.get(i).toString());
			}
		}else{
			System.out.println("Este departamento no tiene administrativos");
		}
	}

	public Departamento(String nombre) {
		this.nombre=nombre;
	}
}