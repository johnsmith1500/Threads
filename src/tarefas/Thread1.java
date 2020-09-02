package tarefas;

public class Thread1 extends Thread {
    private String nome;
    private int valorFatorial;
    private int tempo;

public Thread1(String nome, int valor) {
    this.nome = nome;
    this.valorFatorial = valor;
    this.start();
}

public void run() {
        System.out.println("Nome: " + this.nome);
        int total = 1;
        for(int f = this.valorFatorial; f>1; f--){
            total*=f;
            System.out.println("Fatorial do " + this.valorFatorial + " = " + this.valorFatorial + "!" + " = " + total);
            try {
                this.sleep(tempo);
            } catch (final InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } System.out.println("Processo 1 – Fatorial de 10 Finalizado – valor final: "+total);
   }

public String getNome() {
    return nome;
}

public void setNome(final String nome) {
    this.nome = nome;
}

public int getValorFatorial() {
    return valorFatorial;
}

public void setValorFatorial(final int valorFatorial) {
    this.valorFatorial = valorFatorial;
}

public int getTempo() {
    return tempo;
}

public void setTempo(final int tempo) {
        this.tempo = tempo;
    }    

}