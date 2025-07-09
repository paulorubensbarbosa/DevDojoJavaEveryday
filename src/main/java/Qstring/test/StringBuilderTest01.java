package Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Paulo Rubens";
        StringBuilder nomeBuild= new StringBuilder();

        nomeBuild.append("Paulo");
        Integer inteiro = Integer.parseInt(String.valueOf(nomeBuild));
        System.out.println(nomeBuild);
    }
}
