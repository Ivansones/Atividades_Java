import java.util.Scanner;

public class exercicio3
{
	public static void main(String[] args) {
	    Scanner leitor = new Scanner(System.in);
	    
        String nome,cargo;
        double salario;   
     
        System.out.println("Qual é o seu nome:");
        nome = leitor.nextLine() ;
        
        System.out.println("Qual é o seu cargo - T,E,A,P,W e G:");
	    cargo = leitor.nextLine();
	    
	    System.out.println("Qual é o seu cargo salario:");
	    salario = leitor.nextDouble();
	    
	    if (cargo.equalsIgnoreCase("T"))
	    {
	        System.out.println("O individuo "+nome+" é tecnico e recebe "+salario);
	    }
	    if (cargo.equalsIgnoreCase("E"))
	    {
	        System.out.println("O individuo "+nome+" é engenhero de software e recebe "+salario);
	    }
	    if (cargo.equalsIgnoreCase("A"))
	    {
	        System.out.println("O individuo "+nome+" é analista de sistemas e recebe "+salario);
	    }
	    if (cargo.equalsIgnoreCase("P"))
	    {
	        System.out.println("O individuo "+nome+" é programador e recebe "+salario);
	    }
	    if (cargo.equalsIgnoreCase("W"))
	    {
	        System.out.println("O individuo "+nome+" é web-designer e recebe "+salario);
	    }
	    if (cargo.equalsIgnoreCase("G"))
	    {
	        System.out.println("O individuo "+nome+" é gerente de projetos e recebe "+salario+"$");
	    }
	}
}
