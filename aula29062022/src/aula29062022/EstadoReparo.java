package aula29062022;

public interface EstadoReparo 
{
	public void mudarEndereco(String endereco);
	public void darOrcamento(double valor);
	public void adicionarItensExtras(double valorExtra);
	public void mudarEstado();
}
