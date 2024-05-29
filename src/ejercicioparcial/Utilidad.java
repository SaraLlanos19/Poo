
package ejercicioparcial;


public class Utilidad {
    
    final int CANTIDAD_ESPACIOS_GARAJE = 10;
    
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
        auto1.setPlaca("45ef85");
        auto1.setMarca("Renault");
        Auto auto2 = new Auto(false, true, "suzuki", 13000, 10);//100
        auto2.setPlaca("as78ed");
        auto2.setMarca("suzuki");
        //Auto auto3 = new Auto(true, true, "mazda", 13000, 3000);//120
        //auto3.setPlaca("845det");
        //auto3.setMarca("mazda");
        
        //creando motos
        //Moto moto1 = new Moto(true, "yamaha", 15000, 45);//150
        //moto1.setPlaca("sj85nj");
        //moto1.setMarca("yamaha");
        Moto moto2 = new Moto(false, "akt", 10000, 5);//100
        moto2.setPlaca("wq74cv");
        moto2.setMarca("akt");
        //Moto moto3 = new Moto(true, "honda", 17000, 25);//150
        //moto3.setPlaca("abc859");
        //moto3.setMarca("honda");
        
        //creando camionetas
        Camioneta c1 = new Camioneta("carga",2, 2, "", 17000, 45);
        Camioneta c2 = new Camioneta("pickup", 2, 3, "", 15000, 41);
        Camioneta c3 = new Camioneta("pickup", 2, 3, "", 15000, 41);
        Camioneta c4 = new Camioneta("pickup", 2, 3, "", 15000, 41);
        Vehiculo[] espaciosGaraje = new Vehiculo[CANTIDAD_ESPACIOS_GARAJE];
        espaciosGaraje[0] = auto1;
        espaciosGaraje[1] = auto2;
        //espaciosGaraje[2] = auto3;
        //espaciosGaraje[3] = moto1;
        espaciosGaraje[4] = moto2;
        //espaciosGaraje[5] = moto3;
        espaciosGaraje[6] = c1;
        espaciosGaraje[7] = c2;
        espaciosGaraje[8] = c3;
        espaciosGaraje[9] = c4;
        
        
        
        Garaje garaje = new Garaje();
        garaje.setVehiculosParqueados(espaciosGaraje);
        
        return garaje;
    }
    
}
