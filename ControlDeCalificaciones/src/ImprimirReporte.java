public class ImprimirReporte {
    public void imprimirCalificaciones(double parcial, double cfinal, String estado,String nombre, boolean banderaAprobado){
        System.out.println("Hola "+nombre+ " Su estado es: "+estado);
        if(banderaAprobado) {
            System.out.println("Su califiacion parcial es de: " + parcial);
            System.out.println("Su calificaion final es de: " + cfinal);
        }
    }
}
