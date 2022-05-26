package aula25052022;

public class Cachorro {
	private boolean apto;
	private String raca;
	private int anoNasc;
	private double peso;
	private boolean possuiChip;
	private boolean ferido;
	private String nome;
	
	public Cachorro(String raca, int anoNasc, double peso, boolean possuiChip, boolean ferido, String nome)
	{
		this.raca = raca;
		this.anoNasc = anoNasc;
		this.peso = peso;
		this.possuiChip = possuiChip;
		this.ferido = ferido;
		this.nome = nome;
	}
	
	public Cachorro(int anoNasc, double peso, boolean possuiChip, boolean ferido, String nome)
	{
		this.anoNasc = anoNasc;
		this.peso = peso;
		this.possuiChip = possuiChip;
		this.ferido = ferido;
		this.nome = nome;
	}
	
	public boolean aptoParaAdocao()
	{
		if(!this.ferido && (this.peso > 5.0))
		{
			this.apto = true;
		}
		else
		{
			this.apto = false;
		}
		
		return this.apto;
	}
	
	public String getNome()
	{
		return this.nome;
	}
}
