package listaexercicios1;

import java.util.Scanner;

public class exercicio011 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do vendedor:");
        String nome = scanner.nextLine();

        System.out.println("Digite o salário fixo do vendedor:");
        double salarioFixo = scanner.nextDouble();

        System.out.println("Digite o total de vendas efetuadas pelo vendedor:");
        double totalVendas = scanner.nextDouble();

        double comissao = totalVendas * 0.15;
        double salarioFinal = salarioFixo + comissao;

        System.out.println("Nome: " + nome);
        System.out.printf("Salário fixo: %.2f\n", salarioFixo);
        System.out.printf("Salário final: %.2f\n", salarioFinal);

        scanner.close();
        
	}
}
