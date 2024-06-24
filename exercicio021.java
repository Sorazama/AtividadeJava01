package listaexercicios1;

import java.util.Scanner;

public class exercicio021 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite o valor da compra:");
	        double valorCompra = scanner.nextDouble();

	        double valorPrestacao = valorCompra / 5;

	        System.out.printf("Valor de cada prestação: %.2f\n", valorPrestacao);

	        scanner.close();
	}
}
