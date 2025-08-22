package Ycolecoes.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest01 {
    public static void main(String[] args) {
        //Set se você colocar um novo valor repetido de acordo com o compareTo, não adiciona esse novo valor, já no Map ele sobrescreve
        Map<String, String> map = new HashMap<>();
        //hashMap nao mantém a ordem de inserção, linkedHashMap mantém a ordem de insersão
        map.put("teklado", "teclado");
        map.put("mouze", "mouse");
        map.put("vc", "você");
        map.putIfAbsent("vc", "você");

        System.out.println(map);

        for (String key : map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }
        for (String value : map.values()) {
            System.out.println(value);
        }

        System.out.println("------------------------------");

        Set<Map.Entry<String, String>> entries = map.entrySet();

        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
