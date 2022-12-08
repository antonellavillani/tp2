import java.lang.reflect.Array;
import java.util.ArrayList;

public class EtapaMundial {
    private String descripcionEtapa;
    private ArrayList<Partido> partidos;


    public EtapaMundial(){

    }

    public String getDescripcionEtapa() {
        return descripcionEtapa;
    }

    public void addPartido (Partido partido){

    }

    public ArrayList <Partido> getPartido (Partido partido){
        return new ArrayList<Partido>();
    }

    public ArrayList <Equipo> getEquiposQueAvanzan (Equipo equipo){
        return new ArrayList<Equipo>();
    }

    public void setDescripcionEtapa(String descripcionEtapa) {
        this.descripcionEtapa = descripcionEtapa;
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
    }
}
