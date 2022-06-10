package aula09062022;

public class Main {

	public static void main(String[] args) {
		Tecnico tecnico = new Tecnico("Marcelo", 10000.0, 12345, 500.0);
		Administrativo adm = new Administrativo("Paula", 8000.0, 54321, 'N', 2000.0);

		System.out.println(tecnico.exibeDados() + " e com ganho anual de R$" + tecnico.ganhoAnual());
		System.out.println(adm.exibeDados() + " e com ganho anual de R$" + adm.ganhoAnual());
	}

}
