/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author João Victor
 */
public class SomaTres extends SomaDois implements Runnable{
    private int valor3;
    private int tempo;
    
    public SomaTres(int tempo){
        this.tempo = tempo;
    }
    
    public int somar(){
        return this.getValor1()+this.getValor2()+this.valor3;
    }
    public void run(){
        for(int x = 0; x <=10; x++){
            System.out.println("Rodada: " + x + "\r\nValor da Soma: " + somar());
        
            try {
                Thread.sleep(this.tempo);
            } catch (InterruptedException ex) {
                Logger.getLogger(SomaTres.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public int getValor3() {
        return valor3;
    }

    public void setValor3(int valor3) {
        this.valor3 = valor3;
    }
    
    
}
