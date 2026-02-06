import java.util.*;
public class InputDataVal {
    public double getValidDouble(Scanner leer, String mensaje){
        int value;
        while (true){
            if(leer.hasNextDouble()){
                value = leer.nextDouble();
            }
            else{
                System.out.println("no es un dato numerico");


            }
        }

        return 0;
    }




}
