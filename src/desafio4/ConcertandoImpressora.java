package desafio4;

import java.util.Scanner;

public class ConcertandoImpressora {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tamanho = Integer.parseInt(sc.nextLine());;
		String[] stringsQuebradas = new String[tamanho];
		
		for(int i = 0; i < stringsQuebradas.length; i++) {
			stringsQuebradas[i] = sc.nextLine();
		}
		
		for(String stringQuebrada : stringsQuebradas) {
			
			String primeiraMetade = stringQuebrada.substring(0 , stringQuebrada.length() / 2);
			String segundaMetade = stringQuebrada.substring(stringQuebrada.length() / 2);
			
			StringBuilder resultado = new StringBuilder(primeiraMetade).reverse();
			resultado.append(new StringBuilder(segundaMetade).reverse());
			
			System.out.println(resultado);
		}
			
	}

}
