import java.util.*;
public class ProcesosDePersona {
    Scanner leer = new Scanner(System.in);
    ValidarEntradaDeDatos validarEntradaDeDatos = new ValidarEntradaDeDatos();





    public void alta(Persona personas[]){
        int id = validarEntradaDeDatos.getvalidint(leer);
        boolean ocupado = false;
        for (int i=0; i<personas.length; i++) {
            if (personas[i] != null && personas[i].getId() == id) {
                System.out.println("El id esta ocupado por "+ personas[i].getNombre());
                return;
            }
        }
        String nombre = validarEntradaDeDatos.getValidNombre(leer);
        Persona nueva = new Persona(id,nombre);

        for (int i=0; i < personas.length; i++){
            if (personas[i]==null){
                personas[i]=nueva;
                break;
            }
        }


    }

    public void imprimirTodalalista(Persona personas[]){
        for(int num=0; num < personas.length; num++){
            System.out.print("Puesto: "+num+": ");
            try {
                System.out.print(personas[num].getId()+" Nombre: ");
                System.out.println(personas[num].getNombre());
                System.out.println(personas[num].isActivo());
            }
            catch (Exception e){
                System.out.println("no esta ocupado este rango");
            }
        }
    }


    public void buscarId(Persona personas[]){
        int id = validarEntradaDeDatos.getvalidint(leer);
        for (int i=0; i<personas.length; i++){
            if(personas[i]!=null && personas[i].getId()==id){
                System.out.println("id encontrada, nombre: "+personas[i].getNombre());
                return;
            }

        }
        System.out.println("id no encontrada");
    }
    public void darDeBajaLogica(Persona personas[]){
        int id = validarEntradaDeDatos.getvalidint(leer);
        for(int num=0; num<personas.length; num++){
            if (personas[num]!=null && personas[num].getId()==id){
                System.out.println("Id "+id+" eliminada, nombre: "+personas[num].getNombre());
                personas[num]=null;
            }

        }
    }
    public void actualizarElNombre (Persona personas[]){
        int id = validarEntradaDeDatos.getvalidint(leer);
        String nombre = validarEntradaDeDatos.getValidNombre(leer);
        for(int num=0; num<personas.length; num++){
            if (personas[num]!=null && personas[num].getId()==id){
                personas[num].setNombre(nombre);
                return;
            }

        }
    }

}
