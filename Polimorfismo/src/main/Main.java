package main;

public class Main {
    public static void main(String[] args) {
    	// criando novo objeto dando valor aos atributos
        Jogador jogador = new Jogador("Neymar");
        Eu eu = new Eu("Luiz");
        // mensagem que vai ser enviada
        String mensagemneymar = "Bora um fut sexta?";
        String mensagemluiz = "Simbora meu vei.";

        jogador.enviarEmail(mensagemneymar, eu); // email do neymar
        eu.enviarEmail(mensagemluiz, jogador); // email resposta do luiz
    }
}