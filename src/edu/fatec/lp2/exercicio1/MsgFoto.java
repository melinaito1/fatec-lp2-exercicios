package edu.fatec.lp2.exercicio1;

public class MsgFoto extends Mensagem {

    private int tamanho;

    public MsgFoto(Contatinho destinatario, String horaEnvio,
                   String conteudo, int tamanho) {
        super(destinatario, horaEnvio, conteudo);
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public Mensagem sendMessage(String texto) {
        setConteudo(texto);

        System.out.println("Mensagem de foto enviada!");
        return this;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nTamanho: " + tamanho + " KB";
    }
}
