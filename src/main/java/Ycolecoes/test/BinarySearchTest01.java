package Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(2);
        numeros.add(0);
        numeros.add(4);
        numeros.add(3);

        //retorna o indice do que estamos procurando ou (-(ponto de inserção) -1)
        //A lista PRECISA estar ordenada antes da busca binária
        Collections.sort(numeros);

        System.out.println(numeros);
        System.out.println(Collections.binarySearch(numeros,1));
        System.out.println(Collections.binarySearch(numeros, 2));
    }
}
