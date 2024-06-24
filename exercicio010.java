package listaexercicios1;

import java.util.Scanner;

public class exercicio010 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite o saldo:");
	        double saldo = scanner.nextDouble();

	        double saldoReajustado = saldo * 1.015;

	        System.out.printf("Saldo com reajuste de 1.5%%: %.2f\n", saldoReajustado);

	        scanner.close();
        
	}
}
