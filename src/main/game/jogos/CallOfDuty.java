package main.game.jogos;

import main.game.plataforma.Plataformas;

import java.util.ArrayList;

public class CallOfDuty implements Jogo {

    private ArrayList<Plataformas> plataformas = new ArrayList<>();
    private String name = "Call of Duty";

    public CallOfDuty() {
        this.plataformas.add(Plataformas.XBOX);
        this.plataformas.add(Plataformas.PLAYSTATION);
    }

    @Override
    public ArrayList<Plataformas> getPlataformas() {
        return this.plataformas;
    }

    @Override
    public String getName() {
        return name;
    }
}
