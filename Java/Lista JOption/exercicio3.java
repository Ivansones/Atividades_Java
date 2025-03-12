import javax.swing.JOptionPane;
public class exercicio3 {

	public static void main(String[] args) {
	String nome;
	int idade;
	double peso,altura,massa;
		
	nome = JOptionPane.showInputDialog("Qual � o seu nome:");
	
	idade = Integer.parseInt(JOptionPane.showInputDialog("Qual � a sua idade"));
	peso = Double.parseDouble(JOptionPane.showInputDialog("Qual � o seu peso"));
	altura = Double.parseDouble(JOptionPane.showInputDialog("Qual � a altura"));
	
	massa = peso/(altura*altura);
	
	JOptionPane.showMessageDialog(null,"o seu IMC � "+massa);
	}

}
