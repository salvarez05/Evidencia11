package universidad;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepartamentoTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void buscarEstudiantesYProfesorAsignatura() {
        Departamento departamentoTest= new Departamento("matematica");
        departamentoTest.añadirAsignatura("matematica");
        departamentoTest.getAsignaturas().get(0).añadirEstudiante("15-3","s", Persona.EstadoCivil.soltero,15319,2019);
        departamentoTest.getAsignaturas().get(0).añadirEstudiante("1432-9","ad", Persona.EstadoCivil.soltero,1432920,2020);
        departamentoTest.añadirProfesor("163-2","a", Persona.EstadoCivil.casado,2019);
        departamentoTest.asignarProfesorAsignatura(departamentoTest.getProfesores().get(0),"matematica");
        departamentoTest.buscarEstudiantesYProfesorAsignatura("matematica");

    }

    @Test
    void añadirProfesor() {
        Departamento departamentoTest= new Departamento("matematica");
        departamentoTest.añadirProfesor("163-2","a", Persona.EstadoCivil.casado,2019);
        assertEquals(1,departamentoTest.getProfesores().size());

    }

    @Test
    void añadirAdministrativo() {
        Departamento departamentoTest= new Departamento("matematica");
        departamentoTest.añadirAdministrativo("163-2","a", Persona.EstadoCivil.casado,2019);
        assertEquals(1,departamentoTest.getAdministrativos().size());
        departamentoTest.añadirAdministrativo("163-2","b", Persona.EstadoCivil.casado,2019);
        assertEquals(1,departamentoTest.getAdministrativos().size());
    }

    @Test
    void añadirAsignatura() {
        Departamento departamentoTest= new Departamento("matematica");
        departamentoTest.añadirAsignatura("matematica");
        assertEquals(1,departamentoTest.getAsignaturas().size());
    }

    @Test
    void asignarProfesorAsignatura() {
        Departamento departamentoTest= new Departamento("matematica");
        departamentoTest.añadirProfesor("163-2","a", Persona.EstadoCivil.casado,2019);
        departamentoTest.añadirProfesor("164-2","b", Persona.EstadoCivil.casado,2019);
        departamentoTest.añadirAsignatura("matematica");
        departamentoTest.asignarProfesorAsignatura(departamentoTest.getProfesores().get(0),"matematica");
        assertTrue(departamentoTest.getProfesores().get(0).getAsignatura().size()==1);
        assertTrue(departamentoTest.getAsignaturas().get(0).getProfesor().getNombre()=="a");
        departamentoTest.asignarProfesorAsignatura(departamentoTest.getProfesores().get(1),"matematica");
        assertTrue(departamentoTest.getAsignaturas().get(0).getProfesor().getNombre()=="a");
    }

    @Test
    void mostrarPersonal() {
        Departamento departamentoTest= new Departamento("matematica");
        departamentoTest.añadirProfesor("163-2","a", Persona.EstadoCivil.casado,2019);
        departamentoTest.añadirProfesor("134-2","b", Persona.EstadoCivil.casado,2018);
        departamentoTest.añadirAdministrativo("143-2","d", Persona.EstadoCivil.casado,2019);
        departamentoTest.mostrarPersonal();
    }
}