package listaexercicios1;

import java.util.Scanner;

public class exercicio017 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
	        int contadorMaiores = 0;

	        for (int i = 1; i <= 20; i++) {
	            System.out.println("Digite a idade da pessoa " + i + ":");
	            int idade = scanner.nextInt();
	            if (idade >= 18) {
	                contadorMaiores++;
	            }
	        }

	        System.out.println("Número de pessoas maiores de idade: " + contadorMaiores);

	        scanner.close();
	}
}
