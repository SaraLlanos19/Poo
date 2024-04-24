
package basico3;

public class PrincipalVivienda {
    public static void main(String[] args) {
        
       Vivienda viviendaConstructorVacio = new Vivienda();
       viviendaConstructorVacio.calle = "Manzanares";
       viviendaConstructorVacio.numero = 20;
       viviendaConstructorVacio.precio = 25000;
       viviendaConstructorVacio.superficie = 45;
       viviendaConstructorVacio.conGarage = true;
        viviendaConstructorVacio.imprimirVivienda();
        System.out.println("---------------------------------------");
        
        Vivienda viviendaConstructorCalle = new Vivienda("Manzanares");
        viviendaConstructorCalle.conGarage = false;
        viviendaConstructorCalle.numero = 10;
        viviendaConstructorCalle.precio = 20000;
        viviendaConstructorCalle.superficie = 15;        
        viviendaConstructorCalle.imprimirVivienda();
        System.out.println("---------------------------------------");
        
        Vivienda viviendaConstructorNumero = new Vivienda(14);
        viviendaConstructorNumero.calle = "Manzanares";
        viviendaConstructorNumero.conGarage = false;
        viviendaConstructorNumero.precio = 15000;
        viviendaConstructorNumero.superficie = 23;
        viviendaConstructorNumero.imprimirVivienda();
        System.out.println("---------------------------------------");   
    }
    
}
