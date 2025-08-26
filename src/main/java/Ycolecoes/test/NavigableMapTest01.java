package Ycolecoes.test;

import Ycolecoes.dominio.Consumidor;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Paulo");
        Consumidor consumidor2 = new Consumidor("Saulo");


        NavigableMap<String, String> map = new TreeMap<>();
        map.put("A", "letra A");
        map.put("D", "letra D");
        map.put("B", "letra B");
        map.put("C", "letra C");
        map.put("E", "letra E");

        for (Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println(map.headMap("C", true));
        System.out.println(map.ceilingKey("C"));
        System.out.println(map.higherKey("C"));
        System.out.println(map.lowerKey("C"));
        System.out.println(map.floorKey("C"));

    }
}
