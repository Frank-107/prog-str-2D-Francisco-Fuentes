public class ShoppingCalculator {
    public final double IVA = 0.16;
    public double calcularSubtotal(double peso, int distancia, int tipo, boolean zona){
        double base;
        double precioPorPeso = peso*12;
        double precioPorDistancia;
        if (tipo==1){
            base = 50;
        }else{
            base = 90;
        }
        if (distancia<=50){
            precioPorDistancia = 20;
        }else if (distancia<=200){
            precioPorDistancia = 60;
        }else{
            precioPorDistancia = 120;
        }
        double subtotal;
        if (zona){
            subtotal = (base+precioPorDistancia+precioPorPeso)*1.1;
        }else{
            subtotal = base+precioPorDistancia+precioPorPeso;
        }
        return subtotal;

    }
    public double calcularIVA(double subtotal){
        return subtotal*IVA;
    }
    public double calcularTotal(double subtotal, double IVA){
        return subtotal+IVA;
    }







}
