package priPackage;
import java.util.Scanner;

public class ex08 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe a altura entre 2 andares: ");
		float andares = entrada.nextFloat();
		System.out.println("Quantos degraus você deseja contruir: ");
		int degraus = entrada.nextInt();
		
		degraus *= 100;
		float altura = andares / degraus;
		System.out.printf("A altura dos degraus é de %.2fcm", altura);
	}
}
