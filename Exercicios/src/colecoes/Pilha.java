package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O Pequeno Pr�ncipe"); // adiciona na pilha retorna true ou false
		livros.push("Don Quixote"); // adiciona na pilha, se tiver tamanho definido e n�o conseguir adicionar vai retornar um erro (excess�o) 
		livros.push("O Hobbit");
		
		System.out.println(livros.peek()); //pega o proximo elemento
		System.out.println(livros.element());
		
		System.out.println(livros.poll()); //remove o priximo elemento
		System.out.println(livros.pop()); //tamb�m remove, retorna excess�o caso n�o tenha o elemento.
		//System.out.println(livros.remove());
		
//		for(String livro: livros) {
//			System.out.println(livro);
//		}
	}
}
