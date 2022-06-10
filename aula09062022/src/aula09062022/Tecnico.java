package aula09062022;

public class Tecnico extends Assistente{
	private double bonus;
	
	public Tecnico(String nome, double salario, int matricula, double bonus)
	{
		super(nome, salario, matricula);
		this.bonus = bonus;
	}
	
	@Override
	public double ganhoAnual()
	{
		return (super.getSalario() + this.bonus) * 12.0;
	}
}