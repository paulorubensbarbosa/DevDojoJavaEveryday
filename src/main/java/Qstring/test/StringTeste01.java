package Qstring.test;

public class StringTeste01 {
    public static void main(String[] args) {
        String nome = "Paulo"; //String constant pool
        String nome2 = "Paulo";

        nome = nome.concat("Rubens");

        System.out.println(nome == nome2);

    }
}
