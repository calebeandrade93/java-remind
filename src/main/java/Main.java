import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //Primitivos
        byte b = 100;
        short s = 1000;
        int i = 100000;
        long l = 100000000L;
        float f = 10.5f;
        double d = 20.5;
        char c = 'A';
        String str = "Calebe";
        boolean bool = true;

        int[] colecaoDeInteiros = {1, 2, 3, 4, 5};
        int[] meusNumeros = new int[200];

        if(100 == i) {
            System.out.println("Verdadeiro");
        } else if (i == d) {
            System.out.println("Else if");
        }
        else {
            System.out.println("Falso");
        }

        System.out.println(colecaoDeInteiros[0]);
        System.out.println("Meu array é de tamanho: " + meusNumeros.length);


        ArrayList<String> lista = new ArrayList<>();
        lista.add("novo elemento");
        lista.add("Lucas");
        lista.add("Calebe");

        System.out.println(lista.get(2));


        for(int ii = 0; ii < lista.size(); ii ++){
            System.out.println(lista.get(ii));
        }

        for(String string : lista){
            System.out.println(string);
        }

        int contador = 0;
        while(contador < 3){
            System.out.println("Dentro do While");
            contador++;
        }




        
    }

}

