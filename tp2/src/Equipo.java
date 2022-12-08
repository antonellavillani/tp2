import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private ArrayList<Partido> partidosJugados;
    private boolean local;

    public String getNombre() {
        return nombre;
    }

    Equipo (String nombre, boolean local){
        this.setNombre(nombre);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Partido> getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(ArrayList<Partido> partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public boolean isLocal() {
        return local;
    }

    public void setLocal(boolean local) {
        this.local = local;
    }
}
