
package ProyectoFinal;

import java.util.ArrayList;

public class Traje implements Comparable<Traje> {
    
    ArrayList<Componente> piezas;
    String nombre;
    
    //Constructor vacio 
    public Traje() {}
    
    //GetySet
    public ArrayList<Componente> getPiezas() {
        return piezas;
    }
    public void setPiezas(ArrayList<Componente> piezas) {
        this.piezas = piezas;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //toString
    @Override
    public String toString() {
        return "Traje{" + "Piezas: " + piezas + ", Nombre:" + nombre + '}';
    }  

    public int compareTo(Traje traje) {
        return nombre.compareTo(traje.getNombre());
    }
    
    

    
}
