package ZZDoptional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class test {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("Teste String");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);

        Optional<String> nameOptional = findName("Paulo");
        String empty = nameOptional.orElse("EMPTY");
        System.out.println(empty);
        nameOptional.ifPresent(s -> System.out.println(s.toUpperCase()));

    }

    private static Optional<String> findName(String name){
        List<String> list = new ArrayList<>(List.of("Paulo", "DevDojo"));
        int i = list.indexOf(name);
        if(list.contains(name)){
            return Optional.of(list.get(i));
        }
        return Optional.empty();
    }

}
