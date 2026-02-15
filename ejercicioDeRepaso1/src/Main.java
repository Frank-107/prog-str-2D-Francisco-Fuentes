
import java.util.*;
class Main {


    static void main(String[] args) {

        Procesos procesos = new Procesos();
        ArrayList<Usuario> usuarios = new ArrayList<>();
        while (true){
            procesos.registro(usuarios);
            if (procesos.salir){
                for(Usuario a : usuarios){
                    System.out.println(a);
                }

                return;
            }


        }



}}

