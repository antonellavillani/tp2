public class Resultado {
    private int golesLocal;
    private int golesVisitante;
    private boolean ganoLocal;
    private boolean empate;


    public Resultado (int golesLocal, int golesVisitante, boolean ganoLocal, boolean empate){
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
        this.ganoLocal = ganoLocal;
        this.empate = empate;
    }
    public boolean ganoLocal(){
        return ganoLocal;
    }

    public boolean Empate(){
        return empate;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }
}
