
public class Pilhas extends Lista{
	// A entrada nada mais é que o tamanho 
	// mais um junto com o nodo, então por
	// isso aproveitei um método existente.
	//---------------------
	public int push(Nodo n) {
		return insert(this.tamanho + 1 ,n);
	}
	//---------------------
	// Como é a pilha, o Nodo que sempre vai 
	// sair vai ser o último, então logo 
	// aproveita um método existente e 
	// deixei a variável tamanho que é o 
	// último valor do Nodo no vetor.
	//---------------------
	public int pop() {
		return delete(this.tamanho);
	}
	//Esse método eu criei pra ver o que 
	// estava acontecendo durante a 
	// execução do programa.
	/*
	public void ver() {
		for(Nodo contato : this.contatos) {
			System.out.println(contato.toString());
			System.out.println();
		}
	}
	*/
}
