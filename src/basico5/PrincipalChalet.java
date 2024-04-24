
package basico5;

public class PrincipalChalet {
    public static void main(String[] args) {
        Chalet chalet = new Chalet();
        chalet.setCalle("Cuarta");
        chalet.setNumParcela(10);
        chalet.setPrecio(10000);
        chalet.setSuperficie(15);
        chalet.setConPiscina(true);
        
        chalet.imprimirChalet();
        
    
        System.out.println("-------------------------------------------");
        
        
        Chalet chalet2 = new Chalet();
        chalet2.setCalle("Tercera");
        chalet2.setNumParcela(11);
        chalet2.setPrecio(12000);
        chalet2.setSuperficie(30);
        chalet2.setConPiscina(false);
        
        chalet2.imprimirChalet();
        
    }
    
}
