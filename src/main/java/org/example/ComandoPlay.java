package org.example;

public class ComandoPlay implements Comando {
    private final MusicPlayerReceiver player;

    public ComandoPlay(MusicPlayerReceiver player) {
        this.player = player;
    }

    @Override
    public void executar() {
        player.ligar();
    }
}