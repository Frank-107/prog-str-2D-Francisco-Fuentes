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
    public void buscarPorId(Alumno[] alumnos){
        int id = validarDatos.validarid(leer);
        for (int x = 0; x<alumnos.length; x++){
            if (alumnos[x]!=null && alumnos[x].isActivo() && alumnos[x].getId()==id){
                System.out.println("Alumno encontrado: "+alumnos[x]);
                return;
            }
        }
        System.out.println("Alumno no encontrado o esta inactivo");
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
    public void listarActivos(Alumno[] alumnos){
        for (int x =0; x < alumnos.length; x++){
            if(alumnos[x]!=null && alumnos[x].isActivo()){
                System.out.println(alumnos[x]);
            }
        }
    }
    public void reporte(Alumno[] alumnos ){
        double promedioGeneral=0;
        int pasaron=0;
        int total=0;
        int a=0;
        int mayor=0;
        int menor=0;
        for(int x =0; x<alumnos.length; x++){
            if(alumnos[x]!=null && alumnos[x].isActivo()){
                promedioGeneral=promedioGeneral+alumnos[x].getPromedio();
                total++;
                if(alumnos[a].getPromedio()>alumnos[mayor].getPromedio()){
                    mayor=a;
                }
                if(alumnos[a].getPromedio()<alumnos[menor].getPromedio()){
                    menor=a;
                }
                if(alumnos[x].getPromedio()>=8){
                    pasaron++;
                }
                a=x;
            }
        }
        promedioGeneral=promedioGeneral/total;
        System.out.println("El promedio general es de: "+promedioGeneral);
        System.out.println("El alumno con mayor promedio es de: "+ alumnos[mayor]);
        System.out.println("El alumno con menor promedio es de: "+ alumnos[menor]);
        System.out.println("Pasaron "+pasaron+" alumnos.");
    }
}
