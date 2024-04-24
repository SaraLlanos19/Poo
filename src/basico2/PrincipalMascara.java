package basico2;

public class PrincipalMascara {

    public static void main(String[] args) {
        
      
        Mascara mascara = new Mascara();
        String personaje = mascara.personaje = "Sofia";
        boolean tienePelo = mascara.tienePelo = false;
        System.out.println("El primer personaje es: " + personaje);
        System.out.println("Este personaje tiene pelo : " + tienePelo);

        Mascara m2 = new Mascara();
        String personaje2 = m2.personaje = "Ana";
        boolean tienePelo2 = m2.tienePelo = true;
        System.out.println("El segundo personaje es: " + personaje2);
        System.out.println("Este personaje tiene pelo: " + tienePelo2);

    }

}
