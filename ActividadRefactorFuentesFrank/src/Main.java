public class Main {
    public static void main(String[] args) {
        Scanner leer = new scanner(System.in);
        System.out.print("a: ");
        int num_a = pedir_entero(scanner);
        System.out.print("b: ");
        int b = leer.nextInt();
        System.out.print("c: ");
        int c = leer.nextInt();

        int suma = a + b + c;
        System.out.println("suma=" + suma);
        System.out.println("prom=" + (suma / 3.0));
    }
    public static int pedir_entero (scanner leer){
        System.out.println("Dame un numero");
        int numero = leer.nextInt();
        return numero;
    }
}
