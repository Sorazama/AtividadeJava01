package listaexercicios1;

import java.util.Scanner;

public class exercicio003 {

	public static void main(String[] args) {
		 
		Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para inserir o saldo médio
        System.out.println("Por favor, insira o saldo médio do último ano:");
        double saldoMedio = scanner.nextDouble();

        // Calcula o valor do crédito com base no saldo médio
        double valorCredito = calcularCredito(saldoMedio);

        // Exibe o saldo médio e o valor do crédito
        System.out.printf("Saldo médio: %.2f\n", saldoMedio);
        System.out.printf("Valor do crédito: %.2f\n", valorCredito);

        scanner.close();
    }

    public static double calcularCredito(double saldoMedio) {
        double percentualCredito;

        // Determina o percentual de crédito com base no saldo médio
        if (saldoMedio >= 0 && saldoMedio <= 500) {
            percentualCredito = 0.0;
        } else if (saldoMedio >= 501 && saldoMedio <= 1000) {
            percentualCredito = 0.3;
        } else if (saldoMedio >= 1001 && saldoMedio <= 3000) {
            percentualCredito = 0.4;
        } else if (saldoMedio > 3000) {
            percentualCredito = 0.5;
        } else {
            percentualCredito = 0.0; // Caso de saldo negativo, não deve acontecer
        }

        // Calcula o valor do crédito
        return saldoMedio * percentualCredito;


	}
}
