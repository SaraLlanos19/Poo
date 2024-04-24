package basico4;

public class PrincipalAsig {

    public static void main(String[] args) {

        //Español con constructor vacio
        Asignatura asigEspanol = new Asignatura();
        asigEspanol.setCreditos(5);
        asigEspanol.setNombre("Espanol");
        asigEspanol.imprimirAsignatura();
        
        System.out.println("----------------------------------------");

        //Ciencias con constructor lleno
        Asignatura asigCiencias = new Asignatura(8, "Ciencias");
        asigCiencias.imprimirAsignatura();
       
        
        System.out.println("------------------------------------------");

        //Ingles con constructor vacio y error
        Asignatura asigIngles = new Asignatura();
        asigIngles.setCreditos(-3);
        asigIngles.setNombre("Ingles");
        asigIngles.imprimirAsignatura();
       
        
        

    }

}
