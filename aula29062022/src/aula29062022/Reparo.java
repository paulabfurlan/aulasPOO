package aula29062022;

public class Reparo 
{
	private String nome;
	private double valor;
	private String enderecoEntrega;

	public Reparo(String nome, String enderecoEntrega) 
	{
		this.nome = nome;
		this.valor = 0;
		this.enderecoEntrega = enderecoEntrega;
	}
	
	public void mudarEndereco(String endereco)
	{
		
	}
	public void darOrcamento(double valor) 
	{
		
	}
	public void adicionarItensExtras(double valorExtra)
	{
		
	}
	public void mudarEstado()
	{
		
	}

	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public double getValor() 
	{
		return valor;
	}

	public void setValor(double valor) 
	{
		this.valor = valor;
	}

	public String getEnderecoEntrega() 
	{
		return enderecoEntrega;
	}

	public void setEnderecoEntrega(String enderecoEntrega) 
	{
		this.enderecoEntrega = enderecoEntrega;
	}
	
}
