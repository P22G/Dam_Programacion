package Debugging;

import javax.swing.JOptionPane;
public class AleatorioTest {

	public static void main(String[] args) {
		String numero;
		numero=(JOptionPane.showInputDialog("Introduce el número de veces del bucle"));
		
		int numero2 = Integer.parseInt(numero);
		
		for(int num2 = 1; num2 <= numero2; num2++) {
			int numAle;
			numAle = (int)(Math.random()*100);
			System.out.println(numAle);
			System.out.println("aaaaaaaaahhhhhhhhhhhhhhhhhh");
		}
		
	}
}
