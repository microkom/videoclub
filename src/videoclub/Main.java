package videoclub;

public class Main {

    public static void main(String[] args) {
        int i;
        /*Crea 1 vector en el que ir introduciendo Series y Videojuegos 10
        posiciones cada uno mínimo. */
        Entregable[] item = new Entregable[20];

        item[0] = new Serie("Star Wars", 7, "Ficción", "George Lucas");
        item[1] = new Serie("Star Trek", 33, "Ficción", "Juanjo");
        item[2] = new Serie("Life", 2, "Policia", "Sandra");
        item[3] = new Serie("The Big Bang Theory", 11, "Comedia", "Miguel A");
        item[4] = new Serie("Blue bloods", 6, "Policia", "Victor");
        item[5] = new Serie("Los Simpsons", 20, "Infantil", "Matt Groening");
        item[6] = new Videojuego("Mario Bros", 8, "Infantil", "Nintendo");
        item[7] = new Videojuego("Ninja Gaiden", 6, "Accion", "Sega");
        item[8] = new Videojuego("Street Fighter", 14, "Accion", "Nintendo");
        item[9] = new Videojuego("Contra", 8, "Accion", "Nintendo");

        //Entrega algunos Videojuegos y Series con el método entregar().
        for (i = 4; i < 7; i++) {
            if (item[i] != null && item[i].isEntregado() == false) {
                item[i].entregar();
            }
        }

        /* Cuenta cuantas Series y Videojuegos hay entregados. Al contarlos,
        devuélvelos */
        //Conteo de series prestadas
        int contador = 0;
        for (i = 0; i < item.length; i++) {
            if (item[i] != null) {
                if (item[i] instanceof Serie) {
                    if (item[i].isEntregado()) {
                        contador++;
                    }
                }
            }
        }
        System.out.println("\tSeries Prestadas = " + contador + "\n");

        //Conteo de Videojuegos prestados
        contador = 0;
        for (i = 0; i < item.length; i++) {
            if (item[i] != null) {
                if (item[i] instanceof Videojuego) {
                    if (item[i].isEntregado()) {
                        contador++;
                    }
                }
            }
        }
        System.out.println("\tVideojuegos Prestados = " + contador + "\n");

        //Conteo de items no prestados
        contador = 0;
        for (i = 0; i < item.length; i++) {
            if (item[i] != null) {
                if (!(item[i].isEntregado())) {
                    contador++;
                }
            }
        }
        System.out.println("\tItems no Prestados = " + contador + "\n");

        //Total items
        contador = 0;
        for (i = 0; i < item.length; i++) {
            if (item[i] != null) {
                contador++;
            }
        }
        System.out.println("\tTotal items  = " + contador + "\n");
        
        //Video juego que tiene más horas
        int mayor=0;
        String videoj="";
        for (i = 0; i < item.length; i++) {
            if (item[i] != null) {
                if (item[i] instanceof Videojuego) {
                    if (((Videojuego)item[i]).getHoras() > mayor) {
                        mayor=((Videojuego)item[i]).getHoras();
                        videoj=((Videojuego)item[i]).getTitulo();
                    }
                }
            }
        }
        System.out.println("El video juego que más horas tiene es "+videoj+" con "+mayor+" horas\n");
        
        mayor=0;
        String series="";
        for (i = 0; i < item.length; i++) {
            if (item[i] != null) {
                if (item[i] instanceof Serie) {
                    if (((Serie)item[i]).getNumTemporadas()> mayor) {
                        mayor=((Serie)item[i]).getNumTemporadas();
                        series=((Serie)item[i]).getTitulo();
                    }
                }
            }
        }
        System.out.println("La serie que más temporadas tiene es "+series+" con "+mayor+" temporadas\n");
        
        
        //Series mostradas por pantalla
        for (i = 0; i < item.length; i++) {
            if (item[i] != null) {
                if (item[i] instanceof Serie) {
                    System.out.println(item[i].toString() + "\n");
                }
            }
        }

        //Videojuegos mostrados por pantalla
        for (i = 0; i < item.length; i++) {
            if (item[i] != null) {
                if (item[i] instanceof Videojuego) {
                    System.out.println(item[i].toString() + "\n");
                }
            }
        }

        /*
        
         */
    }

}
