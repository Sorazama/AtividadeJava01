package listaexercicios1;

import java.util.Scanner;

public class exercicio002 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Solicita ao usuário para inserir um número
	        System.out.println("Por favor, insira um número:");
	        int numero = scanner.nextInt();

	        // Verifica divisibilidade
	        boolean divisivelPor10 = (numero % 10 == 0);
	        boolean divisivelPor5 = (numero % 5 == 0);
	        boolean divisivelPor2 = (numero % 2 == 0);

	        // Informa ao usuário sobre a divisibilidade do número
	        if (divisivelPor10) {
	            System.out.println("O número é divisível por 10.");
	        } else if (divisivelPor5) {
	            System.out.println("O número é divisível por 5.");
	        } else if (divisivelPor2) {
	            System.out.println("O número é divisível por 2.");
	        } else {
	            System.out.println("O número não é divisível por 10, 5 ou 2.");
	        }

	        scanner.close();
	}
}
