package listaexercicios1;

import java.util.Scanner;

public class exercicio020 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        int contador = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.println("Digite o número " + i + ":");
            int numero = scanner.nextInt();
            if (numero > 8) {
                contador++;
            }
        }

        System.out.println("Quantidade de números maiores que 8: " + contador);

        scanner.close();
	}
}
