
package ProyectoFinal;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.TreeSet;

public class FabricadeTrajes implements IFabricadeTrajes{
    public ArrayList<Componente>componentesEnAlmacen;
    public TreeSet<Traje> trajesEnAlmacen;
    public ArrayList<Traje> listadoEnvios;
    public boolean sonRebajas=false;
    public GestorDeArchivos gestorDeArchivos;
    Scanner miScanner = new Scanner(System.in);

    public FabricadeTrajes() {
        componentesEnAlmacen = new ArrayList<>();
        trajesEnAlmacen = new TreeSet<>();
        listadoEnvios = new ArrayList<>();
        gestorDeArchivos = new GestorDeArchivos();//se creo objeto de la base de datos
    }
    
    /**
     * Estos son datos de ensayo, para tener informacion previa sobre la cual 
     * aplicar las funcionalidades del menu
     */
    public void insertarDatosDeEnsayo() throws Exception{
        
        System.out.println("Inicie Insertar Datos de Ensayo");
        Blusa blusa = new Blusa(12, "Blusa 1", "s", "roja", true, 12000,true);
        gestorDeArchivos.guardarObjeto(blusa);
        Blusa blusa2 = new Blusa(15, "Blusa 2", "m", "verde", true, 12000,false);
        gestorDeArchivos.guardarObjeto(blusa2);
        Blusa blusa3 = new Blusa(16, "Blusa 3", "s", "roja", true, 12000,true);
        gestorDeArchivos.guardarObjeto(blusa3);
        Blusa blusa4 = new Blusa(175, "Blusa X", "s", "roja", true, 12000,false);
        gestorDeArchivos.guardarObjeto(blusa4);
        
        Pantalon pantalon = new Pantalon(33, "Pantalon 1", "s", "rojo",false,100,true);
        gestorDeArchivos.guardarObjeto(pantalon);
        Pantalon pantalon2 = new Pantalon(123, "Pantalon 2", "s", "rojo",false,100,true);
        gestorDeArchivos.guardarObjeto(pantalon2);
        Pantalon pantalon3 = new Pantalon(125, "Pantalon 3", "s", "rojo",false,100,true);
        gestorDeArchivos.guardarObjeto(pantalon3);
        
        Falda falda = new Falda(10, "Falda 1", "m", "rojo", false, 1000, true);
        gestorDeArchivos.guardarObjeto(falda);
        Falda falda2 = new Falda(11, "Falda 2", "m", "rojo", false, 1000, true);
        gestorDeArchivos.guardarObjeto(falda2);
         Falda falda3 = new Falda(17, "Falda 3", "m", "rojo", false, 1000, true);
        gestorDeArchivos.guardarObjeto(falda3);
        
        Chaqueta chaqueta = new Chaqueta(22,"Chaqueta 1","s","rojo", false, 100,4);
        gestorDeArchivos.guardarObjeto(chaqueta);
        Chaqueta chaqueta2 = new Chaqueta(25,"Chaqueta 2","s","rojo", false, 100,4);
        gestorDeArchivos.guardarObjeto(chaqueta2);
        Chaqueta chaqueta3 = new Chaqueta(5,"Chaqueta 3","s","rojo", false, 100,4);
        gestorDeArchivos.guardarObjeto(chaqueta3);
        
    }
            
    public void escribirMenu(){
        System.out.println("MENÚ FABRICA DE TRAJES");
        
        System.out.println("1 - Añadir Componente a Almacen");
        System.out.println("2 - Listar Componente Almacen");
        System.out.println("3 - Crear Traje y Añadir a almacen");
        System.out.println("4 - Listar Traje del Almacen");
        System.out.println("5 - Activar/Desactivar las Rebajas");
        System.out.println("6 - Crear Envio");
        System.out.println("7 - Insertar datos de ensayo(Solo cuando la base de datos esta vacía)");
        System.out.println("8 - Actualizar componente");
        System.out.println("9 - Salir");
    }
    
