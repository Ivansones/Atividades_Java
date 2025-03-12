import java.util.Scanner;

public class exercicio4
{
    

public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        
        double dia;
        String rep1,rep2,rep3,rep4,rep5,rep6,rep7;
        rep1 = "Domingo";
        rep2 = "Segunda-Feira";
        rep3 = "Terça-Feira";
        rep4 = "Quarta-Feira";
        rep5 = "Quinta-Feira";
        rep6 = "Sexta-Feira";
        rep7 = "Sabado";
        System.out.println("Qual é o dia da semana: ");
        dia = leitor.nextDouble();
        if (dia==1){
            System.out.println("É "+rep1);
        }
        if (dia==2){
            System.out.println("É "+rep2);
        }
        if (dia==3){
            System.out.println("É "+rep3);
        }
        if (dia==4){
            System.out.println("É "+rep4);
        }
        if (dia==5){
            System.out.println("É "+rep5);
        }
        if (dia==6){
            System.out.println("É "+rep6);
        }
        if (dia==7){
            System.out.println("É "+rep7);
        }
} 
}