package main.game.jogos;

import main.game.plataforma.Plataformas;

import java.util.ArrayList;

public class Sonic implements Jogo {

    private ArrayList<Plataformas> plataformas = new ArrayList();
    private String name = "Sonic";

    public Sonic(){
        this.plataformas.add(Plataformas.SEGA);
        this.plataformas.add(Plataformas.PC);
    }

    @Override
    public ArrayList<Plataformas> getPlataformas(){
        return this.plataformas;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
