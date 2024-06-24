package listaexercicios1;

import java.util.Scanner;

public class exercicio018 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        String nomeMaisNovo = "";
        int idadeMaisNova = Integer.MAX_VALUE;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite o nome da pessoa " + i + ":");
            String nome = scanner.next();
            System.out.println("Digite a idade da pessoa " + i + ":");
            int idade = scanner.nextInt();

            if (idade < idadeMaisNova) {
                idadeMaisNova = idade;
                nomeMaisNovo = nome;
            }
        }

        System.out.println("A pessoa mais nova é: " + nomeMaisNovo);

        scanner.close();
	}
}
