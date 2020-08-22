package OOClasse;

public class AreaCirc {
	double raio;
	static final double PI = 3.14;
	
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	double area() {
		return PI * Math.pow(raio, 2);
	}
	
	static double area(double pmRaio) {
		return PI * Math.pow(pmRaio, 2);
	}
}
