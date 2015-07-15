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
public class Carro {
    private boolean ligado;
    
    public Carro(){
        ligado = false;
    }
    
    public boolean estaLigado(){
        return ligado;
    }
    
    public boolean estaDesligado(){
        return (!ligado);        
    }
    
    public void ligarCarro(){
        if(estaDesligado()){
            ligado = true;
            System.out.println("Carro ligado");
        }
        else
            System.out.println("Carro já está ligado");
    }
    
    public void desligarCarro(){
        if(estaLigado()){
            ligado = false;
            System.out.println("Carro desligado");
        }
        else
            System.out.println("Carro já está desligado");
    }
}
