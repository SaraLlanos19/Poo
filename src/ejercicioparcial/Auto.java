
package ejercicioparcial;

public class Auto extends Vehiculo{
    boolean tieneRadio;
    boolean tieneNavegador;

    public Auto(boolean tieneRadio, boolean tieneNavegador, String marca, double precio, int cilindraje) {
        super(marca, precio, cilindraje);
        this.tieneRadio = tieneRadio;
        this.tieneNavegador = tieneNavegador;
        this.calcularImpuestoCirculacion();
        if(this.cilindraje > 2499){
            this.cuotaMesGaraje = CUOTAMESGARAJE + (CUOTAMESGARAJE * 0.2);
        }
    }

    
    private void calcularImpuestoCirculacion(){
        double porcentajeInicial = 2;
        double porcentajeCalculado = 0;
        if(this.tieneRadio){
           porcentajeCalculado = porcentajeInicial + 1;
        }
        if(this.tieneNavegador){
            porcentajeCalculado = (porcentajeInicial + 2) + porcentajeCalculado;
        }
        if(this.tieneRadio == false && this.tieneNavegador == false){
            porcentajeCalculado = porcentajeInicial;
        }
        this.impuestoCirculacion = (this.precio * porcentajeCalculado)/100;
       
    }
    
    
}
