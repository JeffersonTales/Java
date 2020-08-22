package OOClasse;

public class Data {
	int dia; //variáveis de instancia (propriedades)
	int mes;
	int ano;
	
	//Construtor 1
	Data(){
		/*dia = 1;
		mes = 1;
		ano = 1970;*/
		this(1, 1, 1970);
	}
	
	//Construtor 2
	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public String obterDataFormatada() {
		final String formato = "%d/%d/%d";
		return String.format(formato, dia, mes, ano);
	}
	
	public void imprimirDataFormatada() {
		System.out.println(obterDataFormatada());
	}
	
}
