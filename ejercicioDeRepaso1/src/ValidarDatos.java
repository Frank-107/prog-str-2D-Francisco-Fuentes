import java.util.Scanner;

public class ValidarDatos {

    public String obtenerNombre(Scanner leer){
        while (true) {
            System.out.println("Cual es el nombre del Usuario (6 caracteres)");
            String nombre = leer.nextLine().trim();
            if(nombre.toUpperCase().equals("SALIR")){
                return "SALIR";
            }
            if(nombre.length() == 6 && nombre.matches("[A-Za-z1-9]+")){
                return nombre;
            }else {
                System.out.println("El nombre no es valido, debe contener 6 caracteres " +
                        "y solo se admiten alfanumericos");
                continue;
            }
        }
    }

    public int obtenerHora(Scanner leer, boolean tipo){
        while (true){
            System.out.println("Cual es la hora (1-23)");
            try{
                int hora = leer.nextInt();
                leer.nextLine();
                if(hora>23 || hora<0){
                    System.out.println("Hora fuera de rango");
                }else if(hora>=8 && hora<=20 && tipo){
                    return hora;
                }else if (hora>=10 && hora<=18 && !tipo){
                    return hora;
                }else{
                    System.out.println("Biblioteca cerrada");
                }
            }catch (Exception e){
                System.out.println("Hora no valida");
                leer.next();
            }
        }
    }
    public boolean obtenerTipo(Scanner leer){
        while(true){
            System.out.println("Es usted un alumno (true) o un externo (false)");
            try{
                return leer.nextBoolean();
            }catch (Exception e){
                System.out.println("Opcion no valida");
                leer.next();
            }

        }

    }


}
