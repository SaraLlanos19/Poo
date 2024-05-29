
package parcial3;

public class Blusa extends Componente{
     private boolean conMangaLarga;

    public Blusa(int id, String nombre, String talla, String color, boolean escomunitario, double precio, boolean conMangaLarga) {
        super(id, nombre, talla, color, escomunitario, precio);
        this.conMangaLarga = conMangaLarga;
    }

    public boolean isConMangaLarga() {
        return conMangaLarga;
    }

    public void setConMangaLarga(boolean conMangaLarga) {
        this.conMangaLarga = conMangaLarga;
    }

    @Override
    public String toString() {
        return super.toString() + "Blusa{" + "conMangaLarga=" + conMangaLarga + '}';
    }
     
    
}
