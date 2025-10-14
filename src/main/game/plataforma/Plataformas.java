package main.game.plataforma;

public enum Plataformas {
    XBOX("Xbox"),
    PLAYSTATION("Playstation"),
    SEGA("Sega");

    private String plataforma;

    Plataformas(String plataforma){
        this.plataforma = plataforma;
    }

    public String getPlataforma(){
        return this.plataforma;
    }
}
