package domain;

import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private List<Asignatura> asignaturas;

    public Inscripcion(Alumno alumno, List<Asignatura> asignaturas) {
        this.alumno = alumno;
        this.asignaturas = asignaturas;
    }

    public Boolean aprobada(){
        return asignaturas.stream().allMatch(a->alumno.cumpleCorrelatividades(a));
    }

}
