package ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest03 {
    public static void main(String[] args) {
        List<String> strings = List.of("Paulo", "Rubens");
        List<Integer> integers = map(strings, s -> s.length());
        System.out.println(integers);

    }
    private static <T, R> List<R> map (List<T> list, Function<T, R> function){
        List<R> itens = new ArrayList<>();
        for (T t : list) {
            R r = function.apply(t);
            itens.add(r);
        }
        return itens;
    }
}
