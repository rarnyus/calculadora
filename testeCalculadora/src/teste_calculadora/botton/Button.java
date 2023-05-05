package teste_calculadora.botton;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;

import action.Actions;
import action.Numeros;
import testeCalculadora.Calculadora;

public class Button extends JButton {
	int font = 20;
	public Button(Dimension a, int x, int y, String text, int n) {
		//Calculadora.text[n]=text;
		int t = text.length();
		if (t > 1) {
			font = 10;
		}
		JButton b = new JButton();
		b.setSize(a);
		b.setLocation(x, y);
		b.setText(text);
		b.setFont(new Font("Arial",0,font));
		b.setForeground(Color.white);
		b.setBackground(Color.DARK_GRAY);
		b.setFocusable(false);
		b.setContentAreaFilled(true);
		b.setDefaultCapable(true);
		b.setEnabled(true);
		b.setFocusPainted(true);
		b.setMultiClickThreshhold(2);
		b.setRequestFocusEnabled(true);
		b.setRolloverEnabled(true);
		b.setVerifyInputWhenFocusTarget(true);
		b.addActionListener(new Numeros(text));
		b.setVisible(true);
		Calculadora.b[n] = b;
		Calculadora.fundo.add(Calculadora.b[n]);
	}
	public Button(Dimension a, int x, int y, String text, int n , byte d) {
		//Calculadora.text[n]=text;
		int t = text.length();
		if (t > 1 && d == 9) {
			font = 11;
		}
		JButton b = new JButton();
		b.setSize(a);
		b.setLocation(x, y);
		b.setText(text);
		b.setFont(new Font("Arial",0,font));
		b.setForeground(Color.white);
		b.setBackground(Color.DARK_GRAY);
		b.setFocusable(false);
		b.setContentAreaFilled(true);
		b.setDefaultCapable(true);
		b.setEnabled(true);
		b.setFocusPainted(true);
		b.setMultiClickThreshhold(2);
		b.setRequestFocusEnabled(true);
		b.setRolloverEnabled(true);
		b.setVerifyInputWhenFocusTarget(true);
		b.addActionListener(new Actions(d));
		b.setVisible(true);
		Calculadora.b[n] = b;
		Calculadora.fundo.add(Calculadora.b[n]);
	}

}
