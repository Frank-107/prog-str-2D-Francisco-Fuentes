public class Main {
    public static void main(String[] args) {
        Perro fido = new Perro("fido");
        Gato raul = new Gato("Raul");
        fido.comer();
        fido.hacerSonido();
        raul.comer();
        raul.hacerSonido();
        System.out.println("------------");

        Animal[] animales = new Animal[3];
        animales[0] = new Perro("Ramonchis");
        animales[1] = new Gato("Salem");
        animales[2] = new Perro("firulais");
        for (Animal animal: animales){
            animal.hacerSonido();
        }
        System.out.println("----------");
        Animal miercoles = new Perro("Miercoles");

        if(miercoles instanceof Perro){
            Perro miercoles1 = (Perro) miercoles;
            ((Perro) miercoles).marcarTerritorio();

        }

    }
}