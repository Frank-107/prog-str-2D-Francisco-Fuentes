public class GradeService {
    public boolean banderaAprobado;
    double calcularPromedio(double a, double b, double c){
        return (a+b+c)/3;
    }
    double calcularFinal(double promedio, int asistencia){
        return (promedio*0.7)+(asistencia*0.3);
    }
    String estado (int asistencia, double cfinal, boolean proyecto ){
        this.banderaAprobado=false;
        if (asistencia<80){
            return "Reprobado por asistencia";
        }else if(!proyecto){
            return "Reprobado por Proyecto";
        }else if(cfinal<70){
            return "Reprobado por calificacion";
        }else {
            this.banderaAprobado=true;
            return "Aprobado";
        }
    }
}
