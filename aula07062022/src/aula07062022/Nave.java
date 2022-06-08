package aula07062022;

public class Nave extends Objeto{
	private double velocidade;
	private int vida;
	
	public Nave(int x, int y, char direcao, double velocidade)
	{
		super(x, y, direcao);
		this.velocidade = velocidade;
		this.vida = 100;
	}
	
	public void irA(int x, int y, char direcao)
	{
		if(this.direcao != direcao)
			this.girar(direcao);
		super.posx = x;
		super.posy = y;
		System.out.println("Movendo a nave para a posição (" + super.posx
							+ "," + super.posy + ") na velocidade " + this.velocidade);
	}
	
	public void girar(char direcao)
	{
		super.direcao = direcao;
	}
	
	public void restaVida(int valor)
	{
		this.vida -= valor;
		
		if(this.vida <= 0)
			System.out.println("Morreu!");
	}
}
