package aula20062022;

public class Particular extends Paciente {
	private double valor;
	private String rg;

	public Particular(String dataNasc, String nome, String sobrenome, boolean primConsul, Consulta consulta,
			double valor, String rg) 
	{
		super(dataNasc, nome, sobrenome, primConsul, consulta);
		this.valor = valor;
		this.rg = rg;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
}
