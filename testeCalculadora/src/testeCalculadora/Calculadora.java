package testeCalculadora;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import teste_calculadora.botton.Button;

public class Calculadora {
	private JFrame f;
	public static JLabel l;
	public static JPanel fundo;
	private static JTextField visor;
	public static JButton[] b = new JButton[20];
	private final Dimension D = new Dimension(50,50);
	public static String ca, l1;
	public static byte tipo = 0;
	//public static String[] text=new String[19];
	public static double x1,x2;
	private static boolean vir;
	

	public Calculadora() {
		criarJanela();
	}
	
	public static JTextField getVisor() {
		return visor;
	}

	public void setVisor(JTextField visor) {
		Calculadora.visor = visor;
	}

	/*public static String[] getText() {
		return text;
	}

	public static void setText(String text, int n) {
		Calculadora.text[n] = text;
	}*/

	public static boolean isVir() {
		return vir;
	}

	public static void setVir(boolean vir) {
		Calculadora.vir = vir;
	}
	public void criarJanela() {
		visor = new JTextField();
		visor.setEditable(false);
		visor.setHorizontalAlignment(JTextField.CENTER);
		visor.setText("0");
		visor.setFont(new Font("Arial",0,20));
		visor.setForeground(Color.white);
		visor.setBackground(Color.gray);
		visor.setMaximumSize(new Dimension(350,50));
		visor.setMinimumSize(new Dimension(350,50));
		visor.setSize(new Dimension(350,50));
		visor.setLocation(15, 30);
		
		l = new JLabel();
		l.setLocation(15,0);
		l.setSize(new Dimension(350,40));
		l.setFont(new Font("Arial",0,20));
		l.setForeground(Color.gray);
		l.setText("teste");
		
		fundo = new JPanel();
		fundo.setSize(new Dimension(400,500));
		fundo.setBackground(Color.darkGray);
		fundo.setLayout(null);
		fundo.add(visor);
		fundo.add(l);
		fundo.setVisible(true);
		
		//Criar os buttons aqui.
		new Button(D,55,170,"7",0);
		new Button(D,115,170,"8",1);
		new Button(D,175,170,"9",2);
		new Button(new Dimension(105,50),255,110,"<=",3,(byte) 7);
		new Button(D,55,230,"4",4);
		new Button(D,115,230,"5",5);
		new Button(D,175,230,"6",6);
		new Button(D,55,290,"1",7);
		new Button(D,115,290,"2",8);
		new Button(D,175,290,"3",9);
		new Button(D,90,345,"0",10);
		new Button(D,255,290,"=",11,(byte) 6);
		new Button(D,310,170,"+",12,(byte) 1);
		new Button(D,255,170,"-",13,(byte) 2);
		new Button(D,255,230,"x",14,(byte) 4);
		new Button(D,310,230,"÷",15,(byte) 3);
		new Button(D,310,290,"C",16,(byte) 8);
		new Button(D,150,345,",",17,(byte) 0);
		new Button(new Dimension(105,50),55,110,"x^y",18,(byte) 5);
		new Button(D,175,110,"CE",19,(byte) 9);
		
		f = new JFrame();
		f.setLocationRelativeTo(null);
		f.setMaximumSize(new Dimension(400,500));
		f.setMinimumSize(new Dimension(400,500));
		f.setSize(new Dimension(400, 500));
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(fundo);
		f.pack();
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new Calculadora();
	}

}
