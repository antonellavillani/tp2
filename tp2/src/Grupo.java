import java.util.ArrayList;

public class Grupo extends EtapaMundial{

    public ArrayList<Equipo> getEquiposQueAvanzan (Equipo equipo){
        return new ArrayList<Equipo>();
    }

    Grupo (String descripcionEtapa){
    this.setEquipos(new ArrayList<Equipo>());
    this.setPartidos(new ArrayList<Partido>());
    }
}
