public class UsuarioJogo {
	private String nome;
	private String nickName;
	private int pontuacao;
	private int nivel;
	
	public UsuarioJogo(String nome, String nickName)
	{
		this.nome = nome;
		this.nickName = nickName;
		this.pontuacao = 0;
		this.nivel = 0;
	}
	
	public void aumentarPontuacao()
	{
		this.pontuacao++;
	}
	
	public void subirNivel()
	{
		this.nivel++;
	}
	
	public void bonus(int valor)
	{
		this.pontuacao += valor;
	}
	
	public String getNickName()
	{
		return this.nickName;
	}
	
	public int getPontuacao()
	{
		return this.pontuacao;
	}
	
	public int getNivel()
	{
		return this.nivel;
	}
}
