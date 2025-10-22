package utilss;

import java.util.*;

public class Main {

    static void main(String[] args) {

        //Principais collections
        // MAP = Chave:Valor
        // SET = Não pode existir elementos repetidos
        // List = Lista de elementos
        // Queue = Ordena as chamadas

        List<String> lista = new ArrayList<>();

        lista.add("Lucas");
        lista.add("Calebe");
        lista.add("Marques");
        lista.add("Andrade");

        System.out.println("Lista: " + lista);

        Set<String> set = new HashSet<>();
        set.add("Lucas");
        set.add("Calebe");
        set.add("Marques");
        set.add("Lucas");

        System.out.println("Set: " + set);

        Map<String, String> map = new HashMap<>();
        map.put("name", "Lucas");
        map.put("surname", "Andrade");

        System.out.println("Map: " + map);


        Queue<String> queue = new LinkedList<>();
        queue.add("Lucas");
        queue.add("Calebe");

        System.out.println("Queue: " + queue);



    }
}
