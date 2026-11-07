package edu.fatec.lp2.exercicio1;

public class MsgTexto extends Mensagem {

    private int numChar;

    public MsgTexto(Contatinho destinatario, String horaEnvio,
                    String conteudo) {
        super(destinatario, horaEnvio, conteudo);
        this.numChar = conteudo.length();
    }

    public int getNumChar() {
        return numChar;
    }

    @Override
    public Mensagem sendMessage(String texto) {
        setConteudo(texto);
        this.numChar = texto.length();

        System.out.println("Mensagem de texto enviada!");
        return this;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nNumero de caracteres: " + numChar;
    }
}
