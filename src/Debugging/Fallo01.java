package Debugging;

public class Fallo01 {

	public static void main(String[] args) {
		int vuelta = 1;
		int num1 = 4;
		int num2 = 5;
		while(vuelta <= 5) {
			System.out.println(num1+num2*vuelta);
			System.out.println(num1-num2*vuelta);
			vuelta++;
		}

	}

}
