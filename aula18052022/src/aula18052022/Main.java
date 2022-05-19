package aula18052022;
import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class Main {
	
	static void quantosPacotes(String nome, double kgDia, List<Double> pacotes)
	{
		double soma = 0;
		int qtd = 0;
		for(int i = 0; i < pacotes.size(); i++)
		{
			soma += pacotes.get(i);
			
			if(soma >= kgDia)
			{
				qtd = i + 1;
				break;
			}
		}
		
		System.out.println("O cachorro " + nome + " vai precisar de " + qtd + " pacotes hoje");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do cachorro:");
		String nome;
		nome = sc.nextLine();
		
		System.out.println("Quantos quilos o " + nome + " come por dia?");
		double qtd;
		qtd = sc.nextDouble();
		
		System.out.println("O cachorro " + nome + " come " + qtd + " kg de racao por dia");
		
		List<Double> pacotes = new ArrayList<Double>();
		System.out.println("Digite a qtd do primeiro pacote:");
		pacotes.add(sc.nextDouble());	

		System.out.println("Tem mais algum pacote? [s/n]");
		char temPacote;
		temPacote = sc.next().charAt(0);
		
		while(temPacote == 's')
		{
			System.out.println("Digite a qtd do proximo pacote:");
			pacotes.add(sc.nextDouble());

			System.out.println("Tem mais algum pacote? [s/n]");
			temPacote = sc.next().charAt(0);
		}
		
		System.out.println(pacotes);
		
		quantosPacotes(nome, qtd, pacotes);

		
	}

}
