
package ProyectoFinal;

public class Chaqueta extends Componente{
    private int numBotones;

    public Chaqueta(int id, String nombre, String talla, String color, boolean escomunitario, double precio, int numBotones) {
        super(id, nombre, talla, color, escomunitario, precio);
        this.numBotones = numBotones;
    }//GetySet
    public int getNumBotones() {
        return numBotones;
    }
    public void setNumBotones(int numBotones) {
        this.numBotones = numBotones;
    }
    //toString
    @Override
    public String toString() {
        return super.toString() + "Chaqueta{" + "Numero de Botones:" + numBotones + '}';
    }
    

    
}
