package basico5;

public class Chalet {

    //Atributos 
    private String calle;
    private int numParcela;
    private double precio;
    private int superficie;
    private boolean conPiscina;

    //Constructores
    public Chalet() {
    }

    //Getter and setter
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumParcela() {
        return numParcela;
    }

    public void setNumParcela(int numParcela) {
        if (numParcela >= 1 && numParcela <= 10) {
            this.numParcela = numParcela;
        } else {
            System.out.println("Error en la parcela");
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {

        if (precio > 0) {
            this.precio = precio;
            
        }else{
            System.out.println("Error en el precio");
            
        }
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
        if (superficie < 0 && superficie <= 2000) {
            System.out.println("Superficie no válida");
        }
    }

    public boolean isConPiscina() {
        return conPiscina;
    }

    public void setConPiscina(boolean conPiscina) {
        this.conPiscina = conPiscina;
    }

    public void imprimirChalet() {
        System.out.println("La calle del chalet es: " + this.calle);
        System.out.println("El numero de parcela es: " + this.numParcela);
        System.out.println("El precio del chalet es: " + this.precio);
        System.out.println("La superficie del chalet es: " + this.superficie);
        System.out.println("El chalet tiene piscina: " + this.conPiscina);
    }

}
