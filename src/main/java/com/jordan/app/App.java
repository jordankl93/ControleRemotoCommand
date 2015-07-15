/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jordan.app;

import com.jordan.cdp.*;

/**
 *
 * @author Jordan-Not
 */
public class App {
    
    public static void main(String[] args){
        Carro carro = new Carro();
        Portao portao = new Portao();
        Comando comandoCarro = new ComandoCarro(carro);
        Comando comandoPortao = new ComandoPortao(portao);
        
        System.out.println("Ligando carro...");
        comandoCarro.executar();
        System.out.println("Desligar carro...");
        comandoCarro.desfazer();
        comandoCarro.desfazer();
    }
    
}
