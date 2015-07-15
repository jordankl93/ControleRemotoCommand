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
public class ComandoPortao implements Comando{
    private Portao portao;
    
    public ComandoPortao(Portao portao){
        this.portao = portao;
    }

    @Override
    public void executar() {
        portao.abrirPortao();
    }

    @Override
    public void desfazer() {
        portao.fecharPortao();
    }
    
}
