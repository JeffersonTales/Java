package oo.heranca;

public class Jogo {
	
	public static void main(String[] args) {
		Monstro monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 10;
		
		Heroi heroi = new Heroi();
		heroi.x = 10;
		heroi.y = 11;
		
		System.out.println("O Monstro tem ==> " + monstro.vida);
		System.out.println("O Herói tem ==> "+ heroi.vida);
		
		monstro.atacar(heroi);
		
		System.out.println("O Monstro tem ==> " + monstro.vida);
		System.out.println("O Herói tem ==> "+ heroi.vida);
		
		/*for (int i = 0; i < 5; i++) {
			j1.andar((i%2==0) ? Direcao.NORTE : Direcao.LESTE);
		}
		System.out.println(j1.x);
		System.out.println(j1.y);*/
	}
}
