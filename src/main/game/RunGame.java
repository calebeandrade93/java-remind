package main.game;

import main.game.jogos.CallOfDuty;
import main.game.jogos.GodOfWar;
import main.game.jogos.Jogo;
import main.game.jogos.Sonic;
import main.game.plataforma.Plataformas;

import java.util.Scanner;

public class RunGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual jogo deseja jogar ? " + "\n" +
                "1 - Sonic" +"\n" +
                "2 - God Of War" +"\n" +
                "3 - Call Of Duty");
        int jogo = scanner.nextInt();
        scanner.close();

        switch (jogo){
            case 1 -> exibirInfoDoJogo(new Sonic());
            case 2 -> exibirInfoDoJogo(new GodOfWar());
            case 3 -> exibirInfoDoJogo(new CallOfDuty());
            default -> System.out.println("Jogo Desconhecido");
        }
    }

    public static void exibirInfoDoJogo(Jogo jogo) {
        StringBuilder plataformas = new StringBuilder();

        for (Plataformas p : jogo.getPlataformas()) {
            plataformas.append(p.getPlataforma()).append(", ");
        }

        if (plataformas.length() > 0) {
            plataformas.setLength(plataformas.length() - 2);
        }

        System.out.println("Jogo escolhido: " + jogo.getName());
        System.out.println("Roda nas plataformas: " + plataformas);
    }
}
