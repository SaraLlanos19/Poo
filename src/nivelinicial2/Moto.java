
package nivelinicial2;

public class Moto {

    private int velocidad;

    public Moto() {
        
    }

    public Moto(int velocidad) {
        this.velocidad = velocidad;
        
        System.out.println("La velocidad inicial es: " + this.velocidad);
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void acelerar(int aceleracion) {
        //aceleracion = 20
        //velocidad = 140
        this.velocidad = aceleracion + this.velocidad;
        System.out.println("La aceleración es: " + aceleracion);
        if(this.velocidad > 150){
            System.out.println("La velocidad final fue: " + this.velocidad);    
            throw new RuntimeException("Error en la velocidad");
        }   
    }

    public void frenar(int desaceleracion) {
        this.velocidad = this.velocidad - desaceleracion;
        System.out.println("La desaceleración es: " + desaceleracion);
        if(this.velocidad < 0){
            System.out.println("La velocidad final es: " + this.velocidad);
            throw new RuntimeException("Error en la desaceleración");
        }
    }

}
