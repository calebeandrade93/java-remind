package utilss.generics;

import java.util.Set;

public class Generics {

    static void main(String[] args) {

        StartMisture<Object> cor = new StartMisture<>();
        System.out.println(cor.startMachine());
    }
}

class CorMixture<E> {

    private Set<E> cores;

    public CorMixture(Set<E> cores){
        this.cores = cores;
    }

    public String misturarCores() {

        for (E cor : this.cores){
            if (cor instanceof Number) {
                return "Não posso misturar numeros";
            }
        }
        return "Cores sendo misturadas";
    }
}

class StartMisture<E> {
    CorMixture<Object> corX = new CorMixture<>(Set.of("Vermelho", "Amarelo", "Azul", 1, 2));
    public String startMachine() {
        return corX.misturarCores();
    }
}
