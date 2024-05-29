
package ejercicioparcial;

import java.util.Scanner;


public class Menu {
    
    

    static Garaje garaje;
    
    public static void main(String[] args) {
        int opcion = 1;
        Scanner scanner = new Scanner(System.in);
        
        Utilidad u = new Utilidad();
        garaje = u.obtenerEspaciosGaraje();
        
        while(opcion != 0) {
            u.imprimirMenu();
            System.out.print("Por favor, seleccione una opción del menu -->");
            opcion = Integer.parseInt(scanner.nextLine());
        
            if(opcion == 1){
                mostrarEspacios();
            }
            if(opcion == 2){
                estacionarVehiculo();
            }
            if(opcion == 3){
                retirarVehiculo();
            }
            if(opcion == 4){
                consultaIngresosMensuales();
            }
            if(opcion == 5){
                consultaProporcion();
            }
            if(opcion == 6){
                mostrarListado();
            }
            if(opcion == 7){
               // mostrarCamionetasPorTipo();
            }
        }
        
    }
    
    
    static void mostrarEspacios(){
        for (int i = 0; i < garaje.getVehiculosParqueados().length; i++) {
            Vehiculo vehiculoRecorriendo = garaje.getVehiculosParqueados()[i];
            System.out.print("Vehiculo en el espacio "+(i+1)+": ");
            if(vehiculoRecorriendo == null){
                System.out.println("*Vacio");
                continue;
            }
            System.out.println(vehiculoRecorriendo);
        }
        
    }
    static void estacionarVehiculo(){
        //Auto a1 = new Auto(true, true, "", 0, 0);
        Moto m = new Moto(true, "", 0, 0);
        m.setPlaca("asdasdadsas");
        m.setMarca("");
        if(m.placa == null){
           System.out.println("Error no tiene matricula, no se puede estacionar");
           return;
       }
       garaje.estacionarVehiculo(m);
       
       
    }
    
    
    static void retirarVehiculo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingrese el numero del vehiculo que va a retirar: ");
        System.out.print("-->");
        int opcion = Integer.parseInt(scanner.nextLine());
        garaje.getVehiculosParqueados()[opcion-1] = null;
        System.out.println("Retirado exitosamente");
    }
    
    static void consultaIngresosMensuales(){
        double ingresos = garaje.calcularIngresos();
        System.out.println("Los ingresos mensuales son: " + ingresos);
    }
    
    static void consultaProporcion(){
        Moto motoGenerica = new Moto(true, "", 0, 0);
        Auto autoGenerico = new Auto(true, true, "", 0, 0);
        
        
        int cantMotos = garaje.calcularOcupacionPorTipoVehiculo(motoGenerica);
        int cantAutos = garaje.calcularOcupacionPorTipoVehiculo(autoGenerico);
        Camioneta camionetaGenerica = new Camioneta("carga", 2, 2, "", 0, 0);
        int cantCamionetas = garaje.calcularOcupacionPorTipoVehiculo(camionetaGenerica);
        double proporcion1 = Double.valueOf(cantAutos) / Double.valueOf(cantMotos);
        double proporcion2 = Double.valueOf(cantMotos) / Double.valueOf(cantCamionetas);
        double proporcion3 = Double.valueOf(cantAutos) / Double.valueOf(cantCamionetas);
        
        System.out.println("La proporcion entre autos, motos y camionetas es de : " + proporcion1);
         System.out.println("La proporcion entre autos, motos y camionetas es de : " + proporcion2);
          System.out.println("La proporcion entre autos, motos y camionetas es de : " + proporcion3);
    }
    
    
   static void mostrarListado(){
        for (int i = 0; i < garaje.getVehiculosParqueados().length; i++) {
            Vehiculo vehiculoRecorriendo = garaje.getVehiculosParqueados()[i];
            System.out.print("Vehiculo en el espacio "+(i+1)+": ");
            if(vehiculoRecorriendo == null){
                System.out.println("*Vacio");
                continue;
            }
            System.out.println("Matricula: " + vehiculoRecorriendo.getPlaca() + " | "
                    + "Cuota Mensual: "+vehiculoRecorriendo.getCuotaMesGaraje()+" | "
                    + "Tipo Vehiculo: "+vehiculoRecorriendo.getClass().getSimpleName());
            
        }
    }
   /*static void mostrarCamionetasPorTipo(){
       int cantidadPickups = 0, cantidadCarga = 0, cantidadSuv = 0, cantidadOtro =0;
       for(int i = 0; i < garaje.getVehiculosParqueados().length; i++){
          Vehiculo espacioRecorrido = garaje.getVehiculosParqueados()[i];
          if(espacioRecorriendo == null)continue;
          
          if(espacioRecorriendo instanceof Camioneta){
              if(((Camioneta)espacioRecorriendo).tipo.equals("pickup"))cantidadPickups++;
              if(((Camioneta)espacioRecorriendo).tipo.equals("carga"))cantidadCarga++;
              if(((Camioneta)espacioRecorriendo).tipo.equals("suv"))cantidadSuv++;
              if(((Camioneta)espacioRecorriendo).tipo.equals("otro"))cantidadOtro++;
          }
           System.out.println("");
              
          
       }
   }*/
    
}
