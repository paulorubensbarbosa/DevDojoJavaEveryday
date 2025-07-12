package Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Usamos símbolos e ele vai identificar padrões nos textos
public class PatternMatcherTest01MeuTeste {
    public static void main(String[] args) {

        String texto = "testetetsettestsetestestsetestsetestestsetestttesttestestttstestes";
        String regex = "test";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        int count = 0;

        while (matcher.find()){

            System.out.println(matcher.start());
            count ++;

        }
        System.out.println("O padrão apareceu " + count + " Vezes");

    }
}
