package ejercicioparcial;

public class Vehiculo {

    String placa;
    String marca;
    double precio;
    int cilindraje;
    double impuestoCirculacion;
    double cuotaMesGaraje;
    final double CUOTAMESGARAJE = 100;
    
    
    public Vehiculo(String marca, double precio, int cilindraje) {
        this.precio = precio;
        this.cilindraje = cilindraje;
        this.cuotaMesGaraje = CUOTAMESGARAJE;
        this.calcularImpuestoCirculacion();
    }
    
            
    private void calcularImpuestoCirculacion(){
        this.impuestoCirculacion = this.precio * 0.02;
    }
    
    boolean matricular(String placa){
        //sjt56  78ji 78ojni8
        int cantidadCaracteres = placa.length();
        if(cantidadCaracteres >= 6){
            this.placa = placa;
            return true;
        }else{
            return false;
        }
        
    }
    
    public void setCuotaMesGaraje(double cuotaMesGaraje) {
        this.cuotaMesGaraje = cuotaMesGaraje;
        if (cuotaMesGaraje > 0) {
            this.cuotaMesGaraje = cuotaMesGaraje;
        } else {
            System.err.println("Error en la cuota");
            System.exit(1);
        }
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public double getImpuestoCirculacion() {
        return impuestoCirculacion;
    }

    public void setImpuestoCirculacion(double impuestoCirculacion) {
        this.impuestoCirculacion = impuestoCirculacion;
    }

    public double getCuotaMesGaraje() {
        return cuotaMesGaraje;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "placa=" + placa + ", marca=" + marca + ", precio=" + precio + ", cilindraje=" + cilindraje + ", impuestoCirculacion=" + impuestoCirculacion + ", cuotaMesGaraje=" + cuotaMesGaraje + ", CUOTAMESGARAJE=" + CUOTAMESGARAJE + '}';
    }
    
    

}
