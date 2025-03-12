import java.util.Scanner;

public class exercicio7
{
    

public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        
        double litros,valor=0;
        String tipo;
        
        System.out.println("Qual é o tipo de combustivel - G gasolina e A alcool: ");
        tipo = leitor.nextLine();
        
        System.out.println("Qual é a quantidade desejada: ");
        litros = leitor.nextDouble();
        
        
        if (tipo.equals("G")) {
            if (litros <=20)   {
                    valor = (litros * 2.50) *0.97;
                    }
            else   {
                    valor = (litros * 2.50) *0.95;    
            }
        }
        if (tipo.equals("A")) {
            
            if (litros <=20) {
                    valor = (litros * 1.90) *0.96;
                    }
            else  {
                    valor = (litros * 1.90) *0.94;
                    }
        }
        System.out.println("O valor que sera pago pelo combustivel é "+valor);
    } 
}