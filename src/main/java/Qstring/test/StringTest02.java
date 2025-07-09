package Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "Paulo";
        String numeros = "012345";
        System.out.println(nome.charAt(1));

        System.out.println(nome.length());
        System.out.println(nome.replace("P", "S"));
        System.out.println(nome.toUpperCase());
        System.out.println(numeros.substring(0, 2));
        System.out.println(nome.trim()); //Remove os valores em brando do início e no fim da String
        System.out.println(numeros.substring(3, 6));
    }
}
