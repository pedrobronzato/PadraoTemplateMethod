package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StreamingPlusTest {

    StreamingPlus streaming;

    @BeforeEach
    void setUp(){
        streaming = new StreamingPlus();
    }

    @Test
    void deveRetornarPreco(){
        assertEquals(100, streaming.getPreco());
    }

    @Test
    void deveRetornarTipo(){
        assertEquals("Streaming Plus", streaming.getTipo());
    }

    @Test
    void deveRetornarPrecoAssinaturaAnualTipoMensal(){
        streaming.setTipoAssinatura("Mensal");
        assertEquals(1200, streaming.verificarPrecoAnual());
    }
    @Test
    void deveRetornarPrecoAssinaturaAnualTipoAnual(){
        streaming.setTipoAssinatura("Anual");
        assertEquals(1080, streaming.verificarPrecoAnual());
    }

    @Test
    void deveRetornarInformacoes() {
        streaming.setTipoAssinatura("Mensal");
        assertEquals("Streaming Plus{preco=100.0, tipoAssinatura='Mensal', preco anual=1200.0}", streaming.getInfo());
    }
}