    @Override
    public void anadirComponenteAAlmacen()throws Exception{
        
        
        System.out.println("¿Que Prenda de ropa desea?");
        System.out.println("Blusa / Falda / Pantalon / Chaqueta");
        System.out.print("==> ");
        String componente = miScanner.nextLine();
        
        System.out.println("Ingrese los Parametros necesarios para la Prenda: " + componente);
        
        System.out.print("Ingrese el Id ==> ");
        int id = Integer.parseInt(miScanner.nextLine());
        this.esIdValido(id);
        
        System.out.print("Ingrese el Nombre ==> ");
        String nombre = miScanner.nextLine();
        
        System.out.print("Ingrese la Talla ==> ");
        String talla = miScanner.nextLine();
            
        System.out.print("Ingrese el Color ==> ");
        String color = miScanner.nextLine();
        
        System.out.print("Ingrese si es Comunitario (si - no) ==> ");
        String comunitario = miScanner.nextLine();
        boolean esComunitario = false;
        if(Objects.equals(comunitario, "si")){
            esComunitario = true;
            this.comunitariosSonMayoresAl50Porciento();
        }
        
        System.out.print("Ingrese el Precio ==> ");
        double precio = Double.parseDouble(miScanner.nextLine());
        
        if(componente.equalsIgnoreCase("Falda")){
            System.out.print("Ingrese si tiene Cremallera (si - no) ==> ");
            String cremallera = miScanner.nextLine();
            boolean conCremallera = false;
            if(Objects.equals(cremallera, "si")){
                conCremallera = true; 
                precio = precio + 1;
            }
            
            Falda falda = new Falda(id, nombre, talla, color, esComunitario, precio, conCremallera);
            gestorDeArchivos.guardarObjeto(falda);   
        }   
        
        if(Objects.equals(componente, "Blusa")){//Blusa
            
            System.out.print("Ingrese si tiene Manga Larga (si - no) ==> ");
            String mangaLarga = miScanner.nextLine();
            boolean conMangaLarga = false;
            if(Objects.equals(mangaLarga, "si")){
                conMangaLarga = true; 
            }
            
            Blusa blusa = new Blusa(id, nombre, talla, color, esComunitario, precio,conMangaLarga);
            this.validarExistenciaMangaOpuesta(blusa);
        }
            
        if(Objects.equals(componente, "Chaqueta")){ //Chaqueta
            System.out.print("Ingrese el Numero de Botones ==> ");
            int numBotones = Integer.parseInt(miScanner.nextLine());
            int valorAdicional = numBotones * 2; //2 * 2 =4
            precio = precio + valorAdicional; //100 + 4 = 104
            
            Chaqueta chaqueta = new Chaqueta(id, nombre, talla, color, esComunitario, precio, numBotones);
            //lista que sale de la base de datos
            gestorDeArchivos.guardarObjeto(chaqueta);
        }
        
        if(Objects.equals(componente, "Pantalon")){//Pantalon
            System.out.print("Ingrese si lleva Cremallera (si - no) ==> ");
            String cremallera = miScanner.nextLine();
            boolean conCremallera = false;
            if(Objects.equals(cremallera, "si")){
                conCremallera = true;
                precio = precio + 1;
            }
           
            Pantalon pantalon = new Pantalon(id ,nombre , talla ,color ,esComunitario , precio, conCremallera);
            gestorDeArchivos.guardarObjeto(pantalon);
        }
    }
    
    private void esIdValido(int idNuevo)throws Exception{
        for(Componente componenteIterando: gestorDeArchivos.obtenerTodosObjetos()){
            int idIterando = componenteIterando.getId();
            if(idNuevo == idIterando){
               throw new IdException();
            }    
        }
    }
    
    private void comunitariosSonMayoresAl50Porciento() throws Exception {
        int totalComponentes = 0;
        int cantidadComunitarios = 0;
        
        for(Componente componenteIterando: gestorDeArchivos.obtenerTodosObjetos()){
            totalComponentes ++;
            boolean esComunitario = componenteIterando.isEscomunitario();
            if(esComunitario){
               cantidadComunitarios ++; 
            }
        }
        //calcula el maximo de prendas comunitarias que puede haber
        double maximo = totalComponentes * 0.5;
        if(cantidadComunitarios > maximo){
            throw new DemasiadosComunitarioException();
        }
    }
    
