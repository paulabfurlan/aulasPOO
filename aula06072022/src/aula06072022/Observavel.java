package aula06072022;

import java.util.ArrayList;

public interface Observavel {

	public abstract void notificar(ArrayList<Observador> observadores);

}
