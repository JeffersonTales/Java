package OOClasse;

public class DataTeste {
	public static void main(String[] args) {
		Data d = new Data();
		d.dia = 1;
		d.mes = 7;
		d.ano = 2020;
		System.out.printf("%d/%d/%d", d.dia, d.mes, d.ano);
	}
}