    private void validarExistenciaMangaOpuesta (Blusa blusaACrear) throws Exception{
        boolean insertarAlListado = false;
        String colorBlusaGuardar = blusaACrear.getColor();
        boolean mangaLargaBlusaGuardar = blusaACrear.isConMangaLarga();
        for(Componente componenteIterando : gestorDeArchivos.obtenerTodosObjetos()){
            
            String colorComponenteIterando = componenteIterando.getColor();
            if(componenteIterando instanceof Blusa && componenteIterando.getColor().equals(colorBlusaGuardar) ){
                boolean mangaLargaIterando = ((Blusa) componenteIterando).isConMangaLarga();
                
                if(mangaLargaIterando != mangaLargaBlusaGuardar){ //false != true
                    insertarAlListado = true;
                }
            }
        }
        System.out.println("Insertar" + insertarAlListado);
        if(insertarAlListado){
           gestorDeArchivos.guardarObjeto(blusaACrear); 
        }else{
            throw new MangaException();
        }
    }

    @Override
    public void listarComponentes() throws Exception {
        int contador = 0;
        for(Componente componenteIterando : gestorDeArchivos.obtenerTodosObjetos()){
            contador++;
            System.out.println("Fila " + contador + ":" + " " + componenteIterando.toString());
        }
        System.out.println("Total Componentes: " + gestorDeArchivos.obtenerTodosObjetos().size());
    }

    @Override
    public void anadirTrajeAAlmacen() throws Exception {
        
        System.out.println("Lista de Blusas Existentes");
        for(Componente componenteIterando : gestorDeArchivos.obtenerTodosObjetos()){
            if(componenteIterando instanceof Blusa){
                System.out.println("Nombre de la Blusa: " + componenteIterando.getNombre() + " - " + "ID de la blusa: " + componenteIterando.getId());
            }
        }
        System.out.println("Seleccione el ID de la Blusa que desea");
        System.out.print("----> " );
        int idBlusaSeleccionada = Integer.parseInt(miScanner.nextLine());
        
        
        System.out.println("Lista de Chaquetas Existentes");
        for(Componente componenteIterando : gestorDeArchivos.obtenerTodosObjetos()){
            if(componenteIterando instanceof Chaqueta){
                System.out.println("Nombre de la Chaqueta: " + componenteIterando.getNombre() + " - " + "ID de la chaqueta: " + componenteIterando.getId());  
            }
        }
        System.out.println("Seleccione el ID de la Chaqueta que desea");
        System.out.print("----> " );
        int idChaquetaSeleccionada = Integer.parseInt(miScanner.nextLine());
        
        System.out.println("Lista de Faldas y Pantalones Existentes");
        for(Componente componenteIterando : gestorDeArchivos.obtenerTodosObjetos()){
            
            if(componenteIterando instanceof Falda){
                System.out.println("Nombre de la Falda: " + componenteIterando.getNombre() + " - " + "ID de la falda: " + componenteIterando.getId());  
            }
            if(componenteIterando instanceof Pantalon){
                System.out.println("Nombre del Pantalon: " + componenteIterando.getNombre() + " - " + "ID del pantalon: " + componenteIterando.getId());  
            }
        }
        System.out.println("Seleccione el ID de la Falda o Pantalon que desea");
        System.out.print("----> " );
        int idFaldaPantalonSeleccionada = Integer.parseInt(miScanner.nextLine());
        
        try{
            ArrayList<Componente> piezas;
            piezas = this.validarColoresTraje(idBlusaSeleccionada, idChaquetaSeleccionada, idFaldaPantalonSeleccionada);
            piezas = this.validarTallaComponentes(idBlusaSeleccionada, idChaquetaSeleccionada, idFaldaPantalonSeleccionada);
            
            Traje traje = new Traje();
            traje.setPiezas(piezas);
            
            System.out.println("Ingrese el nombre del traje");
            System.out.print("----> " );
            String nombreTrajeCrear = miScanner.nextLine();
        
            traje.setNombre(nombreTrajeCrear);
            this.validarNombreTraje(nombreTrajeCrear);
            trajesEnAlmacen.add(traje);
        
            this.eliminarComponentesUsados(idBlusaSeleccionada, idChaquetaSeleccionada, idFaldaPantalonSeleccionada);
        }catch(Exception e){
            System.out.println("Hay error al realizar las validaciones");
            e.printStackTrace();//imprimir el error de forma detallada
        }
    }
    
