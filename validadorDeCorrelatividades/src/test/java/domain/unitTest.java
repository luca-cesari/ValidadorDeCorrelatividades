package domain;

import domain.Alumno;
import domain.Asignatura;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
public class unitTest {

    @Test
    public void inscripcionAprobada(){

        List<Asignatura> correlADS = new ArrayList<>();
        Asignatura analisisDeSistemas = new Asignatura("ADS", correlADS);

        List<Asignatura> correlSYO = new ArrayList<>();
        Asignatura SYO = new Asignatura("SYO", correlSYO);

        List<Asignatura> correlDDS = new ArrayList<>();
        correlDDS.add(analisisDeSistemas);
        correlDDS.add(SYO);
        Asignatura DisenioDeSistemas = new Asignatura("DDS",correlDDS);

        List<Asignatura> asigCursadasXLuca = new ArrayList<>();
        asigCursadasXLuca.add(analisisDeSistemas);
        asigCursadasXLuca.add(SYO);
        Alumno luca = new Alumno("Luca", asigCursadasXLuca);
        

        List<Asignatura> asigAInscribirse = new ArrayList<>();
        asigAInscribirse.add(DisenioDeSistemas);
        Inscripcion unaInscripcionCorrecta = new Inscripcion(luca, asigAInscribirse);

        Assert.assertTrue(unaInscripcionCorrecta.aprobada());


    }
    @Test
    public void inscripcionFallida(){

        List<Asignatura> correlADS = new ArrayList<>();
        Asignatura analisisDeSistemas = new Asignatura("ADS", correlADS);

        List<Asignatura> correlSYO = new ArrayList<>();
        Asignatura SYO = new Asignatura("SYO", correlSYO);

        List<Asignatura> correlDDS = new ArrayList<>();
        correlDDS.add(analisisDeSistemas);
        correlDDS.add(SYO);
        Asignatura DisenioDeSistemas = new Asignatura("DDS",correlDDS);

        List<Asignatura> asigCursadasXMateo = new ArrayList<>();
        asigCursadasXMateo.add(analisisDeSistemas);
        Alumno mateo = new Alumno("Mateo", asigCursadasXMateo);

        List<Asignatura> asigAInscribirse = new ArrayList<>();
        asigAInscribirse.add(DisenioDeSistemas);
        Inscripcion unaInscripcionFallida = new Inscripcion(mateo, asigAInscribirse);

        Assert.assertFalse(unaInscripcionFallida.aprobada());

    }

}
