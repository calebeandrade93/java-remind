package com.calebe;

import com.calebe.pacote2.Civic;
import com.calebe.pacote2.Gol;

import static com.calebe.pacote1.Carro.testeStatic;

public class Main {

    public static void main(String[] args) {

        Civic civic = new Civic();
        //civic.ligarCarro(); //Não consegue acessar, pois o método é protected, ele precisa ser public, caso contrário tem que criar uma função dentro da classe Civic.
        civic.pararCarro();
        civic.ligarCarro();

        Gol gol = new Gol();
        System.out.println("Modelo: " + gol.modelo);
        gol.getCarroTurbo();

        System.out.println(testeStatic);
    }
}
