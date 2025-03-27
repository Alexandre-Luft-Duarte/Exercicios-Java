package priPackage;

public class ex01 {
	public static void main(String[] args) {
		float empresaA = 500000;
		float empresaB = 1200000;
		double crescA = 0.08;
		double crescB = 0.04;
		int anos = 0;
		
		while(empresaA <= empresaB && anos < 50) {
			System.out.printf("\n%2d / Empresa A: %.2f / Empresa B: %.2f", anos, empresaA, empresaB);
			
			empresaA += empresaA * crescA;
			empresaB += empresaB *crescB;
			anos ++;
		}
		
		if (anos > 50) {
			System.out.println("\nPassou de 50 anos");
		} else {
			System.out.println("\nNão passou de 50 anos");
		}
	}
}
