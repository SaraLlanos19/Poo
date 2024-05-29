
package ProyectoFinal;



public class Blusa extends Componente {
    private boolean conMangaLarga;
    //Metodos
    //1 Constrcutor

    public Blusa(int id, String nombre, String talla, String color, boolean escomunitario, double precio,boolean conMangaLarga) {
        super(id, nombre, talla, color, escomunitario, precio);
        this.conMangaLarga = conMangaLarga;
        
    }
    public boolean isConMangaLarga() {
        return conMangaLarga;
   }

    public void setConMangaLarga(boolean conMangaLarga) {
        this.conMangaLarga = conMangaLarga;
    }
    //3 toString

    @Override
    public String toString() {
        return super.toString() + "Blusa{" + "Con Manga Larga:" + conMangaLarga + '}';
    }

   
    
    

    
}
