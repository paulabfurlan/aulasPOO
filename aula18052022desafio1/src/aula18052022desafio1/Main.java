package aula18052022desafio1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o n da sequencia:");
		int n = sc.nextInt();
		
		List<Integer> primos = new ArrayList<Integer>();
		int num = 2;
		int nDiv = 0;
		while(n > 0)
		{
			nDiv = 0;
			for(int i = 1; i <= num; i++)
			{
				if(num % i == 0)
					nDiv++;
			}
			
			if(nDiv == 2)
			{
				primos.add(num);
				n--;
			}
			
			num++;
		}
		
		System.out.println(primos);
	}

}
