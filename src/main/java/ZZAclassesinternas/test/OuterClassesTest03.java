package ZZAclassesinternas.test;

public class OuterClassesTest03 {
    private String name = "Paulo";

    static class Nested {
        private String lastName = "Rubens";
        void print(){
            System.out.println(new OuterClassesTest03().name + " " + lastName);
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
