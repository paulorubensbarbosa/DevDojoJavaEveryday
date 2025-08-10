package Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;


//an ordered
public class ListTest01 {
    public static void main(String[] args) {

        //Com o generics você força em tempo de compilação que os objetos dentro da lista sejam do mesmo tipo
        List<String> nomes = new ArrayList<>(16);
        List<String> nomes2 = new ArrayList<>(16);

        nomes.add("Paulo");
        nomes.add("DevDojo");
        nomes2.add("Rubens");
        nomes2.add("Academy");

        nomes.addAll(nomes2);

        //nomes.remove("DevDojo");

        //nomes.add(121);

        for (String nome : nomes){
            System.out.println(nome);
        }
        nomes.add("Saulo");
        System.out.println("--------------");


        int size = nomes.size();
        //forIndexado
        for(int i = 0; i < size ; i++){

            System.out.println(nomes.get(i));

        }

        List<Integer> inteiros = new ArrayList<>();
        inteiros.add(1);
        System.out.println(inteiros);



    }
}
