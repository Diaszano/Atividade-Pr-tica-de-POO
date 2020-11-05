
public class Nodo {
	private String nome;
	private String numero;
	
	// Foi feita pra ter uma melhor visualização do programa.
	/*
	public String toString() {
		return "Nome do contato = " + nome + "\n" + "Telefone de" + nome + " numero = " + numero ;
	}
	*/
	public Nodo() {
		super();
	}
	
	public Nodo(String nome, String numero) {
		super();
		this.nome = nome;
		this.numero = numero;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getNumero() {
		return numero;
	}
	
}
