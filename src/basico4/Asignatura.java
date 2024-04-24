package basico4;

public class Asignatura {

    //==== Atributos =======//
    private int creditos;
    private String nombre;

    //==== Constructores =======//
    public Asignatura() {
    }

    public Asignatura(int creditos, String nombre) {
        if (creditos > 0) {
            this.creditos = creditos;
        } else {
             System.out.println("Operación no definida");
        }
        this.nombre = nombre;
    }

    //==== Getters y Setters =======//
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setCreditos(int creditos) {
        if (creditos >= 0) {
            this.creditos = creditos;
        } else {
             System.out.println("Operación no definida");
        }

    }

    public int getCreditos() {
        return this.creditos;
    }
    public void mostrarDatos(){
        System.out.println(nombre + "" + creditos + "");
    }

    public void imprimirAsignatura() {
        System.out.println("Los créditos de la asignatura son: " + this.creditos);
        System.out.println("El nombre de la asignatura es: " + this.nombre);
    }

}
