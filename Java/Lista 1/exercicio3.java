import java.util.Scanner;

public class exercicio3
{
    

public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        double nota1,nota2,media;
        
        System.out.println("Qual é a sua primeira nota: ");
        nota1 = leitor.nextDouble();
        System.out.println("Qual é a sua segunda nota: ");
        nota2 = leitor.nextDouble();
        
        media = (nota1+nota2)/2;
        
        if (media>= 7 && media <10){
            System.out.println("O aluno foi aprovado");
        }
        if (media< 7 ){
            System.out.println("O aluno foi reprovado");
        }
        if (media== 10){
            System.out.println("O aluno foi aprovado com detaque");
        }
} 
}