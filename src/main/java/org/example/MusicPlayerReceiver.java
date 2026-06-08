package org.example;

public class MusicPlayerReceiver {
    private boolean tocando = false;
    private int volume = 50;

    public void ligar() {
        this.tocando = true;
    }

    public void desligar() {
        this.tocando = false;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isTocando() {
        return tocando;
    }

    public int getVolume() {
        return volume;
    }
}