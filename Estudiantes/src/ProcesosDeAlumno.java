import java.util.*;
public class ProcesosDeAlumno {
    ValidarDatos validarDatos = new ValidarDatos();
    Scanner leer = new Scanner(System.in);


    public void alta(Alumno[] alumnos){
        int id = validarDatos.validarid(leer);
        for (int x =0; x<alumnos.length; x++){
            if (alumnos[x]!=null && alumnos[x].getId()==id){
                System.out.println("La id ya esta ocupada");
                return;
            }
        }
        String nombre = validarDatos.validarNombre(leer);
        double promedio = validarDatos.validarPromedio(leer);

        for (int x =0; x<alumnos.length; x++){
            if(alumnos[x]==null){
                alumnos[x] = new Alumno(id, nombre, promedio);
                return;
            }
        }
    }

    public void promedioNuevo(Alumno[] alumnos){
        System.out.println("Cual es la id del promedio a cambiar ?");
        int id = validarDatos.validarid(leer);
        boolean bandera = false;
        double promedioNuevo = validarDatos.validarPromedio(leer);
        for (int x =0; x<alumnos.length; x++){
            if(alumnos[x]!=null && alumnos[x].isActivo() && alumnos[x].getId()==id){
                alumnos[x].setPromedio(promedioNuevo);
                bandera = true;
            }
        }
        if (!bandera){
            System.out.println("No se encontro la id");
        }else{
            System.out.println("promedio cambiado");
        }

    }

    public void baja(Alumno[] alumnos){
        System.out.println("Cual es la id a dar de baja");
        int id = validarDatos.validarid(leer);
        for (int x =0; x<alumnos.length; x++){
            if(alumnos[x]!=null && alumnos[x].isActivo() && alumnos[x].getId()==id){
                alumnos[x].setActivo(false);
                System.out.println("alumno con id "+alumnos[x].getId()+" dado de baja");
            }
        }

    }

}
