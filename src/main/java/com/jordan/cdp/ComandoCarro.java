/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jordan.cdp;

/**
 *
 * @author Jordan-Not
 */
public class ComandoCarro implements Comando{
    private Carro carro;
    
    public ComandoCarro(Carro carro){
        this.carro = carro;
    }

    @Override
    public void executar() {
        carro.ligarCarro();
    }

    @Override
    public void desfazer() {
        carro.desligarCarro();
    }
    
}
