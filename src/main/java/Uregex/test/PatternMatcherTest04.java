package Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Usamos símbolos e ele vai identificar padrões nos textos
public class PatternMatcherTest04 {
    public static void main(String[] args) {

        //Meta caracteres:
        // \d = todos os dígitos (0-9)
        // \D = retorna tudo oque não for dígito
        // \s = Espaços em branco ex =  \t = Tab \n = Shift enter \f \r
        // \S = Todos os caractedes excluindo os espaços em branco
        // /w = a-z A-Z, dígitos, _
        // \W = ignora o alfabeto maiúsculo e minúsculo e _
        // [] = Range de caracteres
        // ? = Zero ou uma ocorrencia
        // * = Zero ou mais ocorrencia
        // + = uma ou mais ocorrencia
        // de {n, m} ocorrencia
        // () = agrupamento
        // | = ou
        // $ = fim da linha


        //O + Faz com que seja verificado até o delimitador que é o espaço :\\s ou o fim da linha : $, se á "UMA OU MAIS OCORRêNCIA" da expressão: ([0-9a-fA-F])
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";

        String texto = "12 0x 0X 0xFFABC 0x10G 0x1";


         Pattern pattern = Pattern.compile(regex);
         Matcher matcher = pattern.matcher(texto);


         System.out.println("texto:  " + texto);
         System.out.println("indice: 0123456789");
         System.out.println("regex "+ regex);

         System.out.println("Posições encontradas: ");


         while (matcher.find()){
             System.out.print(matcher.start() + " " + matcher.group() + "\n");
         }

         //Para escrever um número hexadecimal no java, você precisa colocar no início 0x ou 0X
//         int numeroHex = 0x59F86A;
//        System.out.println(numeroHex);


    }
}
