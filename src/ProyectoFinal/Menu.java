
package ProyectoFinal;

import java.util.Scanner;
/**
 * 
 * Equipo conformado por:
 * Angela Maria Pizo Rojas
 * Sara Sofia Llanos Morea
 */
public class Menu {
    public static void main(String[] args)throws Exception {
        int opcion = 1;
        Scanner scanner = new Scanner(System.in);
        
        FabricadeTrajes fabrica = new FabricadeTrajes();
        
        //fabrica.insertarDatosDeEnsayo();
        
        while(opcion != 9){
            fabrica.escribirMenu();
            System.out.print("Por favor, seleccione una opción del menú ---> ");
            opcion = Integer.parseInt(scanner.nextLine());
            
            if(opcion == 1){
                System.out.println("-----");
                fabrica.anadirComponenteAAlmacen();
            }
            if(opcion == 2){
                System.out.println("-----");
                fabrica.listarComponentes();
            }
            if(opcion == 3){
                System.out.println("-----");
                fabrica.anadirTrajeAAlmacen();
            }
            if(opcion == 4){
                System.out.println("-----");
                fabrica.listarTrajes();
            }
            if(opcion == 5){
                System.out.println("-----");
                fabrica.activadDesactivarRebajas();
            }
            if(opcion == 6){
                System.out.println("-----");
                fabrica.crearEnvío();
            }
            if(opcion == 7){
                System.out.println("-----");
                fabrica.insertarDatosDeEnsayo();
            }
            if(opcion == 8){
                System.out.println("-----");
                fabrica.actualizarObjeto();
            }
        }
    }
}
