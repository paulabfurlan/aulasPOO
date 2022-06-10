package aula09062022;

public class Administrativo extends Assistente{
	private char turno;
	private double adicional;
	
	public Administrativo(String nome, double salario, int matricula, char turno, double adicional)
	{
		super(nome, salario, matricula);
		this.turno = turno;
		this.adicional = adicional;
	}
	
	@Override
	public double ganhoAnual()
	{
		if(this.turno == 'N')
			return (super.getSalario() + this.adicional) * 12.0;
		else
			return super.getSalario() * 12.0;
	}
}
