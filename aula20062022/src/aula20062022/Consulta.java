package aula20062022;

public class Consulta {
	private String data;
	private String especialidade;
	private int hora;
	private int minuto;
	
	public Consulta(String data, String especialidade, int hora, int minuto) 
	{
		this.data = data;
		this.especialidade = especialidade;
		this.hora = hora;
		this.minuto = minuto;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

}