    private ArrayList<Componente> validarColoresTraje(int idBlusaSeleccionada, int idChaquetaSeleccionada, int idFaldaPantalonSeleccionada)throws Exception{
        
        Componente componente1 = this.encontrarComponentePorId(idBlusaSeleccionada);
        Componente componente2 = this.encontrarComponentePorId(idChaquetaSeleccionada);
        Componente componente3 = this.encontrarComponentePorId(idFaldaPantalonSeleccionada);
        
        ArrayList<Componente> piezas = new ArrayList<>();
        piezas.add(componente1);
        piezas.add(componente2);
        piezas.add(componente3);
        
        String color1 = componente1.getColor();
        String color2 = componente2.getColor();
        String color3 = componente3.getColor();
        
        if(color1.equals(color2) && color2.equals(color3)){
            
            return piezas;
           
        } else {
            String inicialColor1 = color1.substring(0 , 1);
            String inicialColor2 = color2.substring(0 , 1);
            String inicialColor3 = color3.substring(0 , 1);
        
            if(inicialColor1.equals(inicialColor2) && inicialColor2.equals(inicialColor3)){
                return piezas;
            }else{
                throw new ColoresException();
            }
        }
    }
    
    private Componente encontrarComponentePorId(int id)throws Exception{
        for(Componente componenteIterando : gestorDeArchivos.obtenerTodosObjetos()){
            if(componenteIterando.getId() == id){
                return componenteIterando;
            }
        }
        throw new Exception("Error al buscar el Componente seleccioando");
    }
    
    private ArrayList<Componente> validarTallaComponentes(int idBlusaSeleccionada, int idChaquetaSeleccionada, int idFaldaPantalonSeleccionada)throws Exception{
        Componente componente1 = this.encontrarComponentePorId(idBlusaSeleccionada);
        Componente componente2 = this.encontrarComponentePorId(idChaquetaSeleccionada);
        Componente componente3 = this.encontrarComponentePorId(idFaldaPantalonSeleccionada);
        
        ArrayList<Componente> piezas = new ArrayList<>();
        piezas.add(componente1);
        piezas.add(componente2);
        piezas.add(componente3);
        
        String tallaBlusa = componente1.getTalla();
        String tallaChaqueta = componente2.getTalla();
        String tallaFaldaPantalon = componente3.getTalla();
        
        if (componente3 instanceof Falda){
            if(tallaBlusa.equals(tallaChaqueta)){
                return piezas;
            }else{
                throw new TallaException();
            }
        }
        
        if (componente3 instanceof Pantalon){
            if(tallaBlusa.equals(tallaChaqueta) && tallaChaqueta.equals(tallaFaldaPantalon)){
                return piezas;
            }else{
                throw new TallaException();
            }
        }
        throw new Exception("La Tercera prenda debe ser Falda o Pantalon.");
    }
    
    private void validarNombreTraje(String nombreTrajeCrear)throws Exception{
         for(Traje traje : trajesEnAlmacen){
            String nombre = traje.getNombre();
            if(nombreTrajeCrear.equals(nombre)){
                throw new TrajeYaExisteException();
            }
         }
     }
    
     private void eliminarComponentesUsados(int idBlusaSeleccionada, int idChaquetaSeleccionada, int idFaldaPantalonSeleccionada)throws Exception{
        Componente componente1 = this.encontrarComponentePorId(idBlusaSeleccionada);
        Componente componente2 = this.encontrarComponentePorId(idChaquetaSeleccionada);
        Componente componente3 = this.encontrarComponentePorId(idFaldaPantalonSeleccionada);
        
        
        gestorDeArchivos.eliminarObjeto(componente1);
        gestorDeArchivos.eliminarObjeto(componente2);
        gestorDeArchivos.eliminarObjeto(componente3);
        
     }
     
