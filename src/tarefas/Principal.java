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

/**
 * App
 */
public class Principal {

    public static void main(String[] args) {
       /* Multiplica m = new Multiplica("Multiplicação 1", 5);
        m.setTempo(1000);
        //m.start();

        Multiplica m2 = new Multiplica("Multiplicação 1", 10);
        m2.setTempo(1000);*/

       Thread1 f = new Thread1("Processo 1 – Fatorial de 10", 10);
       f.setTempo(2000);
       
       Thread2 m = new Thread2("Processo 2- Exibição de Mensagem em um Laço");
       m.setTempo(1000);
       
       Thread3 fi = new Thread3("Processo 3- Cálculo de Fibonacci");
       fi.setTempo(500);
       
       SomaTres s3 = new SomaTres(800);
       s3.setValor1(20);
       s3.setValor2(40);
       s3.setValor3(60);
       Thread ts3 = new Thread(s3);
       ts3.start();
        
    }
}

