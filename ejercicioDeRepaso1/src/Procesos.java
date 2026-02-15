
import java.util.*;
public class Procesos {
    public boolean salir;
    ValidarDatos validarDatos = new ValidarDatos();
    Scanner leer = new Scanner(System.in);
    public void registro(ArrayList<Usuario> usuarios){
        String nombre = validarDatos.obtenerNombre(leer);
        if(nombre.equals("SALIR")){
            System.out.println("Ha seleccionado salir");
            salir= true;
            return;
        }
        boolean tipo = validarDatos.obtenerTipo(leer);
        usuarios.add(new Usuario(nombre,tipo,
                validarDatos.obtenerHora(leer,tipo)));
    }
}



