import java.util.Scanner;

public class exercicio1
{
	public static void main(String[] args) {
	    Scanner leitor = new Scanner(System.in);
	    
	    String nome,curso;
	    
	    
	    System.out.println("Qual é o seu nome:");
	    nome = leitor.nextLine();
	    
	    System.out.println("A qual curso pertence - ADM,DIR ou CEX:");
	    curso = leitor.nextLine();
	    if (curso.equalsIgnoreCase("ADM"))
	    {
	        System.out.println("O aluno "+nome+" faz parte do curso de administraçao.");
	    }
	    
	    if (curso.equalsIgnoreCase("DIR"))
	    {
	        System.out.println("O aluno "+nome+" faz parte do curso de direito.");
	    }
	    
	    if (curso.equalsIgnoreCase("CEX"))
	    {
	        System.out.println("O aluno "+nome+" faz parte do curso de comercio exterior.");
	    }
	}
}
