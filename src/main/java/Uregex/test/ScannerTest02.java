package Uregex.test;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {

        String texto = "Levi,Eren,Mikasa,1000,true,false,oi,teste,123193";
        String[] nomes1 = texto.split(",");

        Scanner scanner = new Scanner(texto);
        scanner.useDelimiter(",");

        while (scanner.hasNext()){
            if (scanner.hasNextInt()){
                int i = scanner.nextInt();
                System.out.println("Int: " + i);
            } else if (scanner.hasNextBoolean()){
                boolean b = scanner.nextBoolean();
                System.out.println("boolean: " + b);
            } else {
                System.out.println(scanner.next());
            }
        }


//        Jeito mais avançado com collections e lambda
//        Arrays.stream(nomes1).forEach(s -> System.out.println(s.trim()));

    }
}
