import java.util.Scanner;

public class exercicio4
{
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

        double fund=0,med=0,tec=0,grad=0;
		int vez,quantos;
		System.out.print("Quantos alunos serão cadastrados:");
		quantos = leitor.nextInt();

		for (vez=1; vez<=quantos; vez++)
		{
			Scanner entrada = new Scanner(System.in);

            String nome,formacao;
            

			System.out.println("Qual o seu nome:");
			nome = entrada.nextLine();

			System.out.println("Qual é a sua formação - Fund, Medio, Tecnico, graduacao:");
			formacao = entrada.nextLine();
			
			if (formacao.equalsIgnoreCase("FUND"))
			{
			    fund = fund + 1;
			    System.out.println("O aluno "+nome+" tem formação fundamental");
		    }
		    if (formacao.equalsIgnoreCase("MEDIO"))
			{
			    med = med + 1;
			    System.out.println("O aluno "+nome+" tem formação media");
		    }
		    if (formacao.equalsIgnoreCase("TECNICO"))
			{
			    tec = tec + 1;
			    System.out.println("O aluno "+nome+" tem formação tecnica");
		    }
		    if (formacao.equalsIgnoreCase("GRADUACAO"))
			{
			    grad = grad + 1;
			    System.out.println("O aluno "+nome+" tem graduação");
		    }
		    
		    System.out.println("A quantidade de alunos com formações- fundamental: "+fund+" Media: "+med+" Tecnico: "+tec+" Graduação: "+grad);
	}
}
}