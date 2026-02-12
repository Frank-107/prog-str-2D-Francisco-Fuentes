import java.util.Scanner;

class Libros {
    private int id;
    private String nombre;
    private int paginas;
    private boolean activo;
    public Libros(int id, String nombre, int paginas){
        this.id = id;
        this.nombre=nombre;
        this.paginas=paginas;
        this.activo=false;
    }


    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String toString() {
        return "Libros{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", paginas=" + paginas +
                '}';
    }


    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}


