package aula25052022;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cachorro cachorro = new Cachorro("SRD", 2020, 5.1, true, true, "Caramelo");
		
		if(cachorro.aptoParaAdocao())
		{
			System.out.println("O cachorro " + cachorro.getNome() + " está apto para adoção");
		}
		else
		{
			System.out.println("O cachorro " + cachorro.getNome() + " não está apto para adoção");
		}

		Cachorro cachorro2 = new Cachorro("SRD", 2020, 5.1, true, false, "Caramela");
		
		if(cachorro2.aptoParaAdocao())
		{
			System.out.println("O cachorro " + cachorro2.getNome() + " está apto para adoção");
		}
		else
		{
			System.out.println("O cachorro " + cachorro2.getNome() + " não está apto para adoção");
		}
	}
}
