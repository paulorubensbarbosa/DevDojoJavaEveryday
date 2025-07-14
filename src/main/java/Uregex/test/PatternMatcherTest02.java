package Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Usamos símbolos e ele vai identificar padrões nos textos
public class PatternMatcherTest02 {
    public static void main(String[] args) {
        //Meta caracteres:
        // \d = todos os dígitos (0-9)
        // \D = retorna tudo oque não for dígito
        // \s = Espaços em branco ex =  \t = Tab \n = Shift enter \f \r
        // \S = Todos os caractedes excluindo os espaços em branco
        // /w = a-z A-Z, dígitos, _
        // \W = ignora o alfabeto maiúsculo e minúsculo e _

         String regex = "\\d";
         String regex2 = "\\D";
         //String texto = "abaaba";
         String texto2 = " @#hhh889kjdas0312kkk2";


         Pattern pattern = Pattern.compile(regex);
         Matcher matcher = pattern.matcher(texto2);

         Pattern patter2 = Pattern.compile(regex2);
         Matcher matcher2 = patter2.matcher(texto2);

        System.out.println("texto:  " + texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex "+ regex);
        System.out.println("Posições encontradas");

        while (matcher.find()){
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }

        while (matcher2.find()){
            System.out.print(matcher2.start() + " = " + matcher2.group() + " ");
        }

    }
}
