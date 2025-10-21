package com.calebe.pacote1;

public class Carro {

    public static String testeStatic = "STATICO!";

    protected void ligarCarro() {
        System.out.println("Ligando o Carro!");
    }

    public void pararCarro() {
        System.out.println("Parando o Carro!");
    }

    public class CarroTurbo {

        public void acionarTurbo(){
            System.out.println("Acinando Turbo");
        }

    }

}



