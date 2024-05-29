
package ProyectoFinal;

public class TrajeYaExisteException extends Exception {
    public TrajeYaExisteException(){
        super("El nombre de este traje ya existe");
    }
    
}
