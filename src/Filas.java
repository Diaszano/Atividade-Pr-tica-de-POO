
public class Filas extends Lista{
	// A entrada nada mais é que o tamanho 
	// mais um junto com o nodo, então por
	// isso aproveitei um método existente.
	//---------------------
	public int enqueue(Nodo n) {
		return insert(this.tamanho + 1 ,n);
	}
	//---------------------
	// Como é a fila, o Nodo que sempre vai 
	// sair vai ser o primeiro, então logo 
	// aproveita um método existente e 
	// deixei um valor contante que visa 
	// o primeiro Nodo.
	//---------------------
	public int dequeue() {
		return delete(1);
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
