package cinema.programa;

import javax.swing.JOptionPane;

import cinema.ingresso.CamaroteInferior;
import cinema.ingresso.CamaroteSuperior;
import cinema.ingresso.Normal;
import cinema.ingresso.Vip;

public class Programa {

	public static void main(String[] args) {
		
		int tipoIngresso = Integer.valueOf(JOptionPane.showInputDialog("Selecione o ingresso desejado:\n1. Normal\n2. Vip\n3. Camarote Inferior\n4. Camarote Superior"));
		
		switch(tipoIngresso) {
		
		case 1: 
		JOptionPane.showMessageDialog(null, (new Normal()).getTipo() + "\nValor: R$" + (new Normal()).getValor());
		break;
		
		case 2:
		JOptionPane.showMessageDialog(null, (new Vip()).getTipo() + "\nValor: R$" + (new Vip()).getValor());
		break;
		
		case 3:
		JOptionPane.showMessageDialog(null, (new CamaroteInferior()).getTipo() + "\nValor: R$" + (new CamaroteInferior()).getValor());
		break;
		
		case 4:
		JOptionPane.showMessageDialog(null, (new CamaroteSuperior()).getTipo() + "\nValor: R$" + (new CamaroteSuperior()).getValor());
		break;
		}
		
		
	}

}
