package ejercicioparcial;

public class Garaje implements IGaraje {

    
    Vehiculo[] espaciosGaraje;
    
    @Override
    public double calcularIngresos() {
        double sumatoriaPagosGaraje = 0;
        
        for (int i = 0; i < espaciosGaraje.length; i++) {
            Vehiculo vehiculoRecorriendo = espaciosGaraje[i];
            if(vehiculoRecorriendo == null){
                continue;
            }
            
            double pago = vehiculoRecorriendo.getCuotaMesGaraje();
            sumatoriaPagosGaraje = sumatoriaPagosGaraje + pago;
        }
        return sumatoriaPagosGaraje;
    }
    
    @Override
    public int calcularOcupacionPorTipoVehiculo(Vehiculo tipoVehiculo) {
        //System.out.println("El tipo de vehiculo buscado es: "+ tipoVehiculo.getClass().getSimpleName()); por si necesita saber que tipo vehiculo esta buscando
        int cantidadResultados = 0;
        for (int i = 0; i < espaciosGaraje.length; i++) {
            Vehiculo vehiculo = espaciosGaraje[i];

            if (vehiculo instanceof Moto && tipoVehiculo instanceof Moto) {
                cantidadResultados++;
            }
            if (vehiculo instanceof Auto && tipoVehiculo instanceof Auto) {
                cantidadResultados++;
            }
        }
        return cantidadResultados;
    }
    
    public void estacionarVehiculo(Vehiculo vehiculo){
        
        if(vehiculo instanceof Moto){
            System.out.println("Se esta intentando estacionar una moto");
            boolean valido = esEntradaValida(vehiculo);
            System.out.println("Es entrada valida "+ valido);
            if(!valido){
                System.out.println("Es entrada no valida ");
                return;
            }
        }
        
        System.out.println("es valido para insertar");
        for (int i = 0; i < espaciosGaraje.length; i++) {
            Vehiculo espacioRecorriendo = espaciosGaraje[i];
            if(espacioRecorriendo == null){
                espaciosGaraje[i] = vehiculo;
                return;
            }
        }   
        
    }
    public boolean esEntradaValida(Vehiculo moto){
        int cantMotosEstacionadas = this.calcularOcupacionPorTipoVehiculo(moto);
        double cantMaxima80Porciento = espaciosGaraje.length * 0.8;
        
        System.out.println("cantMotosEstacionadas" + cantMotosEstacionadas);
        System.out.println("cantMaxima80Porciento " + cantMaxima80Porciento);
        return cantMotosEstacionadas + 1 < Math.round(cantMaxima80Porciento);
    }
    
    
    
    
    

    public Vehiculo[] getVehiculosParqueados() {
        return espaciosGaraje;
    }

    public void setVehiculosParqueados(Vehiculo[] vehiculosParqueados) {
        this.espaciosGaraje = vehiculosParqueados;
    }



}
