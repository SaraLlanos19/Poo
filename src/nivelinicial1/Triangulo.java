
package nivelinicial1;

public class Triangulo {
    int base;
    int altura;
    
    public Triangulo(){}

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    public double area(){
       return (base * altura)/2;
        
    }
    public void imprimirResultado(){
        System.out.println("La altura del triangulo es: " + this.altura + "" + " y la base es: " + this.base);
        
    }
}
