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
public class Portao {    
    private boolean aberto;
    
    public Portao(){
        aberto = false;
    }
    
    public boolean estaAberto(){
        return aberto;
    }
    
    public boolean estaFechado(){
        return (!aberto);        
    }
    
    public void abrirPortao(){
        if(estaFechado()){
            aberto = true;
            System.out.println("Portao aberto");
        }
        else
            System.out.println("Portao já está aberto");
    }
    
    public void fecharPortao(){
        if(estaAberto()){
            aberto = false;
            System.out.println("Portao fechado");
        }
        else
            System.out.println("Portao já está fechado");
    }
    
}
