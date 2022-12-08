public class Main {
    private static Grupo grupo;

    public static void main(String[] args) {

        //crear los equipos
    Equipo equipo1 = new Equipo("Alemania", true);
    Equipo equipo2 = new Equipo("Bélgica", false);
    Equipo equipo3 = new Equipo("Qatar", true);
    Equipo equipo4 = new Equipo("Dinamarca", false);
    Equipo equipo5 = new Equipo("Francia", true);
    Equipo equipo6 = new Equipo("Inglaterra", false);
    Equipo equipo7 = new Equipo("México", true);
    Equipo equipo8 = new Equipo("Serbia", false);
    Equipo equipo9 = new Equipo("Arabia Saudita", true);
    Equipo equipo10 = new Equipo("Brasil", false);
    Equipo equipo11 = new Equipo("Corea Del Sur", true);
    Equipo equipo12 = new Equipo("Ecuador", false);
    Equipo equipo13 = new Equipo("Gales", true);
    Equipo equipo14 = new Equipo("Irán", false);
    Equipo equipo15 = new Equipo("Australia", true);
    Equipo equipo16 = new Equipo("Camerún", false);
    Equipo equipo17 = new Equipo("Estados Unidos", true);
    Equipo equipo18 = new Equipo("Ghana", false);
    Equipo equipo19 = new Equipo("Senegal", true);
    Equipo equipo20 = new Equipo("Túnez",false);
    Equipo equipo21 = new Equipo("Cánada", true);
    Equipo equipo22 = new Equipo("Costa Rica", false);
    Equipo equipo23 = new Equipo("Holanda", true);
    Equipo equipo24 = new Equipo("Japón", false);
    Equipo equipo25 = new Equipo("Polonia", true);
    Equipo equipo26 = new Equipo("Uruguay", false);
    Equipo equipo27 = new Equipo("Argentina", true);
    Equipo equipo28 = new Equipo("Croacia", false);
    Equipo equipo29 = new Equipo("España", true);
    Equipo equipo30 = new Equipo("Marruecos", false);
    Equipo equipo31 = new Equipo("Portugal", true);
    Equipo equipo32 = new Equipo("Suiza", false);

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


        //partidos grupo 1
        Resultado resultadoPartido1 = new Resultado(2, 0, true, false);
        Resultado resultadoPartido2 = new Resultado(1, 2, false, false);
        Resultado resultadoPartido3 = new Resultado(4, 0, true, false);
        Resultado resultadoPartido4 = new Resultado(2, 3, false, false);

        //partidos grupo 2
        Resultado resultadoPartido5 = new Resultado(0, 4, false, false);
        Resultado resultadoPartido6 = new Resultado(1, 0, true, false);
        Resultado resultadoPartido7 = new Resultado(3, 0, true, false);
        Resultado resultadoPartido8 = new Resultado(2, 2, false, true);

        //partidos grupo 3
        Resultado resultadoPartido9 = new Resultado(0, 0, false, true);
        Resultado resultadoPartido10 = new Resultado(0, 2, false, false);
        Resultado resultadoPartido11 = new Resultado(0, 0, false, true);
        Resultado resultadoPartido12 = new Resultado(1, 3, false, false);

        //partidos grupo 4
        Resultado resultadoPartido13 = new Resultado(1, 2, false, false);
        Resultado resultadoPartido14 = new Resultado(1, 0, true, false);
        Resultado resultadoPartido15 = new Resultado(0, 1, false, false);
        Resultado resultadoPartido16 = new Resultado(1, 3, false, false);

        //llaves
        Llave llave1 = new Llave();
        Llave llave2 = new Llave();
        Llave llave3 = new Llave();
        Llave llave4 = new Llave();


        //equipos por grupo con mayor puntaje
        //grupo 1: Francia y Serbia
        if (resultadoPartido3.ganoLocal()==true && resultadoPartido4.ganoLocal()==false){
            llave1.addPartido(new Partido(17/12/2022, equipo5, equipo8));
        }

        //grupo 2: Brasil y Gales
        if (resultadoPartido5.ganoLocal()==false && resultadoPartido7.ganoLocal()==true){
            llave2.addPartido(new Partido(18/12/2022, equipo10, equipo13));
        }

        //grupo 3: Túnez y Japón
        if (resultadoPartido10.ganoLocal()==false && resultadoPartido12.ganoLocal()==false){
            llave3.addPartido(new Partido(18/12/2022, equipo10, equipo13));
        }

        //grupo 4: Uruguay y Suiza
        if (resultadoPartido13.ganoLocal()==false && resultadoPartido16.ganoLocal()==false){
            llave4.addPartido(new Partido(18/12/2022, equipo26, equipo32));
        }

    }
}