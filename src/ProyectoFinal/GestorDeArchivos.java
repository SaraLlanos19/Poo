
package ProyectoFinal;

import java.util.List;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.ArrayList;

public class GestorDeArchivos{

    private final String BD = "basedatos.dat";
    
    public void guardarObjeto(Componente componente) throws Exception {
        List<Componente> componentes = this.obtenerTodosObjetos();//consultar el listado de la bd
        componentes.add(componente);//agregar el objeto en el listado en memoria
        
        //abre el fichero sobre el cual va a escribir
        ObjectOutputStream escribiendoFichero = new ObjectOutputStream(new FileOutputStream(BD) );
        escribiendoFichero.writeObject(componentes);//escribe sobre el fichero
        escribiendoFichero.close();
    }
    
    private void vaciar() throws Exception {
        FileWriter myWriter = new FileWriter(BD);//crea un objeto para escribir en un archivo
        myWriter.write("");//escribe en el archivo (le ponemos vacio)
        myWriter.close();//se cierra el archivo
    }
    
    
    public List<Componente> obtenerTodosObjetos() throws Exception {
        ObjectInputStream lectorFichero = null;//objeto que nos permite guardar el contenido de un archivo
        try{
            lectorFichero = new ObjectInputStream(new FileInputStream(BD) );//abre el archivo de base de datos
        }catch(java.io.EOFException e){//si el archivo esta vacio sale excepcion
            return new ArrayList<>();//devuelve un listado vacio, por que no habia contenido
        }
        Object objetoBd = lectorFichero.readObject();//leer lo que esta en el fichero
        
        //convierte lo que estaba en el fichero en una lista de componentes.
        ArrayList <Componente> componentes = ( ArrayList <Componente> )objetoBd;
        
        //cierra la base de datos
        lectorFichero.close();
        return componentes;
    }
    
    public void eliminarObjeto(Componente componenteABorrar)throws Exception{
        List<Componente> listadoComponentes = this.obtenerTodosObjetos();
        listadoComponentes.remove(componenteABorrar);
        this.vaciar();
        for(Componente componenteIterando: listadoComponentes){
            this.guardarObjeto(componenteIterando);
        }
    }
    
    public void actualizarObjeto(Componente componenteModificado)throws Exception{
        
        List<Componente> componentes = this.obtenerTodosObjetos();
        
        int contador = 0;
        int posicionComponenteModificar = 0;
        for(Componente componenteIterando : componentes){
            if(componenteIterando.getId()== componenteModificado.getId()){
               posicionComponenteModificar = contador;
            }
            contador++;
        }
        
        //cambia el componente fijado por el nuevo
        componentes.set(posicionComponenteModificar, componenteModificado);
        
        this.vaciar();
        for(Componente componenteIterando: componentes){
            this.guardarObjeto(componenteIterando);
        }
    }
}
