package aula07062022;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nave nave = new Nave(0, 0, 'N', 1.5);
		Asteroide asteroide = new Asteroide(5, 5, 'S', 0);
		
		nave.irA(5, 5, 'L');
		
		if((nave.getPosx() == asteroide.getPosx()) && (nave.getPosy() == asteroide.getPosy()))
		{
			nave.restaVida(100);
			asteroide.dano(100);
		}
	}

}
