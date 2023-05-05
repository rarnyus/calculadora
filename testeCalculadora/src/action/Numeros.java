package action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import testeCalculadora.Calculadora;

public class Numeros implements ActionListener {
	private String numero;
	public Numeros(String numero) {
		this.numero=numero;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(Calculadora.ca == null || Calculadora.ca == "0"|| Actions.isIgual()) {
			Calculadora.ca = numero;
			//Calculadora.l1 = Calculadora.l1 + numero;
			Calculadora.getVisor().setText(Calculadora.ca);
			//Calculadora.l.setText(Calculadora.l1);
		}else {
			Calculadora.ca = Calculadora.ca + numero;
			//Calculadora.l1 = Calculadora.l1 + numero;
			Calculadora.getVisor().setText(Calculadora.ca);
			//Calculadora.l.setText(Calculadora.l1);
		}
		/*if (Actions.isIgual()) {
			Calculadora.tipo = 0;
		}*/
	}
}
