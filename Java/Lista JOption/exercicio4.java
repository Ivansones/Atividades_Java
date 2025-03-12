import javax.swing.JOptionPane;


public class exercicio4 {

	public static void main(String[] args) {
	String nome;
	int horas,vez,quantos;
	double valor,bruto,total=0,desconto;
	
	quantos = Integer.parseInt(JOptionPane.showInputDialog("Quantos funcionarios: "));
	for (vez=1;vez<=quantos;vez++){
		
		nome = JOptionPane.showInputDialog("Qual é o seu nome:");
		horas = Integer.parseInt(JOptionPane.showInputDialog("Quatas horas voce trabalha:"));
		valor = Double.parseDouble(JOptionPane.showInputDialog("Qual é o valor dessa horas:"));
		
		bruto = horas * valor;
		total = total + bruto;
		desconto = bruto -(bruto*0.02);
		JOptionPane.showMessageDialog(null,"Ola "+nome+" seu novo salario sera "+desconto);
		JOptionPane.showMessageDialog(null,"O total da folha de pagamento é "+total);

	}
	}

}
