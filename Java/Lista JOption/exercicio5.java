import javax.swing.JOptionPanes;


public class exercicio5 {

	public static void main(Strng[] args) {
		String nome;
		int vez,quantos,bebe=0,cri=0,ado=0,adu=0,velho=0,idade;
		
		quantos = Integer.parseInt(JOptionPane.showInputDialog("Quantos individuos: "));
		for (vez=1;vez<=quantos;vez++){

			nome = JOptionPane.showInputDialog("Qual � o seu nome:");
			idade = Integer.parseInt(JOptionPane.showInputDialog("Qual � a sua idade:"));
			
			if (idade >= 0 && idade <=3){
				bebe = bebe+1;
				JOptionPane.showMessageDialog(null,nome+" esta na classe dos bebes");

			}
			else if (idade >=4  && idade <=11){
				cri = cri+1;
				JOptionPane.showMessageDialog(null,nome+" esta na classe das crian�as");
			}
			else if (idade >=12  && idade <=17){
				ado = ado+1;
				JOptionPane.showMessageDialog(null,nome+" esta na classe dos adolecentes");
			}
			else if (idade >=18  && idade <=60){
				adu = adu+1;
				JOptionPane.showMessageDialog(null,nome+" esta na classe dos adultos");
			}
			else if (idade >60){
				velho = velho+1;
				JOptionPane.showMessageDialog(null,nome+" esta na classe da 3�idade");
			}
			else {
				JOptionPane.showMessageDialog(null,"idade invalida");
			}
			JOptionPane.showMessageDialog(null,"O total das classifica��o s�o Bebe: "+bebe+" Crian�a: "+cri+" Adolecente: "+ado+" Adulto: "+adu+" 3�idade: "+velho);

	}

}
}