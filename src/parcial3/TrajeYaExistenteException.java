
package parcial3;

public class TrajeYaExistenteException extends Exception{
    public TrajeYaExistenteException(){
        super("El nombre del traje ya existe");
    }
    
}
