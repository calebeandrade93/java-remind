package utilss.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamAPI {

    static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Lucas Calebe");
        list.add("Lucas Marques");
        list.add("Carlos Antonio");
        list.add("Valdemir Ribeiro");
        list.add("Lucas Andrade");
        list.add("Lucas Calebe");

        System.out.println(list);

        Set<String> set = list
                .stream()
                .filter(name -> name.startsWith("Lucas"))
                .map(String::toUpperCase)
                .collect(Collectors.toSet());

        System.out.println(set);
    }
}
