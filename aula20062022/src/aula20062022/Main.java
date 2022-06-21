package aula20062022;

public class Main {

	public static void main(String[] args) {
		Consulta consulta = new Consulta("20062022", "gastroenterologista", 2, 30);
		Consulta consulta2 = new Consulta("17062022", "ginecologista", 1, 0);
		Paciente paciente = new Particular("18071991", "Paula", "Furlan", true, consulta, 200.0, "12345");
		Publico paciente2 = new Publico("18071991", "Paula", "Furlan", true, consulta2, 123);
		
		paciente.avaliacaoIni();

		Publico paciente3 = new Publico("18071991", "Paula", "Furlan", true, consulta2, 321);
		System.out.println(paciente2.compareTo(paciente3));
	}

}
