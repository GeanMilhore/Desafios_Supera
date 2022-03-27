package desafio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ParesImpares {

	public static void main(String[] args) {
		
        List<Integer> pares = new ArrayList<Integer>();
        List<Integer> impares = new ArrayList<Integer>();
        List<Integer> resultado = new ArrayList<Integer>();
        
        Scanner sc = new Scanner(System.in);
        
        int quantidadeValores = sc.nextInt();
        for(int i = 0; i < quantidadeValores; i++) {
        	
        	int entrada = sc.nextInt();
        	
        	if (entrada % 2 == 0) pares.add(entrada);
        	else impares.add(entrada);
        }
        
        Collections.sort(pares);
        Collections.sort(impares);
        Collections.reverse(impares);
        resultado = pares;
        resultado.addAll(impares);
        
        for(Integer i : resultado)
        	System.out.println(i);
	}

}
