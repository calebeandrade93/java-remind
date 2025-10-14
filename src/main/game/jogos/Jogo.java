package main.game.jogos;

import main.game.plataforma.Plataformas;
import java.util.ArrayList;

public interface Jogo {

    String getName();
    ArrayList<Plataformas> getPlataformas();
}
