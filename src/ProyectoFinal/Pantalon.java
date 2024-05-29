
package ProyectoFinal;

public class Pantalon extends Componente {
    private boolean conCremallera;
    //Metodos
    //1 Constrcutor
    public Pantalon(int id, String nombre, String talla, String color, boolean escomunitario, double precio,boolean conCremallera) {
        super(id, nombre, talla, color, escomunitario, precio);
        this.conCremallera = conCremallera;
    }
    //2 GetySet
    public boolean isConCremallera() {
        return conCremallera;
    }
    public void setConCremallera(boolean conCremallera) {
        this.conCremallera = conCremallera;
    }
    //3 toString
    @Override
    public String toString() {
        return super.toString() + "Pantalon {" + "Con Cremallera:" + conCremallera + '}';
   } 

}
