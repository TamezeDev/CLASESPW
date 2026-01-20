import controller.Registrador;
import model.Equipo;
import model.Partido;

public class Main {
    static void main() {
        Equipo equipo1 = new Equipo("Equipo 1");
        Equipo equipo2 = new Equipo("Equipo 2");
        Equipo equipo3 = new Equipo("Equipo 3");
        Equipo equipo4 = new Equipo("Equipo 4");

        Partido partido1 = new Partido(equipo1, 2, 3, equipo2);
        Partido partido2 = new Partido(equipo1, 4, 3, equipo3);
        Partido partido3 = new Partido(equipo1, 1, 1, equipo4);
        Partido partido4 = new Partido(equipo2, 2, 1, equipo4);

        Registrador liga1 = new Registrador();
        liga1.anadirPartido(partido1);
        liga1.anadirPartido(partido2);
        liga1.anadirPartido(partido3);
        liga1.anadirPartido(partido4);

        liga1.mostrarPartidos();
        liga1.mostrarEstadisticas("Equipo 1");

    }
}
