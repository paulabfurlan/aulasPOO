package aula07062022;

public class Objeto {
	protected int posx;
	protected int posy;
	protected char direcao;
	
	public Objeto(int x, int y, char direcao)
	{
		this.posx = x;
		this.posy = y;
		this.direcao = direcao;
	}
	
	public void irA(int x, int y, char direcao)
	{
		this.posx = x;
		this.posy = y;
		this.direcao = direcao;
	}
	
	public int getPosx()
	{
		return this.posx;
	}
	
	public int getPosy()
	{
		return this.posy;
	}
}
