package basico1;

/**
 *
 * @author Sara Llanos Morea
 */
public class PrincipalPapel {

    public static void main(String[] args) {
        Papel papel = new Papel();
        papel.color = "Rojo";
        papel.grosor = 5;
        System.out.println("Color primer papel: " + papel.color + " y grosor del papel: " + papel.grosor);
        

        Papel p1 = new Papel();
        p1.color = "Amarillo";
        p1.grosor = 10;
        System.out.println("Color segundo papel : " + p1.color + " y grosor del papel: " + p1.grosor);
        

        Papel p2 = new Papel();
        p2.color = "Azul";
        p2.grosor = 15;
        System.out.println("Color tercer papel : " + p2.color + " y grosor del papel: " + p2.grosor);
        

    }

}
