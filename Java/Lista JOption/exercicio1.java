import javax.swing.JOptionPane;
public class exemplo {

	public static void main(String[] args) {
		
		double salario=0,total=0,aumento=0;
		int vez,quantos ;
		String nome,cargo;
		
		quantos = Integer.parseInt(JOptionPane.showInputDialog("Quantos funcionarios: "));
		for (vez=1;vez<=quantos;vez++){
		
		nome = JOptionPane.showInputDialog("Qual � o seu nome");
		cargo = JOptionPane.showInputDialog("Qual � o cargo");
		salario = Integer.parseInt(JOptionPane.showInputDialog("Qual � o seu salario"));
		
		aumento = salario +(salario*0.05);
		total = total + aumento;
		
		JOptionPane.showMessageDialog(null,"Ola "+nome+" seu novo salario sera "+aumento);
		JOptionPane.showMessageDialog(null,"O total da folha de pagamento � "+total);
	}

}
}