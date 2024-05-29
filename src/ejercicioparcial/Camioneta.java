
package ejercicioparcial;

public final class Camioneta extends Vehiculo{
    String tipo;
    int numeroPasajeros;
    int cantidadEjes;

    public Camioneta(String tipo, int numeroPasajeros, int cantidadEjes, String marca, double precio, int cilindraje) {
        super(marca, precio, cilindraje);
        this.tipo = tipo;
        this.numeroPasajeros = numeroPasajeros;
        this.cantidadEjes = cantidadEjes;
        
        this.calcularImpuestoCirculacion();
        this.calcularCuotaGaraje();
        
        if(this.tipo.equals("pickup") || this.tipo.equals("carga")){
            if(this.numeroPasajeros > 2){
                System.out.println("Cantidad pasajeros: "+ this.numeroPasajeros);
                System.out.println("Error, no se puede guardar mas de dos pasajeros en pickup y carga" ); 
            }
        }
    }

    void calcularImpuestoCirculacion(){
        this.impuestoCirculacion = this.precio * 0.05;
    }
     
    void calcularCuotaGaraje(){
        this.cuotaMesGaraje = CUOTAMESGARAJE;
        if(this.cantidadEjes == 2){
            this.cuotaMesGaraje = CUOTAMESGARAJE + (CUOTAMESGARAJE * 0.75);
            System.out.println("La couta del mes es: " + this.cuotaMesGaraje);
        }
        if(this.cantidadEjes > 2){
            this.cuotaMesGaraje = CUOTAMESGARAJE + (CUOTAMESGARAJE * 1.00);
            System.out.println("La cuota del mes es: " + this.cuotaMesGaraje);
        }
    }

   
     
    
}
