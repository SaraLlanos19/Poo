
package ejercicioparcial;


public class Utilidad {
    
    final int CANTIDAD_ESPACIOS_GARAJE = 9;
    
     public void imprimirMenu(){
        System.out.println("==== MENU ====");
        System.out.println("0.- Salir");
        System.out.println("1.- Mostrar espacios");
        System.out.println("2.- Estacionar vehiculo");
        System.out.println("3.- Retirar vehículo");
        System.out.println("4.- Consulta de ingresos mensuales");
        System.out.println("5.- Consulta proporción autos / motos");
        System.out.println("6.- Listado de matrículas y cuota mensual y tipo vehículo");
        System.out.println("=====================");
    }
     
    public Garaje obtenerEspaciosGaraje(){
        //Creando autos
        Auto auto1 = new Auto(false, false, "renault", 12000, 2500);//120
        Auto auto2 = new Auto(false, true, "suzuki", 13000, 10);//100
        Auto auto3 = new Auto(true, true, "mazda", 13000, 3000);//120
        
        //creando motos
        Moto moto1 = new Moto(true, "yamaha", 15000, 45);//150
        Moto moto2 = new Moto(false, "akt", 10000, 5);//100
        Moto moto3 = new Moto(true, "honda", 17000, 25);//150
        
        Vehiculo[] espaciosGaraje = new Vehiculo[CANTIDAD_ESPACIOS_GARAJE];
        /*espaciosGaraje[0] = auto1;
        espaciosGaraje[1] = auto2;
        espaciosGaraje[2] = auto3;*/
        espaciosGaraje[0] = moto1;
        espaciosGaraje[1] = moto2;
        espaciosGaraje[3] = moto1;
        espaciosGaraje[4] = moto2;
        espaciosGaraje[5] = moto3;
        
        Garaje garaje = new Garaje();
        garaje.setVehiculosParqueados(espaciosGaraje);
        
        return garaje;
    }
    
}
