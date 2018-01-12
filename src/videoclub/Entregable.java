
package videoclub;

public class Entregable {
    
    protected final static boolean ENTREGADO_DEF = false;
    
    private String titulo;
    private boolean entregado;
    private String genero;
    
    public Entregable(String titulo, boolean entregado, String genero){
        this.titulo = titulo;
        this.entregado = entregado;
        this.genero = genero;
    }
    public Entregable(String titulo){
        this.titulo = titulo;
        this.genero = "accion"; 
        this.entregado = false;
    }
    public Entregable(String titulo,String genero){
        this.titulo = titulo;
        this.genero = genero; 
        this.entregado = false;
    }
    public Entregable(){
        this.titulo="";
        this.genero="";
        this.entregado=false;
    }
    public String getTitulo() {
        return this.titulo;
    }
    public boolean isEntregado() {
        return this.entregado;
    }
    public String getGenero() {
        return this.genero;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
