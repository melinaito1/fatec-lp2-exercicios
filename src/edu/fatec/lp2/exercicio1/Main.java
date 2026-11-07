package edu.fatec.lp2.exercicio1;

public class Main {

    public static void main(String[] args) {

        // Criando o WhatsApp
        Whatsapp whatsapp = new Whatsapp(5, 10);

        // Criando contatos
        Contatinho ana = new Contatinho("Ana", "11999999999");
        Contatinho pedro = new Contatinho("Pedro", "11988888888");

        // Adicionando contatos
        whatsapp.adicionarContato(ana);
        whatsapp.adicionarContato(pedro);

        // Criando mensagens
        MsgTexto texto = new MsgTexto(
                ana, "10:30", "Ola, Ana!");

        MsgAudio audio = new MsgAudio(
                pedro, "10:35", "Audio de teste", 15);

        MsgFoto foto = new MsgFoto(
                ana, "10:40", "Foto da viagem", 2048);

        // Enviando mensagens
        texto.sendMessage("Tudo bem, Ana?");
        audio.sendMessage("Novo audio");
        foto.sendMessage("Foto enviada");

        // Adicionando mensagens ao WhatsApp
        whatsapp.adicionarMensagem(texto);
        whatsapp.adicionarMensagem(audio);
        whatsapp.adicionarMensagem(foto);

        // Listando contatos e mensagens
        whatsapp.listarContatos();
        whatsapp.listarMensagens();

        // Testando retorno da propria instancia
        Mensagem retorno = texto.sendMessage("Teste final");

        System.out.println(
                "Retornou a propria instancia? "
                        + (retorno == texto)
        );
    }
}
