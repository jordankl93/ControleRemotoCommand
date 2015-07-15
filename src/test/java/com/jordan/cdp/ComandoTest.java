/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jordan.cdp;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jordan-Not
 */
public class ComandoTest {
    private Comando comando;
    
    public ComandoTest() {
    }
    
    @Before
    public void before() {
    }

    /**
     * Test of executar method, of class Comando.
     */
    @Test
    public void testExecutarCarro() {
        System.out.println("executar");
        Carro carro = new Carro();
        Comando instance = new ComandoCarro(carro);
        instance.executar();
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(true, carro.estaLigado());
    }

    /**
     * Test of desfazer method, of class Comando.
     */
    @Test
    public void testDesfazerCarro() {
        System.out.println("desfazer");
        Carro carro = new Carro();
        Comando instance = new ComandoCarro(carro);
        instance.desfazer();
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(true, carro.estaDesligado());
    }
    
    /**
     * Test of executar method, of class Comando.
     */
    @Test
    public void testExecutarPortao() {
        System.out.println("executar");
        Portao portao = new Portao();
        Comando instance = new ComandoPortao(portao);
        instance.executar();
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(true, portao.estaAberto());
    }

    /**
     * Test of desfazer method, of class Comando.
     */
    @Test
    public void testDesfazerPortao() {
        System.out.println("desfazer");
        Portao portao = new Portao();
        Comando instance = new ComandoPortao(portao);
        instance.desfazer();
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(true, portao.estaFechado());
    }
    
    
}
