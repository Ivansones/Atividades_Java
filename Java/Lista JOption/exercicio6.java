import javax.swing.JOptionPane;


public class exercicio6 {

	public static void main(String[] args) {
		String nome,sigla;
		int vez,quantos,sol=0,cas=0,viu=0,div=0;
		
		quantos = Integer.parseInt(JOptionPane.showInputDialog("Quantos individuos: "));
		for (vez=1;vez<=quantos;vez++){

			nome = JOptionPane.showInputDialog("Qual é o seu nome:");
			sigla = JOptionPane.showInputDialog("Qual é o seu estado civil- S-Solteiro,C-Casado,V-Viuvo,D-Divorciado:");

			if (sigla.equalsIgnoreCase("S"))
			{
				sol = sol+1;
				JOptionPane.showMessageDialog(null,nome+" esta na classe solteiro");
			}
			if (sigla.equalsIgnoreCase("C"))
			{
				cas = cas+1;
				JOptionPane.showMessageDialog(null,nome+" esta na classe casado");
			}
			if (sigla.equalsIgnoreCase("V"))
			{
				viu = viu+1;
				JOptionPane.showMessageDialog(null,nome+" esta na classe viuvo");
			}
			if (sigla.equalsIgnoreCase("D"))
			{
				div = div+1;
				JOptionPane.showMessageDialog(null,nome+" esta na classe divorciado");
			}
			JOptionPane.showMessageDialog(null,"O total das classificação são Solteiro: "+sol+" Casado: "+cas+" Viuvo: "+viu+" Divorciado: "+div);

	}

}
}