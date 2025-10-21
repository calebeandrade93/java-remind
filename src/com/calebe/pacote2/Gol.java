package com.calebe.pacote2;

import com.calebe.pacote1.Carro;

public class Gol extends Carro {

    public String modelo = "Gol";
    CarroTurbo carroTurbo = new CarroTurbo();

    public void getCarroTurbo() {

        carroTurbo.acionarTurbo();
    }
}
