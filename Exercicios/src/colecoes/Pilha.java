package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O Pequeno Príncipe"); // adiciona na pilha retorna true ou false
		livros.push("Don Quixote"); // adiciona na pilha, se tiver tamanho definido e não conseguir adicionar vai retornar um erro (excessão) 
		livros.push("O Hobbit");
		
		System.out.println(livros.peek()); //pega o proximo elemento
		System.out.println(livros.element());
		
		System.out.println(livros.poll()); //remove o priximo elemento
		System.out.println(livros.pop()); //também remove, retorna excessão caso não tenha o elemento.
		//System.out.println(livros.remove());
		
//		for(String livro: livros) {
//			System.out.println(livro);
//		}
	}
}
