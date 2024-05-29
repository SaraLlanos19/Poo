
package ProyectoFinal;

public class Falda extends Componente{
    private boolean conCremallera;
    //Metodos
    //1 Constructor
    public Falda(int id, String nombre, String talla, String color, boolean escomunitario, double precio,boolean conCremallera) {
        super(id, nombre, talla, color, escomunitario, precio);
        this.conCremallera = conCremallera;
    }
    //2 SetyGet
    public boolean isConCremallera() {
        return conCremallera;
    }
    public void setConCremallera(boolean conCremallera) {
        this.conCremallera = conCremallera;
    }
    //3 toString

    @Override
    public String toString() {
        return super.toString() + " Falda{" + "Con Cremallera: " + conCremallera + ", }";
    }
    

    
}
