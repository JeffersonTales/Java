package OOClasse;

public class Produto {
	String nome;
	double preco;
	static double desconto = 0.25;
	
	//Construtor 1
	Produto(String nomeInicial){
		nome = nomeInicial;
	}
	
	//Contrustor 2
	Produto(){
		
	}
	
	public double precoComDesconto() {
		return preco * (1-desconto);
	}
	
	public void teste() {
		System.out.println("testando 1,2,3...");
	}
}
