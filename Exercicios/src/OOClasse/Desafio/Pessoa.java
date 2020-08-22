package OOClasse.Desafio;

public class Pessoa {
	String nome;
	double peso;
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	protected void comer(Comida comida) {
		if(comida !=null) {
			this.peso += comida.peso;
		}
	}
	
	protected String apresentar() {
		return "Olá eu sou o " + nome + "e tenho " + peso + " Kgs.";
	}
}
