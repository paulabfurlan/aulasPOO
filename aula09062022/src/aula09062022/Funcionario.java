package aula09062022;

public class Funcionario {
	private String nome;
	private double salario;
	
	public Funcionario(String nome, double salario)
	{
		this.nome = nome;
		this.salario = salario;
	}
	
	public double addAumento(double valor)
	{
		this.salario += valor;
		return this.salario;
	}
	
	public double ganhoAnual()
	{
		return this.salario * 12.0;
	}
	
	public String exibeDados()
	{
		return "Funcionario " + this.nome + " com salario de R$" + this.salario;
	}
	
	public String getNome()
	{
		return this.nome;
	}
	
	public double getSalario()
	{
		return this.salario;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public void setSalario(double salario)
	{
		this.salario = salario;
	}
}
