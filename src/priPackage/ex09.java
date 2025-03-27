package priPackage;
import java.util.Scanner;

public class ex09 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int num1 = entrada.nextInt();
		System.out.println("Digite um número real: ");
		float num2 = entrada.nextFloat();
		
		for(int i=0; i <= num1; i ++) {
			System.out.print(i);
		}
		
		float soma = (float)num1 + num2;
		float media = soma / 2;
		System.out.printf("\n%1.2f", media);
		
		if (num1 % 1 == 0) {
			System.out.println("É par");
		}else {
			System.out.println("É ímpar");
		}
	}
}
