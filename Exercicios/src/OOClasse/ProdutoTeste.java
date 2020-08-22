package OOClasse;

public class ProdutoTeste {
	public static void main(String[] args) {
		Produto p1 = new Produto("Notebook");
		p1.preco = 10.5;
		Produto.desconto = 0.50;
		
		//var p2 = new Produto();
		
		System.out.println(p1.nome);
		//p1.teste();
	}
}
