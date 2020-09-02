/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefas;

/**
 *
 * @author João Victor
 */
public class Thread3 extends Thread {
 private String nome;
 private int tempo;
 private int valor;
 
public Thread3(String nome){
    this.nome = nome;
    this.start(); 
}
 
public static int fibonacci(int num) {
    if(num < 2){
        return 1;
}
   return fibonacci(num-1) + fibonacci(num-2);
}
    //System.out.println("Nome: " + this.nome);
public void run(){
    System.out.println("Nome: "+this.nome);
           for(int i=0; i<20; i++) {
			System.out.print(fibonacci(i) + ", ");
                try {
                    this.sleep(tempo);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } System.out.println("\r\nProcesso 3 - Fibonacci de 20 Finalizado – valor do 20º termo: 6765");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }



}
