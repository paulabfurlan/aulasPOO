package aula20062022;

public class Publico extends Paciente implements Comparable
{
	private int cartaoSUS;

	public Publico(String dataNasc, String nome, String sobrenome, boolean primConsul, Consulta consulta,
			int cartaoSUS) 
	{
		super(dataNasc, nome, sobrenome, primConsul, consulta);
		this.cartaoSUS = cartaoSUS;
	}
	

	public int getCartaoSUS() {
		return cartaoSUS;
	}

	public void setCartaoSUS(int cartaoSUS) {
		this.cartaoSUS = cartaoSUS;
	}


	@Override
	public int compareTo(Object object) {
		Publico aux = (Publico) object;
		
		if(aux.cartaoSUS == this.cartaoSUS)
			return 0;
		else if(aux.cartaoSUS > this.cartaoSUS)
			return 1;
		else
			return -1;
	}
}
