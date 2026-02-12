import java.util.Scanner;

public class Procesos {
    public void alta(Libros libros[], Scanner leer){
        System.out.println("el que lugar lo quieres guardar");
        int lugar = leer.nextInt();
        leer.nextLine();
        System.out.println("Cual es id del libro");
        int id = leer.nextInt();
        leer.nextLine();
        System.out.println("Cual es el nombre del libro");
        String nombre=leer.nextLine();
        System.out.println("Cuantas paginas tiene el libro");
        int paginas = leer.nextInt();
        Boolean activo= true;
        Libros nuevo = new Libros(id,nombre,paginas);
        libros[lugar]=nuevo;
        libros[lugar].setActivo(true);
    }
}
