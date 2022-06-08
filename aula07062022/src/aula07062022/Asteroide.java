package aula07062022;

public class Asteroide extends Objeto{
	private int danos;
	
	public Asteroide(int x, int y, char direcao, int danos)
	{
		super(x, y, direcao);
		this.danos = danos;
	}
	
	public void irA(int x, int y, char direcao)
	{
		this.posx = x;
		this.posy = y;
		this.direcao = direcao;
	}
	
	public void dano(int danos)
	{
		this.danos += danos;
	}
}
