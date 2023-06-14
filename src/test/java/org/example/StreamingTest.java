package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StreamingTest {

    Streaming streaming;

    @BeforeEach
    void setUp(){
        streaming = new Streaming();
    }

    @Test
    void deveRetornarPreco(){
        assertEquals(50, streaming.getPreco());
    }

    @Test
    void deveRetornarTipo(){
        assertEquals("Streaming", streaming.getTipo());
    }

    @Test
    void deveRetornarPrecoAssinaturaAnualTipoMensal(){
         streaming.setTipoAssinatura("Mensal");
         assertEquals(600, streaming.verificarPrecoAnual());
    }
    @Test
    void deveRetornarPrecoAssinaturaAnualTipoAnual(){
        streaming.setTipoAssinatura("Anual");
        assertEquals(540, streaming.verificarPrecoAnual());
    }


    @Test
    void deveRetornarInformacoes() {
        streaming.setTipoAssinatura("Mensal");
        assertEquals("Streaming{preco=50.0, tipoAssinatura='Mensal', preco anual=600.0}", streaming.getInfo());
    }



}