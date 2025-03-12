import java.util.Scanner;

public class exercicio4
{
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
    
    double salario=0,alm=0,pro=0,conta=0,vendas=0,salariot=0;
    int quantidade,vez;
    
    System.out.println("Quantos funcinarios serão cadastrados:");
    quantidade = leitor.nextInt();
    for (vez=1; vez<=quantidade; vez++)
        {
        Scanner entrada = new Scanner(System.in);
        
        String nome,setor;
        
        System.out.println("Qual o seu nome:");
		nome = entrada.nextLine();
		
		System.out.println("Qual o seu setor - A, P, C, V:");
		setor = entrada.nextLine();
		
		System.out.println("Qual é o seu salario:");
		salario = entrada.nextDouble();
		
		if (setor.equalsIgnoreCase("A"))
			{
			    alm = alm + 1;
			    System.out.println("O funcionario "+nome+" faz parte do setor de almoxarifado e tem salario "+salario);
		    }
		if (setor.equalsIgnoreCase("P"))
			{
			    pro = pro + 1;
			    System.out.println("O funcionario "+nome+" faz parte do setor de produção e tem salario "+salario);
		    }
		if (setor.equalsIgnoreCase("C"))
			{
			    conta = conta + 1;
			    System.out.println("O funcionario "+nome+" faz parte do setor de contabilidade e tem salario "+salario);
		    }
		if (setor.equalsIgnoreCase("V"))
			{
			    vendas = vendas + 1;
			    System.out.println("O funcionario "+nome+" faz parte do setor de vendas e tem salario "+salario);
		    }
		salariot = salariot + salario;
		
		System.out.println("A quantidade de funcionarios nos setores são - Almo: "+alm+" produção: "+pro+" conta: "+conta+" vendas: "+vendas+" e o salario total é "+salariot); 
	     
        }
    }
}