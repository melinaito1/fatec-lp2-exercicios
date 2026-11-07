package edu.fatec.lp2.exercicio1;

public class Whatsapp {

    private Contatinho[] contatos;
    private Mensagem[] mensagens;

    private int totalContatos;
    private int totalMensagens;

    public Whatsapp(int capacidadeContatos, int capacidadeMensagens) {
        if (capacidadeContatos <= 0 || capacidadeMensagens <= 0) {
            throw new IllegalArgumentException(
                    "As capacidades devem ser maiores que zero.");
        }

        contatos = new Contatinho[capacidadeContatos];
        mensagens = new Mensagem[capacidadeMensagens];

        totalContatos = 0;
        totalMensagens = 0;
    }

    public void adicionarContato(Contatinho contato) {
        if (contato == null) {
            throw new IllegalArgumentException("Contato invalido.");
        }

        if (totalContatos < contatos.length) {
            contatos[totalContatos] = contato;
            totalContatos++;
        } else {
            System.out.println("Lista de contatos cheia!");
        }
    }

    public void adicionarMensagem(Mensagem mensagem) {
        if (mensagem == null) {
            throw new IllegalArgumentException("Mensagem invalida.");
        }

        if (totalMensagens < mensagens.length) {
            mensagens[totalMensagens] = mensagem;
            totalMensagens++;
        } else {
            System.out.println("Lista de mensagens cheia!");
        }
    }

    public void listarContatos() {
        System.out.println("=== CONTATOS ===");

        for (int i = 0; i < totalContatos; i++) {
            System.out.println(contatos[i]);
        }
    }

    public void listarMensagens() {
        System.out.println("=== MENSAGENS ===");

        for (int i = 0; i < totalMensagens; i++) {
            System.out.println(mensagens[i]);
            System.out.println("----------------");
        }
    }
}
