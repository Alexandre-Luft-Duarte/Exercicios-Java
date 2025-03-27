package priPackage;
import java.util.Scanner;


public class ex03 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a = teclado.nextInt();
		int b = teclado.nextInt();
		int x = a + b;
		System.out.printf("X = %d", x);
	}
}
