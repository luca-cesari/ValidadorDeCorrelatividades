package domain;

import java.util.List;

public class Alumno {

    private List<Asignatura> asignaturasCursadas;

    public Alumno(String nombre, List<Asignatura> asignaturasCursadas) {
        this.asignaturasCursadas = asignaturasCursadas;
    }

    public boolean cumpleCorrelatividades(Asignatura unaAsignatura) {
        return asignaturasCursadas.containsAll(unaAsignatura.getCorrelativas());
    }
}
