package action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Optional;

import testeCalculadora.Calculadora;
import testeCalculadora.Calculos;

public class Actions implements ActionListener {
	private byte n;
	private static boolean igual = false;
	public Actions(byte n) {
		this.n = n;
	}
	
	public static boolean isIgual() {
		return igual;
	}

	public void tirarPonto() {
		int b = Calculadora.ca.indexOf(".");
		
		if (b != -1 && Calculadora.ca.charAt(b + 1) == '0'&& Calculadora.ca.length()-1 == b + 1) {
			Calculadora.ca = Calculadora.ca.substring(0,Calculadora.ca.length()-2);
			//System.out.println(Calculadora.ca);
			Calculadora.getVisor().setText(Calculadora.ca);
			Calculadora.l1 = Calculadora.l1 + " " + "=" + " " + Calculadora.ca;
			Calculadora.l.setText(Calculadora.l1);
			//System.out.println("entrou aqui");
		}else {
			Calculadora.getVisor().setText(Calculadora.ca);
			Calculadora.l1 = Calculadora.l1 + " " + "=" + " " + Calculadora.ca;
			Calculadora.l.setText(Calculadora.l1);
			//System.out.println("nao era para ter entrado aqui");
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		switch(n) {
		case 0:
			//virgula
			if (Calculadora.ca == null) {
				Calculadora.ca = "0.";
				Calculadora.getVisor().setText(Calculadora.ca);
				Calculadora.setVir(true);
			}else if(!Calculadora.isVir()) {
				Calculadora.ca = Calculadora.ca + ".";
				Calculadora.getVisor().setText(Calculadora.ca);
				Calculadora.setVir(true);
			}
			if (igual) {
				igual = false;
			}
			break;
		case 1:
			//Soma
			if (Calculadora.ca != null) {
				Calculadora.x1 = Double.parseDouble(Calculadora.ca);
				Calculadora.getVisor().setText(Calculadora.ca + "+");
				Calculadora.l1 = Calculadora.ca + " " + "+" + " ";
				Calculadora.l.setText(Calculadora.l1);
				Calculadora.ca = null;
				Calculadora.tipo = 1;
				Calculadora.setVir(false);
			}
			if (igual) {
				igual = false;
			}
			break;
		case 2:
			//Subitracao
			if (Calculadora.ca != null) {
				Calculadora.x1 = Double.parseDouble(Calculadora.ca);
				Calculadora.getVisor().setText(Calculadora.ca + "-");
				Calculadora.l1 = Calculadora.ca + " " + "-" + " ";
				Calculadora.l.setText(Calculadora.l1);
				Calculadora.ca = null;
				Calculadora.tipo = 2;
				Calculadora.setVir(false);
			}
			if (igual) {
				igual = false;
			}
			break;
		case 3:
			//Divisao
			if (Calculadora.ca != null) {
				Calculadora.x1 = Double.parseDouble(Calculadora.ca);
				Calculadora.getVisor().setText(Calculadora.ca + "÷");
				Calculadora.l1 = Calculadora.ca + " " + "÷" + " ";
				Calculadora.l.setText(Calculadora.l1);
				Calculadora.ca = null;
				Calculadora.tipo = 4;
				Calculadora.setVir(false);
			}
			if (igual) {
				igual = false;
			}
			break;
		case 4:
			//Mutiplicacao
			if (Calculadora.ca != null) {
				Calculadora.x1 = Double.parseDouble(Calculadora.ca);
				Calculadora.getVisor().setText(Calculadora.ca + "x");
				Calculadora.l1 = Calculadora.ca + " " + "x" + " ";
				Calculadora.l.setText(Calculadora.l1);
				Calculadora.ca = null;
				Calculadora.tipo = 3;
				Calculadora.setVir(false);
			}
			if (igual) {
				igual = false;
			}
			break;
		case 5:
			//Potencia
			if (Calculadora.ca != null) {
				Calculadora.x1 = Double.parseDouble(Calculadora.ca);
				Calculadora.getVisor().setText(Calculadora.ca + "^");
				Calculadora.l1 = Calculadora.ca + " " + "^" + " ";
				Calculadora.l.setText(Calculadora.l1);
				Calculadora.ca = null;
				Calculadora.tipo = 5;
				Calculadora.setVir(false);
			}
			if (igual) {
				igual = false;
			}
			break;
		case 6:
			//Igual
			Calculadora.l1 = Calculadora.l1 + Calculadora.ca;
			switch(Calculadora.tipo) {
			case 0:
				break;
			case 1://Soma
				if (!igual && Calculadora.ca != null) {
					Calculadora.x2 = Double.parseDouble(Calculadora.ca);
					Calculadora.ca = Calculos.soma(Calculadora.x1, Calculadora.x2);
					tirarPonto();
					igual = true;
				}else {
					if (Calculadora.ca != null) {
						Calculadora.x1 = Double.parseDouble(Calculadora.ca);
						Calculadora.ca = Calculos.soma(Calculadora.x1, Calculadora.x2);
						tirarPonto();
					}
				}
				break;
			case 2://Subitracao
				if (!igual && Calculadora.ca != null) {
					//System.out.println("chegou aqui");
					Calculadora.x2 = Double.parseDouble(Calculadora.ca);
					Calculadora.ca = Calculos.subi(Calculadora.x1, Calculadora.x2);
					tirarPonto();
					igual = true;
				}else {
					if (Calculadora.ca != null) {
						Calculadora.x1 = Double.parseDouble(Calculadora.ca);
						Calculadora.ca = Calculos.subi(Calculadora.x1, Calculadora.x2);
						tirarPonto();
					}
				}
				break;
			case 3://Multiplicacao
				if (!igual && Calculadora.ca != null) {
					Calculadora.x2 = Double.parseDouble(Calculadora.ca);
					Calculadora.ca = Calculos.mut(Calculadora.x1, Calculadora.x2);
					tirarPonto();
					igual = true;
				}else {
					if (Calculadora.ca != null) {
						Calculadora.x1 = Double.parseDouble(Calculadora.ca);
						Calculadora.ca = Calculos.mut(Calculadora.x1, Calculadora.x2);
						tirarPonto();
					}
				}
				break;
			case 4://Divisao
				if (!igual && Calculadora.ca != null) {
					Calculadora.x2 = Double.parseDouble(Calculadora.ca);
					Calculadora.ca = Calculos.div(Calculadora.x1, Calculadora.x2);
					tirarPonto();
					igual = true;
				}else {
					if (Calculadora.ca != null) {
						Calculadora.x1 = Double.parseDouble(Calculadora.ca);
						Calculadora.ca = Calculos.div(Calculadora.x1, Calculadora.x2);
						tirarPonto();
					}
				}
				break;
			case 5://Potencia
				if (!igual && Calculadora.ca != null) {
					Calculadora.x2 = Double.parseDouble(Calculadora.ca);
					Calculadora.ca = Calculos.poten(Calculadora.x1, Calculadora.x2);
					tirarPonto();
					igual = true;
				}else {
					if (Calculadora.ca != null) {
						Calculadora.x1 = Double.parseDouble(Calculadora.ca);
						Calculadora.ca = Calculos.poten(Calculadora.x1, Calculadora.x2);
						tirarPonto();
					}
				}
				break;
			   }
			break;
		case 7:
			//Apagar
			int a = 0;
			Calculadora.ca = Optional.ofNullable(Calculadora.ca)
				     .filter(s -> s.length() != 0)
				     .map(s -> s.substring(0, s.length() - 1))
				     .orElse(Calculadora.ca);
			if(Calculadora.ca != null) {
				a = Calculadora.ca.length();
			}
			if(a != 0) {
				Calculadora.getVisor().setText(Calculadora.ca);
				//System.out.println(ca);
			}else {
				Calculadora.ca = null;
				Calculadora.getVisor().setText("0");
			}
			break;
		case 8:
			//Limpar tudo
			Calculadora.ca = null;
			Calculadora.tipo = 0;
			Calculadora.x1 = 0;
			igual = false;
			Calculadora.getVisor().setText("0");
			Calculadora.l1 = null;
			Calculadora.l.setText("");
			Calculadora.setVir(false);
			break;
		case 9://Apagoar o text
			Calculadora.ca = null;
			Calculadora.getVisor().setText("0");
			Calculadora.setVir(false);
			break;
		}
	}

}
