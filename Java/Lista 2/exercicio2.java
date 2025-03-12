import java.util.Scanner;

public class exercicio1
{
	public static void main(String[] args) {
	    Scanner leitor = new Scanner(System.in);
	    
        String nome,estado;
        
        System.out.println("Qual é o seu nome:");
        nome = leitor.nextLine() ;
        
        System.out.println("Qual é o seu estado civil - S,C,V e D:");
	    estado = leitor.nextLine();
	    
	    if (estado.equalsIgnoreCase("S"))
	    {
	        System.out.println("O individuo "+nome+" esta solteiro.");
	    }
	    if (estado.equalsIgnoreCase("C"))
	    {
	        System.out.println("O individuo "+nome+" esta casado.");
	    }
	    if (estado.equalsIgnoreCase("V"))
	    {
	        System.out.println("O individuo "+nome+" esta viuvo.");
	    }
	    if (estado.equalsIgnoreCase("D"))
	    {
	        System.out.println("O individuo "+nome+" esta divorciado.");
	    }
	}
}