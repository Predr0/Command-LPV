package org.example;

public class ComandoAumentarVolume implements Comando {
    private final MusicPlayerReceiver player;
    private final int incremento;

    public ComandoAumentarVolume(MusicPlayerReceiver player, int incremento) {
        this.player = player;
        this.incremento = incremento;
    }

    @Override
    public void executar() {
        int novoVolume = player.getVolume() + incremento;
        player.setVolume(Math.min(novoVolume, 100));
    }
}