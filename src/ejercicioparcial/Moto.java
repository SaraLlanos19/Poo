
package ejercicioparcial;

public class Moto extends Vehiculo{
    private boolean sideCar;
    

    public Moto(boolean sideCar, String marca, double precio, int cilindraje) {
        super(marca, precio, cilindraje);
        this.sideCar = sideCar;
        
        if(this.sideCar){
            this.calcularImpuestoCirculacion();
            this.cuotaMesGaraje = CUOTAMESGARAJE + (CUOTAMESGARAJE * 0.5);
        }
    }
    

     private void calcularImpuestoCirculacion(){
        this.impuestoCirculacion = (this.precio * 12 )/ 100;
    }
    
    
    
    
}
