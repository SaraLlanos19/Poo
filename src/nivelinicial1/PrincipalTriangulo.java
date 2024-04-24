
package nivelinicial1;

public class PrincipalTriangulo {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo();
        triangulo.setAltura(5);
        triangulo.setBase(6);
        triangulo.imprimirResultado();
        System.out.println("El área del primer triangulo es: " + triangulo.area());
        
        System.out.println("---------------------------------------------");
        
        Triangulo t2 = new Triangulo();
        t2.setAltura(15);
        t2.setBase(5);
        t2.imprimirResultado();
        System.out.println("El área del segundo triangulo es: " + t2.area());
        
        System.out.println("------------------------------------------------");
        
        Triangulo t3 = new Triangulo();
        t3.setAltura(8);
        t3.setBase(4);
        t3.imprimirResultado();
        //double resultado3 = t3.area(8, 4);
        System.out.println("El área del tercer triangulo es: " + t3.area());
    }
}        

