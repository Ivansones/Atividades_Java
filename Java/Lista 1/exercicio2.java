import java.util.Scanner;

public class exercicio2 
{
    

    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        
        double produto1,produto2,produto3;
        String resposta1,resposta2,resposta3;
        resposta1 ="O primeiro";
        resposta2 ="O segundo";
        resposta3 ="O terceito";
        System.out.println("Qual é o preço do primeiro produto: ");
        produto1 = leitor.nextDouble();
        System.out.println("Qual é o preço do segundo produto: ");
        produto2 = leitor.nextDouble();
        System.out.println("Qual é o preço do terceiro produto: ");
        produto3 = leitor.nextDouble();
       
        if (produto1 < produto2 && produto1 < produto3){
            System.out.println("O produto mais barato é "+resposta1);
        }
        if (produto2 < produto1 && produto2 < produto3){
            System.out.println("O produto mais barato é "+resposta2);
        }
        if (produto3 < produto2 && produto3 < produto1){
            System.out.println("O produto mais barato é "+resposta3);
        }
        
       }
} 