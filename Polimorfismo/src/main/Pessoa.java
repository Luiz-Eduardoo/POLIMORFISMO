package main;
// classe abstrata para ter o metodo de enviar email
public abstract class Pessoa {
    protected String nome;
    // metodo construtor com o nome da pessoa
    public Pessoa(String nome) {
        this.nome = nome;
    }
    // metodo get para acessar o atributo
    public String getNome() {
		return nome;
	}
    // metodo set para atribuir valor ao atributo
	public void setNome(String nome) {
		if(nome == null || nome.trim().isEmpty()) { // trim para tirar os espaços desnecessários e isEmpty para avisar se estiver vazio
			throw new IllegalArgumentException("O nome não pode estar vazio");
		}
		this.nome = nome;
	}

	// Método abstrato para enviar o email
    public abstract void enviarEmail(String mensagem, Pessoa destinatario);
}