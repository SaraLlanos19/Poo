package nivelinicial2;

public class PrincipalMoto {

    public static void main(String[] args) {
        Moto moto = new Moto(149);

        System.out.println("----------------------------------------");

        moto.acelerar(5);
        System.out.println("La velocidad despues de acelerar es: " + moto.getVelocidad());

        System.out.println("---------------------------------------");

        moto.frenar(5);
        System.out.println("La velocidad despues de frenar es: " + moto.getVelocidad());

    }

}
