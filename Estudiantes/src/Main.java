import java.util.*;
class Main{
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Alumno[] alumnos = new Alumno[25];
        ProcesosDeAlumno procesosDeAlumno = new ProcesosDeAlumno();


        int opcion;

        while(true){
            System.out.println("Que accion quieres realizar \n 1) Alta alumno \n 2) Buscar por ID \n 3) Actualizar promedio por ID\n 4) Baja logica \n 5) Listar archivos \n 6) Reportes \n 0) Salir");
            opcion = leer.nextInt();
            leer.nextLine();
            switch (opcion){
                case (1):
                    procesosDeAlumno.alta(alumnos);
                    System.out.println(alumnos[0]);
                    break;
                case (2):
                    System.out.println("Buscar por id");
                    break;
                case (3):
                    procesosDeAlumno.promedioNuevo(alumnos);
                    break;
                case (4):
                    procesosDeAlumno.baja(alumnos);
                    break;
                case (5):
                    System.out.println("activos");
                    break;
                case (6):
                    System.out.println("reportes");
                    break;
                case (0):
                    return;
            }
        }




    }
}