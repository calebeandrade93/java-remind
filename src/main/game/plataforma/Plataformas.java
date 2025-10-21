package main.game.plataforma;

public enum Plataformas {
    XBOX("Xbox"),
    PLAYSTATION("Playstation"),
    SEGA("Sega"),
    PC("PC");

    private String plataforma;

    Plataformas(String plataforma){
        this.plataforma = plataforma;
    }

    public String getPlataforma(){
        return this.plataforma;
    }
}
