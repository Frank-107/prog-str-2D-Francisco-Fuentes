import java.util.*;
class Main{
    static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ValidarEntradaDeDatos validarEntradaDeDatos = new ValidarEntradaDeDatos();
        ProcesosDePersona procesosDePersona = new ProcesosDePersona();
        Persona[] personas = new Persona[20];



        int opc;
        do{
            System.out.println("Menu");
            System.out.println("1)Para alta");
            System.out.println("2)buscar por ID");
            System.out.println("3)Para Baja logica por id");
            System.out.println("4)listar activas");
            System.out.println("5)nombre por id");
            System.out.println("0)Para salir");
            opc=leer.nextInt();
            if(opc==0){
                System.out.println("Salir");
            }else{
                switch (opc){
                    case 1:
                        procesosDePersona.alta(personas);
                        break;
                    case 2:
                        procesosDePersona.buscarId(personas);
                        break;
                    case 3:
                        procesosDePersona.darDeBajaLogica(personas);
                        break;
                    case 4:
                        procesosDePersona.imprimirTodalalista(personas);
                        break;
                    case 5:
                        procesosDePersona.actualizarElNombre(personas);
                        break;
                    default:
                        System.out.println("Opcion invalida");
                }
            }

        }while (opc!=0);










    }
}