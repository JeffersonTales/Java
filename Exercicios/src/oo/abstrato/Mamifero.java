package oo.abstrato;

/*Classe Abstrata
n�o se pode instanciar objetos � partir dessa classe,
ent�o sentido de ter uma classe abstrata � usado com
base na heran�a.*/


public abstract class Mamifero extends Animal{
	
	@Override
	public final String mover() {
		return "Usando as pastas";
	}
	
	public abstract String mamar();
}
