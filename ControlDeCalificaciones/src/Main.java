import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        InputDataVal inputDataVal = new InputDataVal();
        GradeService gradeService = new GradeService();
        ImprimirReporte imprimirReporte = new ImprimirReporte();

        //Input
        String nombre = inputDataVal.NombreNoVacio(leer);
        double cal1 = inputDataVal.getCalification(leer,1);
        double cal2 = inputDataVal.getCalification(leer,2);
        double cal3 = inputDataVal.getCalification(leer,3);
        int asistencia = inputDataVal.getValidAsistencia(leer);
        boolean proyecto = inputDataVal.validEntregoProyecto(leer);
        //Proceso
        double parcial = gradeService.calcularPromedio(cal1,cal2,cal3);
        double cfinal = gradeService.calcularFinal(parcial, asistencia);
        String estado = gradeService.estado(asistencia,cfinal,proyecto);
        //Output
        imprimirReporte.imprimirCalificaciones(parcial,cfinal,estado,nombre, gradeService.banderaAprobado);
    }
}