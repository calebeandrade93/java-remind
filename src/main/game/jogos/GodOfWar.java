package main.game.jogos;

import main.game.plataforma.Plataformas;

import java.util.ArrayList;

public class GodOfWar implements Jogo{

    ArrayList<Plataformas> plataformas = new ArrayList<>();
    private String name = "God Of War";

    public GodOfWar(){
        this.plataformas.add(Plataformas.PLAYSTATION);
    }

    @Override
    public ArrayList<Plataformas> getPlataformas(){
        return plataformas;
    }

    @Override
    public String getName() {
        return name;
    }
}
