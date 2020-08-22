package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Roberto"); //Put serva tanto para Incluir como para Substituir
		usuarios.put(2, "Ricardo");
		usuarios.put(3, "Rafaela");
		usuarios.put(3, "Rebeca");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		System.out.println(usuarios.keySet()); //chaves dos usuarios (não ordenada)
		System.out.println(usuarios.values()); //valores
		System.out.println(usuarios.entrySet()); //chaves e valores
		
		System.out.println(usuarios.containsKey(20));
		System.out.println(usuarios.containsValue("Rebeca"));
		
		System.out.println(usuarios.get(20)); //retorna pela chave
		System.out.println(usuarios.remove(1)); //remove pela chave
		System.out.println(usuarios.remove(4,"Rebeca"));//remove pela chave e valor
		
		for(int chave : usuarios.keySet()) { 
			System.out.println(chave);
		}
		
		for(String valor : usuarios.values()) {
			System.out.println(valor);
		}
			
		for(Entry<Integer, String> registro : usuarios.entrySet()) {
			System.out.print(registro.getKey() + " ===> ");
			System.out.println(registro.getValue());
		}
	}
}
