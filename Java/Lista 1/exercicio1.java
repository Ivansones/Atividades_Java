import java.util.Scanner;

public class exercicio1 
{
    

    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        double num1,num2;
        

        System.out.println("Qual é o seu primeiro numero: ");
        num1 = leitor.nextDouble();
        System.out.println("Qual é o seu segundo numero: ");
        num2 = leitor.nextDouble();
        if (num1 > num2){
            System.out.println("O maisor numero é "+num1);
        }
        else{
            System.out.println("O maior numero é "+num2);
        }
    }
} 