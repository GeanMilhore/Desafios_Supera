package desafio3;

import java.util.Scanner;

public class ValorAlvo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] valores = new int[sc.nextInt()];
		int alvo = sc.nextInt();
		int pares = 0;
		
		
		for(int i = 0; i < valores.length; i++)
			valores[i] = (i+1);
		
		for(Integer i : valores) {
			for(Integer j : valores) {
				if((i - j) == alvo) pares++;
			}
		}
			
				
		System.out.println(pares);
 	}

}
