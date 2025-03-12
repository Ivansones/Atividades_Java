import java.util.Scanner;

public class exercicio4
{
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

        double inf=0,mec=0,ele=0,des=0;
		int vez,quantos;
		System.out.print("Quantos alunos serão cadastrados:");
		quantos = leitor.nextInt();

		for (vez=1; vez<=quantos; vez++)
		{
			Scanner entrada = new Scanner(System.in);

            String nome,curso;
            

			System.out.println("Qual o seu nome:");
			nome = entrada.nextLine();

			System.out.println("Qual o seu curso - INF, MEC, ELE, DES:");
			curso = entrada.nextLine();
			
			if (curso.equalsIgnoreCase("INF"))
			{
			    inf = inf + 1;
			    System.out.println("O aluno "+nome+" faz parte dos curso de informatica");
		    }
		    if (curso.equalsIgnoreCase("MEC"))
			{
			    mec = mec + 1;
			    System.out.println("O aluno "+nome+" faz parte dos curso de mecanica");
		    }
		    if (curso.equalsIgnoreCase("ELE"))
			{
			    ele = ele + 1;
			    System.out.println("O aluno "+nome+" faz parte dos curso de eletronica");
		    }
		    if (curso.equalsIgnoreCase("DES"))
			{
			    des = des + 1;
			    System.out.println("O aluno "+nome+" faz parte dos curso de design grafico");
		    }
		    
		    System.out.println("A quantidade de alunos nos cursos- INF: "+inf+" MEC: "+mec+" ELE: "+ele+" DES: "+des);
	}
}
}