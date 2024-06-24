package listaexercicios1;

import java.util.Scanner;

public class exercicio015 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        int soma = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.println("Digite a idade da pessoa " + i + ":");
            int idade = scanner.nextInt();
            soma += idade;
        }

        System.out.println("A soma das idades é: " + soma);

        scanner.close();
	}
}
