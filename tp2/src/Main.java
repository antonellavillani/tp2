public class Main {
    private static Grupo grupo;

    public static void main(String[] args) {

        //crear los equipos
    Equipo equipo1 = new Equipo("Alemania");
    Equipo equipo2 = new Equipo("Bélgica");
    Equipo equipo3 = new Equipo("Qatar");
    Equipo equipo4 = new Equipo("Dinamarca");
    Equipo equipo5 = new Equipo("Francia");
    Equipo equipo6 = new Equipo("Inglaterra");
    Equipo equipo7 = new Equipo("México");
    Equipo equipo8 = new Equipo("Serbia");
    Equipo equipo9 = new Equipo("Arabia Saudita");
    Equipo equipo10 = new Equipo("Brasil");
    Equipo equipo11 = new Equipo("Corea Del Sur");
    Equipo equipo12 = new Equipo("Ecuador");
    Equipo equipo13 = new Equipo("Gales");
    Equipo equipo14 = new Equipo("Irán");
    Equipo equipo15 = new Equipo("Australia");
    Equipo equipo16 = new Equipo("Camerún");
    Equipo equipo17 = new Equipo("Estados Unidos");
    Equipo equipo18 = new Equipo("Ghana");
    Equipo equipo19 = new Equipo("Senegal");
    Equipo equipo20 = new Equipo("Túnez");
    Equipo equipo21 = new Equipo("Cánada");
    Equipo equipo22 = new Equipo("Costa Rica");
    Equipo equipo23 = new Equipo("Holanda");
    Equipo equipo24 = new Equipo("Japón");
    Equipo equipo25 = new Equipo("Polonia");
    Equipo equipo26 = new Equipo("Uruguay");
    Equipo equipo27 = new Equipo("Argentina");
    Equipo equipo28 = new Equipo("Croacia");
    Equipo equipo29 = new Equipo("España");
    Equipo equipo30 = new Equipo("Marruecos");
    Equipo equipo31 = new Equipo("Portugal");
    Equipo equipo32 = new Equipo("Suiza");

    //partidos por grupos o zonas
        Grupo grupo1 = new Grupo("Primera zona");
        grupo1.addPartido(new Partido(1/12/2022, equipo1, equipo2));
        grupo1.addPartido(new Partido(2/12/2022, equipo3, equipo4));
        grupo1.addPartido(new Partido(3/12/2022, equipo5, equipo6));
        grupo1.addPartido(new Partido(4/12/2022, equipo7, equipo8));


        Grupo grupo2 = new Grupo("Segunda zona");
        grupo2.addPartido(new Partido(5/12/2022, equipo9, equipo10));
        grupo2.addPartido(new Partido(6/12/2022, equipo11, equipo12));
        grupo2.addPartido(new Partido(7/12/2022, equipo13, equipo14));
        grupo2.addPartido(new Partido(8/12/2022, equipo15, equipo16));


        Grupo grupo3 = new Grupo("Tercera zona");
        grupo2.addPartido(new Partido(9/12/2022, equipo17, equipo18));
        grupo2.addPartido(new Partido(10/12/2022, equipo19, equipo20));
        grupo2.addPartido(new Partido(11/12/2022, equipo21, equipo22));
        grupo2.addPartido(new Partido(12/12/2022, equipo23, equipo24));


        Grupo grupo4 = new Grupo("Cuarta zona");
        grupo2.addPartido(new Partido(13/12/2022, equipo25, equipo26));
        grupo2.addPartido(new Partido(14/12/2022, equipo27, equipo28));
        grupo2.addPartido(new Partido(15/12/2022, equipo29, equipo30));
        grupo2.addPartido(new Partido(16/12/2022, equipo31, equipo32));
    }
}