import java.util.Scanner;

public class exercicio6 
{
    

public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        
        double horas,valor,salariobruto,fgts,salarioliquido=0;
        System.out.println("Qual é a quantidade de horas trabalhadas: ");
        horas = leitor.nextDouble();
        System.out.println("Qual é o valor dessas horas: ");
        valor = leitor.nextDouble();
        salariobruto = horas * valor;
        
        fgts = salariobruto * 0.11;
        if (salariobruto <= 900){
            salarioliquido= salariobruto - (salariobruto*0.10);
        }
        if (salariobruto > 900 && salariobruto <=1500){
            salarioliquido= salariobruto - (salariobruto*0.05) - (salariobruto*0.10);
        }
        if (salariobruto > 1500 && salariobruto <=2500){
            salarioliquido= salariobruto - (salariobruto*0.10) - (salariobruto*0.10);
        }
        if (salariobruto > 2500){
            salarioliquido= salariobruto - (salariobruto*0.20) - (salariobruto*0.10);
        }
        System.out.println("O salario bruto é "+salariobruto+" o fgts sera "+fgts+" e o salario é "+salarioliquido);
    } 
}