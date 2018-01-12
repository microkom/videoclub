package videoclub;

public class Videojuego extends Entregable {
    
    //Sus atributos son titulo, horas estimadas, entregado, genero y compañia.
    
    private int horas;
    private String company;
    
    public Videojuego(String titulo, int horas, String genero, String company){
        super(titulo,genero);
        this.horas=horas;
        this.company=company;
    }
    
    //
    /*
    Crearemos una clase Videojuego con las siguientes características:
 
 Por defecto, las horas estimadas serán de 10 horas, genero accion y
entregado false.
 Los constructores que se implementaran serán:
o Un constructor con el titulo y la compañia. El resto por
defecto.
o Un constructor con todos los atributos, excepto de
entregado.
 Los métodos que se implementara serán:
o Métodos get de todos los atributos, excepto de entregado.
o Métodos set de todos los atributos, excepto de entregado.
o Método toString
    */
}
