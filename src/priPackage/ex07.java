package priPackage;
import java.util.Scanner;

public class ex07 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quanto você ganha por hora? ");
		float salarioHora= entrada.nextFloat();
		System.out.println("E quantas horas você trabalhou em um projeto? ");
		float horas = entrada.nextFloat();
		
		float salarioRecebido = salarioHora * horas;
		System.out.printf("O valor que você irá receber é de %1.2f", salarioRecebido);
	
	}
}
