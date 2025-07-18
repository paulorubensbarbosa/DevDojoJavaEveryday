package Uregex.test;

import java.util.Scanner;

public class ScannerTest99RelembrandoScannerIn {
    public static void main(String[] args) {

        String texto = "Levi,Eren,Mikasa,1000,true";
        String[] nomes1 = texto.split(",");

        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();

        System.out.println("Olá " + nome);


//        Jeito mais avançado com collections e lambda
//        Arrays.stream(nomes1).forEach(s -> System.out.println(s.trim()));

    }
}
