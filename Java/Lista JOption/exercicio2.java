import javax.swing.JOptionPane;
public class exercicio2 {

	public static void main(String[] args) {
		int base,area,altura;

		base = Integer.parseInt(JOptionPane.showInputDialog("Qual � a base do triangulo"));
		altura = Integer.parseInt(JOptionPane.showInputDialog("Qual � a altura do trianguo"));
		area = (base * altura)/2;
		JOptionPane.showMessageDialog(null,"A area do triangelo � "+area);
		
	}

}
