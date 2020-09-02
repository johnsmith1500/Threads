/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author João Victor
 */

package tarefas;

public class Thread2 extends Thread{
    private String nome;
    private int tempo;

public Thread2(String nome) {
    this.nome = nome;
    this.start();
    
}    
public void run() {
        System.out.println("Nome: " + this.nome);
    
        for(int x=1; x<=20; x++){
            System.out.println("Processo 2 – em execução");
            try {
                this.sleep(tempo);
            } catch (final InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } System.out.println("Processo 2 - Finalizado");
    }

public String getNome() {
    return nome;
}

public void setNome(final String nome) {
    this.nome = nome;
}

public int getTempo() {
    return tempo;
}

public void setTempo(final int tempo) {
        this.tempo = tempo;
    }    

}
    
