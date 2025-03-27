package priPackage;
import java.util.Scanner;

public class ex05 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[][] vendas = new int[4][5];
		int[] semanas = new int[4];
		int[] vendedores = new int[5];
		int total = 0;
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.printf("Digite as vendas do vendedor %d na semana %d: ", j+1, i+1);
				vendas[i][j] = entrada.nextInt();
				semanas[i] += vendas[i][j];
				vendedores[j] += vendas[i][j];
				total += vendas[i][j];
			}
		}
		
		
		entrada.close();
		
		for(int i = 0; i < 4; i++) {
			System.out.printf("\nSemana %d: %d", i+1, semanas[i]);
		}
		
		for(int j = 0; j < 5; j++) {
			System.out.printf("\nVendedor %d: %d", j+1, vendedores[j]);
		}
		System.out.printf("\nTotal de vendas no mês: %d", total);
	}	
}
