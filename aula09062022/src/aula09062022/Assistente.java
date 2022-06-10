package aula09062022;

public class Assistente extends Funcionario{
	private int matricula;
	
	public Assistente(String nome, double salario, int matricula)
	{
		super(nome, salario);
		this.matricula = matricula;
	}
	
	@Override
	public String exibeDados()
	{
		return "Assistente " + super.getNome() + " com matricula " + this.matricula + " e com salario de R$" + super.getSalario();
	}
	
	public int getMatricula()
	{
		return this.matricula;
	}
	
	public void setMatricula(int matricula)
	{
		this.matricula = matricula;
	}
}