    @Override
    public void listarTrajes() {
        int contador = 0;
        for(Traje traje : trajesEnAlmacen){
            contador++;
            System.out.println("Fila : " + contador + ": " + " " + traje.toString());
        }
        System.out.println("Total trajes: " + trajesEnAlmacen.size());
    }

    @Override
    public void activadDesactivarRebajas() throws Exception {
        if(this.sonRebajas){
            for(Componente componenteIterando : gestorDeArchivos.obtenerTodosObjetos()){
                double resultado = componenteIterando.getPrecio() * 2;//le duplica el precio 
                componenteIterando.setPrecio(resultado);
            } 
           this.sonRebajas = false;
        }else{
            for(Componente componenteIterando : gestorDeArchivos.obtenerTodosObjetos()){
                double resultado = componenteIterando.getPrecio() / 2; //le rebaja la mitad del precio
                componenteIterando.setPrecio(resultado);
            }
             this.sonRebajas = true;
        }
    }

    @Override
    public void crearEnvío()throws Exception{
         
        int contador = 0;
        for(Traje trajeIterando : trajesEnAlmacen){
            contador++;
            System.out.println("Nombre del traje " + contador + ": " + " " + trajeIterando.getNombre());
        }
        System.out.println("Ingrese el Nombre del Traje que desea");
        System.out.print("----> " );
        String nombreTraje = miScanner.nextLine();
        this.eliminarTrajeAlmacen(nombreTraje);
    }
    
    private Traje encontrarTrajePorNombre(String nombreTraje)throws Exception{
        for(Traje trajeIterando : trajesEnAlmacen){
            if(trajeIterando.getNombre().equals(nombreTraje)){
                return trajeIterando;
            }
        }
        throw new Exception("Error al buscar el Componente seleccioando");
    }
    
    private void eliminarTrajeAlmacen(String nombreTraje)throws Exception{
        Traje trajeEncontrado = this.encontrarTrajePorNombre(nombreTraje);
        trajesEnAlmacen.remove(trajeEncontrado);
        listadoEnvios.add(trajeEncontrado);
        System.out.println("Listado Actualizado: " + listadoEnvios);
    }
    
    public void actualizarObjeto()throws Exception{
        //1. mostrarle cuales hay
        //2. Pedirle al usuario que elija una
        //3. Ingrese el parametro que quiere cambiar
        //4. Pedirle al usuario el nuevo valor para el parametro
        //5. actualizarlo
        for(Componente componenteIterando : gestorDeArchivos.obtenerTodosObjetos()){
            System.out.println("Componentes existentes: " + componenteIterando.toString());
        }
       
        System.out.println("Ingrese el ID de la prenda que va actualizar");
        System.out.print("----> ");
        int idSeleccionado = Integer.parseInt(miScanner.nextLine());
        
        System.out.println("MENÚ DE PARAMETROS");
        
        System.out.println("1 - Nombre");
        System.out.println("2 - Talla");
        System.out.println("3 - Color");
        System.out.println("Ingrese el parametro que quiere cambiar");
        System.out.print("----> ");
        int parametroNuevo = Integer.parseInt(miScanner.nextLine());
        
        
        System.out.println("Ingrese el nuevo parametro que tendrá");
        System.out.print("----> ");
        String valorAgregado = miScanner.nextLine();
        
        Componente componenteModificado = null;
        
        for(Componente componenteIterando : gestorDeArchivos.obtenerTodosObjetos()){
            if(componenteIterando.getId() == idSeleccionado){
                
                if(parametroNuevo == 1){
                    componenteIterando.setNombre(valorAgregado);
                }
                if(parametroNuevo == 2){
                    componenteIterando.setTalla(valorAgregado);
                }
                if(parametroNuevo == 3){
                    componenteIterando.setColor(valorAgregado);
                }
                
                componenteModificado = componenteIterando;
            }
        }
        
        gestorDeArchivos.actualizarObjeto(componenteModificado);
    }
}
