import java.util.Date;

public class Partido {
    private int fecha;
    private Equipo local;
    private Equipo visitante;
    private Resultado resultado;


    public Partido (int fecha, Equipo local, Equipo visitante){
        this.fecha = fecha;
        this.local = local;
        this.visitante = visitante;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public Equipo getLocal() {
        return local;
    }

    public void setLocal(Equipo local) {
        this.local = local;
    }

    public Equipo getVisitante() {
        return visitante;
    }

    public void setVisitante(Equipo visitante) {
        this.visitante = visitante;
    }

    public Resultado getResultado() {
        return resultado;
    }

    public void setResultado(Resultado resultado) {
        this.resultado = resultado;
    }
}
