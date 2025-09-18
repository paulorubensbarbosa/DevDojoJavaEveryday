package ZZClambdas.test;


import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {
        List<String> nomes = List.of("Paulo", "Rubens");
        List<Integer> inteiros = List.of(1, 2, 3, 4, 5);
        forEach(nomes, c -> System.out.println(c) );
        forEach(inteiros, c -> System.out.println(c) );
    }
    private static <T> void forEach (List<T> list, Consumer<T> consumer){
        for (T t : list) {
            consumer.accept(t);
        }
    }
}
