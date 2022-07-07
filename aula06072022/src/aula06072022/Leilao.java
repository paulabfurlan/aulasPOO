package aula06072022;

import java.util.ArrayList;

public class Leilao implements Observavel {

	private double valor;

	private String descricao;


	public Leilao(double valor, String descricao) {
		this.valor = valor;
		this.descricao = descricao;
	}


	/**
	 * @see java.Observavel#notificar()
	 */
	public void notificar(ArrayList<Observador> observadores) {
		for(Observador o: observadores)
		{
			((Licitante) o).atuar(this.valor);
		}
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
}
