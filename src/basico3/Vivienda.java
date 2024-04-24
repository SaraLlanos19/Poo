package basico3;

public class Vivienda {

    String calle;
    boolean conGarage;
    int numero;
    double precio;
    int superficie;
    

    public Vivienda() {
    }

    public Vivienda(String calle) {
        this.calle = calle;
    }

    public Vivienda(int numero) {
        this.numero = numero;
    }

    public void imprimirVivienda(){
        System.out.println("La calle de la vivienda es: " + this.calle);
        System.out.println("La vivienda tiene garage: " + this.conGarage);
        System.out.println("El numero de la vivienda es: " + this.numero);
        System.out.println("El precio de la vivienda es: " + this.precio);
        System.out.println("La superficie de la vivienda es: " + this.superficie);
    }
}
