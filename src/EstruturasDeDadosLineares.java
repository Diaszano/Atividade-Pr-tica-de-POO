//import java.util.Scanner;
public class EstruturasDeDadosLineares {

	public static void main(String[] args) {
		
		Filas fila = new Filas();
		Pilhas pilha = new Pilhas();
		System.out.println(fila.enqueue(new Nodo("Teste","12345")));
		System.out.println(fila.length());
		System.out.println(pilha.push(new Nodo("Teste","12345")));
		System.out.println(pilha.length());
		System.out.println(fila.dequeue());
		System.out.println(fila.length());
		System.out.println(pilha.pop());
		System.out.println(pilha.length());
		
		//Aqui tem um teste bem simples pra verificar a funcionalidade do codigo
		/*
		Scanner sc = new Scanner(System.in);
		int i = 0;
		Filas fila = new Filas();
		Pilhas pilha = new Pilhas();
		while(i < 3) {
			System.out.print("Digite o nome; ");
			String nome = sc.nextLine();
			System.out.print("Digite o numero; ");
			String numero = sc.nextLine();
			System.out.println("###############################");
			System.out.print("Fila = ");
			System.out.println(fila.enqueue(new Nodo(nome,numero)));
			System.out.println("###############################");
			System.out.print("Pilha = ");
			System.out.println(pilha.push(new Nodo(nome,numero)));
			//fila.ver();
			//pilha.ver();
			i+=1;
		}
		System.out.println("###############################");
		System.out.print("Fila = ");
		System.out.println(fila.length());
		System.out.println("###############################");
		System.out.print("Pilha = ");
		System.out.println(pilha.length());
		System.out.println("###############################");
		i = 0;
		while(i < 3) {
			System.out.println("###############################");
			System.out.print("Fila = ");
			System.out.println(fila.dequeue());
			fila.ver();
			System.out.println("###############################");
			System.out.print("Pilha = ");
			System.out.println(pilha.pop());
			pilha.ver();
			System.out.println("###############################");
			
			i+=1;
		}
		System.out.println("###############################");
		System.out.print("Fila = ");
		System.out.println(fila.length());
		System.out.println("###############################");
		System.out.print("Pilha = ");
		System.out.println(pilha.length());
		System.out.println("###############################");
		sc.close();
		*/
	}

}
