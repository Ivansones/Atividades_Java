import java.util.Scanner;

public class exercicio4
{
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
        int quantos, vez;
        
        System.out.print("Quantos alunos serão avaliados:");
		quantos = leitor.nextInt();
        
        for( vez=1; vez <= quantos; vez++)
        {
        Scanner entrada = new Scanner(System.in);
        String nome,disciplina;
        double nota1=0,nota2=0,media=0;
            
        System.out.print("Qual é o seu nome:");
		nome = entrada.nextLine();
		
		System.out.print("Qual é a disciplina:");
		disciplina = entrada.nextLine();
		
		System.out.print("Qual é a primeira nota:");
		nota1 = entrada.nextDouble();
		
		System.out.print("Qual é a segunda nota:");
		nota2 = entrada.nextDouble();
		
		media = (nota1 + nota2) / 2;
		System.out.println("Media final: " + media);
		
		
		if (media <5)
		{
		    System.out.println("O aluno "+nome+" reprovou na disciplina "+disciplina);
		}
		if (media >=5 && media <7)
		{
		    System.out.println("O aluno "+nome+" esta em recuperação na disciplina "+disciplina);
		}
		if (media >=7)
		{
		    System.out.println("O aluno "+nome+" passou na disciplina "+disciplina);
		}
        }
	}
}
