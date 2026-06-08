package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CommandTest {

    @Test
    void deveExecutarAcaoDePlayAtravesDoBotao() {
        MusicPlayerReceiver player = new MusicPlayerReceiver();
        Comando comandoPlay = new ComandoPlay(player);
        BotaoInvoker botao = new BotaoInvoker();

        botao.setComando(comandoPlay);
        assertFalse(player.isTocando());

        // O botão é pressionado sem saber o que tem dentro
        botao.pressionar();

        // O receiver executou a ação correta nos bastidores
        assertTrue(player.isTocando());
    }

    @Test
    void deveModificarVolumeAtravesDeComandoParametrizado() {
        MusicPlayerReceiver player = new MusicPlayerReceiver();
        Comando aumentarVolume = new ComandoAumentarVolume(player, 20);
        BotaoInvoker botaoVol = new BotaoInvoker();

        botaoVol.setComando(aumentarVolume);
        assertEquals(50, player.getVolume());

        botaoVol.pressionar();

        assertEquals(70, player.getVolume());
    }
}