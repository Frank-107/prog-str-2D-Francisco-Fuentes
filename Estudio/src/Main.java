import java.util.*;
class Main{
    static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Libros[] libros = new Libros[5];
        for (int x=0;x<libros.length;x++){
            libros[x] = new Libros(0,null,0);
        }
        Procesos procesos = new Procesos();
        procesos.alta(libros, leer);

        for (int num=0; num< libros.length;num++){
            if (libros[num].isActivo()) {
                System.out.println("en la posicion: "+num);
                System.out.println(libros[num]);
            }
        }



    }







}