package testeCalculadora;

public class Calculos {
	private static double res;
	public static String soma(double x1, double x2) {
		res = x1 + x2;
		return Double.toString(res);
	}
	public static String subi(double x1, double x2) {
		res = x1 - x2;
		return Double.toString(res);
	}
	public static String div(double x1, double x2) {
		res = x1 / x2;
		return Double.toString(res);
	}
	public static String mut(double x1, double x2) {
		res = x1 * x2;
		return Double.toString(res);
	}
	public static String poten(double x1, double x2) {
		res = x1;
		for(int i=1; i<x2; i++) {
			res = res * x1;
		}
		return Double.toString(res);
	}
	public  static double raiz(double x1, double x2) {
		int i=1;
		while(Double.parseDouble(poten(i,x2))<=x1) {
			i++;
		}
		
		return res;
	}
	

}
