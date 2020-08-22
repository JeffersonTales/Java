package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
//import java.util.SortedSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
		//Set<String> listaAprovados = new HashSet<String>(); 'não vai ter ordernação
		// ou Set<String> lista = new HashSet<>();
		
		Set<String> listaAprovados = new TreeSet<String>(); //garante a ordem de inserção
		// ou SortedSet<String> listaAprovados = new TreeSet<String>();
				
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");
		
		for (String candidato : listaAprovados) {
			System.out.println(candidato);
		}
		
		Set<Integer> nums = new HashSet<Integer>();
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
		
		for(int n: nums) {
			System.out.println(n);
		}
	}
}
