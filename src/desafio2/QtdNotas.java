package desafio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class QtdNotas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		List<Integer> notas = new ArrayList<Integer>();
		notas.add(100);
		notas.add(50);
		notas.add(20);
		notas.add(10);
		notas.add(5);
		notas.add(2);
		
		List<Integer> moedas = new ArrayList<Integer>();
		moedas.add(100);
		moedas.add(50);
		moedas.add(25);
		moedas.add(10);
		moedas.add(5);
		moedas.add(1);

		double valorTotal = sc.nextDouble();
		int reais = (int) Math.floor(valorTotal);
		int centavos = (int) Math.round((valorTotal - Math.floor(valorTotal)) * 100);
		
		System.out.println("NOTAS:");
		for(int i = 0; i < notas.size(); i++) {
			int nota = notas.get(i);
			int qtdNotas = reais / nota;
			if( qtdNotas != 0 ) reais = reais % nota;
			System.out.println(qtdNotas + " nota(s) de R$ "+ formatNumber((double) nota));
		}
		
		centavos += reais * 100;
	
		System.out.println("MOEDAS:");
		for ( int i = 0; i < moedas.size(); i++) {
			int moeda = moedas.get(i);
			int qtdMoedas = centavos / moeda;
			if(qtdMoedas != 0 ) centavos = centavos % moeda;
			System.out.println(qtdMoedas + " moeda(s) de R$ "+ formatNumber( (double) moeda / 100 ));
		}
		
	}
	
	public static String formatNumber(Double number) {
		String formatedNumber = String.format("%.2f", number);
		return formatedNumber.replace(",", ".");
	}

}
