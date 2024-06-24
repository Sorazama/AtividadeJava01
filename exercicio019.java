package listaexercicios1;

import java.util.Scanner;

public class exercicio019 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite o valor da cotação do dólar:");
	        double cotacaoDolar = scanner.nextDouble();

	        System.out.println("Digite a quantidade de dólares disponíveis:");
	        double quantidadeDolares = scanner.nextDouble();

	        double valorEmReais = cotacaoDolar * quantidadeDolares;

	        System.out.printf("O valor em reais é: %.2f\n", valorEmReais);

	        scanner.close();
	}
}
