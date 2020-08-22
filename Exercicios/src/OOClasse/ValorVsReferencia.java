package OOClasse;

public class ValorVsReferencia {
	public static void main(String[] args) {
		double a = 2;
		double b = a; //atribuição por valor
		a++;
		b--;
		System.out.println(a + " "+  b);
		AreaCirc c = new AreaCirc(10);
		AreaCirc d = c;
		System.out.println(c.area());
		System.out.println(d.area());
		
		voltarAreaParaValorPadrao(c);
		
		System.out.println(c.area());
		
		int e = 5;
		alterarPrimitivo(e);
		System.out.println(e);
	}
	
	private static void voltarAreaParaValorPadrao(AreaCirc a) {
		a.raio = 1996;
	}
	
	private static void alterarPrimitivo(int a) {
		a++;
	}
}
