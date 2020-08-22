package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		fila.add("Ana"); // se tiver uma fila com restri��o de tamanho e n�o tiver mais dispon�vel vai gerar um erro aqui.
		fila.offer("Bia"); // tamb�m adiciona, por�m se tiver alguma restri��o n�o vai gerar, erro vai retornar false, sen�o true.
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		System.out.println(fila.peek()); //pega o pr�ximo elemento da fila sem remover, se a fila tiver vazia vai trazer null
		System.out.println(fila.peek());
		System.out.println(fila.element()); //pega o pr�ximo elemento da fila sem remover, se a fila tiver vazia vai dar um erro.
	
		//fila.size();
		//fila.clear();
		//fila.isEmpty();
		//fila.contanis();
		
		System.out.println(fila.poll()); //retorna o proximo elemento da fila e remove, quando acabar os elementos retorna null.
		System.out.println(fila.remove()); // retorna o proximo elemento da fila e remove, se tiver vazia gera erro.
	
	}
}
