package oo.composicao;

public class CarroTeste {
	public static void main(String[] args) {
		Carro c1 = new Carro();
		System.out.println(c1.estaLigado());
		
		c1.ligar();
		System.out.println(c1.estaLigado());
		
		System.out.println(c1.motor.giros());
		
		for (int i = 0; i < 4; i++) {
			c1.acelerar();
		}
		
		System.out.println(c1.motor.giros());
		
		
		for (int i = 0; i < 4; i++) {
			c1.frear();
		}
		
		System.out.println(c1.motor.giros());
		
		//Relação Bidimensional
		System.out.println(c1.motor.carro.motor.carro.motor.giros());
	}
	
	
}
