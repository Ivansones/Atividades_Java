import java.util.Scanner;

public class exercicio5
{
    

public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        
        double salarioant, salarionovo = 0, porcento = 0, aumento = 0;
        System.out.println("Qual é o seu salario: ");
        salarioant = leitor.nextDouble();
        
        if (salarioant <= 280){
            porcento = 20;
            aumento = (salarioant*0.20);
            salarionovo = salarioant + aumento;
        }
        
        if ((salarioant> 280) && (salarioant <=700)) {
            porcento = 15;
            aumento = (salarioant*0.15);
            salarionovo = salarioant + aumento;
        }
        if ((salarioant>700) && (salarioant<=1500)) {
            porcento = 10;
            aumento = (salarioant*0.10);
            salarionovo = salarioant + aumento;
        }
        if (salarioant>1500) {
            porcento = 5;
            aumento = (salarioant*0.05);
            salarionovo = salarioant + aumento;
        }
        
        System.out.println("O seu salario antigo = "+salarioant);
        System.out.println("Aumentado " + porcento + "% que é um aumento de " + aumento + " seu salario sera " + salarionovo);
    } 
}