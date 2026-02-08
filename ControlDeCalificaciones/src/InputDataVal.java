import java.util.*;
public class InputDataVal {
public String NombreNoVacio(Scanner leer) {
    while(true) {
        System.out.println("¿Cual es su nombre?");
        String nombre = leer.nextLine().trim();
        if(nombre.equals("")){
            System.out.println("Inroduce un nombre valido");
        }else{
            return nombre;
        }
    }
}

public double getCalification(Scanner leer, int numero){
    System.out.println("Introduce la calificacion N "+numero+" En rango 1-100");
    while(true){
        if(leer.hasNextDouble()){
            double calificacion=leer.nextDouble();
            if (calificacion<=100 && calificacion>=0){
                return calificacion;
            }else{
                System.out.println("Valor fuera de rango");
            }
        }
        System.out.println("Introduce un valor decimal");
        leer.next();


    }

}

public int getValidAsistencia(Scanner leer){
    System.out.println("Introduce tu numero de asistencias Rango 1-100");
    while(true){
        if (leer.hasNextInt()){
            int asistencia = leer.nextInt();
            if (asistencia<=100 && asistencia>=0){
                return asistencia;
            }
            System.out.println("El valor esta fuera del rango");
        }else{
            System.out.println("El valor no es un numero entero");
            leer.next();
        }
    }
}
public boolean validEntregoProyecto(Scanner leer){
    while(true){
        System.out.println("Entrego el proyecto? (true/false)");
        if(leer.hasNextBoolean()){
            return leer.nextBoolean();
        }
        System.out.println("El valor introducido no es booleano");
        leer.next();
    }
}






}
