package domain;

import java.util.List;

public class Asignatura {

    private String nombre;
    private List<Asignatura> correlativas;


    public Asignatura(String nombre, List<Asignatura> correlativas) {
        this.nombre = nombre;
        this.correlativas = correlativas;
    }

    public List<Asignatura> getCorrelativas() {
        return correlativas;
    }
}
