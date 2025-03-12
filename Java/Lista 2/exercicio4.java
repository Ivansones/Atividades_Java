import java.util.Scanner;

public class exercicio4
{
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		double valor1,valor2,resultado=0;
		String operacao;
        System.out.println("Qual é o seu tipo de operação - A,S,M e D:");
		operacao = leitor.nextLine();
		System.out.println("Qual é o primeiro valor:");
		valor1 = leitor.nextDouble();
		System.out.println("Qual é o segundo valor:");
		valor2 = leitor.nextDouble();
		

		if (operacao.equalsIgnoreCase("A"))
		{
			resultado = valor1 + valor2;
		}
		if (operacao.equalsIgnoreCase("S"))
		{
			resultado = valor1 - valor2;
		}
		if (operacao.equalsIgnoreCase("M"))
		{
			resultado = valor1 * valor2;
		}
		if (operacao.equalsIgnoreCase("D"))
		{
			resultado = valor1 / valor2;
		}

		System.out.println("O resultado da conta "+resultado);

	}
}