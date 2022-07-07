package aula06072022;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Leilao leilao = new Leilao(200.0, "Violão");
		Licitante licitante1 = new Licitante("Paula", "Furlan", 123, 300.0);
		Licitante licitante2 = new Licitante("Mariana", "Massote", 321, 200.0);
		
		ArrayList<Observador> observadores = new ArrayList<Observador>();
		observadores.add(licitante1);
		observadores.add(licitante2);

		leilao.notificar(observadores);
	}

}
