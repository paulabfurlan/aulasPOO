package aula20062022;
public class Paciente {
	private String dataNasc;
	private String nome;
	private String sobrenome;
	private boolean primConsul;
	private Consulta consulta;

	public Paciente(String dataNasc, String nome, String sobrenome, boolean primConsul, Consulta consulta) 
	{
		this.dataNasc = dataNasc;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.primConsul = primConsul;
		this.consulta = consulta;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
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

	public boolean isPrimConsul() {
		return primConsul;
	}

	public void setPrimConsul(boolean primConsul) {
		this.primConsul = primConsul;
	}

	public Consulta getConsulta() {
		return consulta;
	}

	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}

	public void avaliacaoIni() 
	{
		if(this.primConsul)
			System.out.println("É necessário fazer a avaliação do paciente");

	}

}
