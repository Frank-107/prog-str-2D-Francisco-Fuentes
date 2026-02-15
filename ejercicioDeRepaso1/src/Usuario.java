public class Usuario {
    private String nombre;
    private boolean tipo;
    private int hora;

    public Usuario(String nombre, boolean tipo, int hora) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", tipo=" + tipo +
                ", hora=" + hora +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
}
