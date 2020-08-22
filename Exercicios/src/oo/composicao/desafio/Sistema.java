package oo.composicao.desafio;

public class Sistema {
	public static void main(String[] args) {
		
		
		Compra compra1 = new Compra();
		compra1.adicinarItem("Caneta", 9.67,100);
		compra1.adicinarItem(new Produto("Notebook",1897.88),2);
		
		Compra compra2 = new Compra();
		compra2.adicinarItem("Caderno", 10,10);
		compra2.adicinarItem(new Produto("Impressora",998.90),1);
		
		Cliente cliente = new Cliente("Maria Julia Morais");
		cliente.adicionarCompra(compra1);
		cliente.compras.add(compra2);
		
		System.out.println(cliente.obterValorTotal());
		
	}
}
