package listaexercicios1;

import java.util.Scanner;

public class exercicio013 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Celsius:");
        double celsius = scanner.nextDouble();

        double fahrenheit = (9 * celsius + 160) / 5;

        System.out.printf("A temperatura em Fahrenheit é: %.2f\n", fahrenheit);

        scanner.close();
        
	}
}
