package oo.abstrato;

/*Classe Abstrata
não se pode instanciar objetos à partir dessa classe,
então sentido de ter uma classe abstrata é usado com
base na herança.*/


public abstract class Mamifero extends Animal{
	
	@Override
	public final String mover() {
		return "Usando as pastas";
	}
	
	public abstract String mamar();
}
