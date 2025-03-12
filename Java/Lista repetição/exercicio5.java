import java.util.Scanner;

public class exercicio5
{
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

        double maior=0,menor=0,fem=0,masc=0;
		int vez,quantos;
		System.out.print("Quantos alunos serão cadastrados:");
		quantos = leitor.nextInt();

		for (vez=1; vez<=quantos; vez++)
		{
			Scanner entrada = new Scanner(System.in);

            String nome,sexo;
            int idade;

			System.out.println("Qual o seu nome:");
			nome = entrada.nextLine();

			System.out.println("Qual é o seu sexo- M ou F:");
			sexo = entrada.nextLine();
			
			System.out.print("Qual é a sua idade:");
		    idade = leitor.nextInt();
			
			if (sexo.equalsIgnoreCase("M"))
			{
			    masc = masc + 1;
			    System.out.println("O aluno "+nome+" é do sexo masculino");
		    }
		    if (sexo.equalsIgnoreCase("F"))
			{
			    fem = fem + 1;
			    System.out.println("O aluno "+nome+" é do sexo feminino");
		    }
		    if (idade < 18)
			{
			    menor = menor + 1;
			    System.out.println("O aluno "+nome+" é menor de idade");
		    }
		    if (idade >= 18)
			{
			    maior = maior + 1;
			    System.out.println("O aluno "+nome+" é maior de idade");
		    }
		    
		    System.out.println("A quantidade de alunos masculinos é Masculino: "+masc+" Feminino: "+fem+" Maior: "+maior+" Menor: "+menor);
	}
}
}