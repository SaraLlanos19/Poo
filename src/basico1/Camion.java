
/*package basico1;

import ejercicioparcial.Vehiculo;


public class Camion extends Vehiculo{
    String carroceria;
    String tipoCamion;
    double capacidadCarga;
   

    public Camion(String carroceria, String tipoCamion, double capacidadCarga, String marca, double precio, int cilindraje) {
        super(marca, precio, cilindraje);
        this.carroceria = carroceria;
        this.tipoCamion = tipoCamion;
        this.capacidadCarga = capacidadCarga;
        this.calcularImpuestoCirculacion();
       
        
        double cuotaGarajeFinal = 100;
        
        System.out.println("tipo camion " + tipoCamion);
        if("SENCILLO".equals(this.tipoCamion)){
            cuotaGarajeFinal = CUOTAMESGARAJE + (CUOTAMESGARAJE * 0.75);
            
        }
        if("DOBLE".equals(this.tipoCamion)){
            cuotaGarajeFinal = CUOTAMESGARAJE + (CUOTAMESGARAJE * 1.25);//100
        }
        System.out.println("La cuota por mes del garaje del camion es: " + cuotaGarajeFinal);
    }

       void calcularImpuestoCirculacion(){
           
            this.impuestoCirculacion = this.precio * 0.09;
            System.out.println("impuesto ante: " + this.impuestoCirculacion);
            double capacidadAumento = Math.floor(this.capacidadCarga / 5);
            double valorDeMas = capacidadAumento * 10;
            this.impuestoCirculacion = valorDeMas + impuestoCirculacion;
            System.out.println("impuesto despues: " + this.impuestoCirculacion);
        
       
    }
    
}*/
