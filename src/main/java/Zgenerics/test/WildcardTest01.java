package Zgenerics.test;

abstract class Animal {
    public abstract void consulta();
}

class Cachorro implements AnimalTest{
//    @Override
//    public void consulta() {
//        System.out.println("consultando cachorro");
//    }

    @Override
    public void consultaInterface() {
        System.out.println("consultando Cachorro através da interface");
    }
}

class Gato extends Animal {
    @Override
    public void consulta() {
        System.out.println("consultando gato");
    }
}

interface AnimalTest {
    void consultaInterface();
}

public class WildcardTest01 {
    public static void main(String[] args) {
        Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
        Gato[] gatos = {new Gato(), new Gato()};

//        printConsulta(gatos);

//        Animal[] animals = {new Gato(), new Cachorro()};
//        printConsulta(animals);
    }
    private static void printConsulta(Animal[] animals){
        for (Animal animal : animals) {
            animal.consulta();
        }
//        animals[1] = new Gato();
    }
}
