package Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;


//an ordered
public class ListTest01 {
    public static void main(String[] args) {

        //Com o generics você força em tempo de compilação que os objetos dentro da lista sejam do mesmo tipo
        List<String> nomes = new ArrayList<>(16);
        nomes.add("Paulo");
        nomes.add("DevDojo");

        //nomes.add(121);

        for (String nome : nomes){
            System.out.println(nome);
        }
        nomes.add("Saulo");
        System.out.println("--------------");

        //forIndexado
        for(int i = 0; i < nomes.size() ; i++){
            System.out.println(nomes.get(i));
        }



    }
}
