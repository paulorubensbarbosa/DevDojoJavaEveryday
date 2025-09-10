package ZZAclassesinternas.test;

class Animal{
    public void walk(){
        System.out.println("Animal Walkink");
    }
}

public class AnonymousClassesTest01 {
    public static void main(String[] args) {
        //classe anonima
        Animal animal = new Animal(){
            @Override
            public void walk() {
                System.out.println("Walking in the Shadow");
            }
        };
        animal.walk();
    }
}
