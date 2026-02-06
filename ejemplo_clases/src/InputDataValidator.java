import java.util.*;
public class InputDataValidator {
    public int getValidInt(Scanner scanner, String mensaje){
        int value;
        while (true){
            System.out.println(mensaje);
            if (scanner.hasNextInt()){
                value = scanner.nextInt();
                if (value>0) {
                    return value;
                }
                System.out.println("el dato esta fuera del rango");
            }else{
                System.out.println("el dato no es numerico");
                scanner.next();
            }
        }
    }
}
