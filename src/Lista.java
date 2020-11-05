import java.util.ArrayList;
public class Lista {
	protected int tamanho = 0;
	protected ArrayList<Nodo> contatos = new ArrayList<Nodo>();
	//Contrutores
	//---------------------
	protected Lista() {
		super();
	}
	// Pelo fato das subclasses não poderem permitir o acesso
	// de [insert, delete, get], então esses métodos tem q 
	// ser protected, assim só as subclasses tem acesso.
	//---------------------
	protected Lista(int tamanho, ArrayList<Nodo> contatos) {
		super();
		this.tamanho = tamanho;
		this.contatos = contatos;
	}
	
	protected int insert(int posicao, Nodo n) {
		if(this.tamanho == posicao - 1) {
			this.contatos.add(n);
			this.tamanho += 1;
			return 1;
		}
		return 0;
	}
	
	protected Nodo get(int posicao) {
		if(this.tamanho > posicao -1) {
			return this.contatos.get(posicao - 1);
		}
		return null;
	}
	
	protected int delete(int posicao) {
		if(this.tamanho > posicao -1) {
			this.contatos.remove(posicao - 1);
			this.tamanho -= 1;
			return 1;
		}
		return 0;
	}
	//---------------------
	// O tamanho vai ser o mesmo que length.
	//---------------------
	public int length() {
		return this.tamanho;
	}
	//---------------------
}
