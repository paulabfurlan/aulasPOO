package aula06072022;

public class Licitante implements Observador {

	private String nome;

	private String sobrenome;

	private int identidade;

	private double valorMax;


	public Licitante(String nome, String sobrenome, int identidade, double valorMax) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.identidade = identidade;
		this.valorMax = valorMax;
	}


	/**
	 * @see java.Observador#atuar()
	 */
	public void atuar(double valor) {
		if(valor <= this.valorMax)
		{
			System.out.println("O licitante " + this.nome + " " + this.sobrenome + " deu um lance de " + valor);
		}
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSobrenome() {
		return sobrenome;
	}


	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}


	public int getIdentidade() {
		return identidade;
	}


	public void setIdentidade(int identidade) {
		this.identidade = identidade;
	}


	public double getValorMax() {
		return valorMax;
	}


	public void setValorMax(double valorMax) {
		this.valorMax = valorMax;
	}

	
}
