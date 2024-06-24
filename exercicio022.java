package listaexercicios1;

import java.util.Scanner;

public class exercicio022 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
	        int contador = 0;

	        for (int i = 1; i <= 20; i++) {
	            System.out.println("Digite o número " + i + ":");
	            int numero = scanner.nextInt();
	            if (numero >= 0 && numero <= 100) {
	                contador++;
	            }
	        }

	        System.out.println("Quantidade de números entre 0 e 100: " + contador);

	        scanner.close();
	}
}
