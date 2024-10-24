package main;
//classe Jogador que herda o atributo nome e o metodo de enviar email
public class Jogador extends Pessoa {
	// metodo construtor para herdar o atributo nome
    public Jogador(String nome) {
        super(nome);
    }
    // metodo de enviar email com a formatação
    @Override
    public void enviarEmail(String mensagem, Pessoa destinatario) {
        System.out.println(nome + " Enviou um email:");
        System.out.println("Salve " + destinatario.getNome() + "!");
        System.out.println(mensagem + "\n");

    }
}