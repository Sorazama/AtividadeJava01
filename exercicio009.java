package listaexercicios1;

import java.util.Scanner;

public class exercicio009 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do salário do usuário:");
        double salarioUsuario = scanner.nextDouble();

        double salarioMinimo = 1212.00;
        double quantidadeSalariosMinimos = salarioUsuario / salarioMinimo;

        System.out.printf("O usuário ganha %.2f salários mínimos\n", quantidadeSalariosMinimos);

        scanner.close();
        
	}
}
