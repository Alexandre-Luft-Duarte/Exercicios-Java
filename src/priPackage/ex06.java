package priPackage;
import java.util.Scanner;

public class ex06 {
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite uma frase: ");
		String frase = entrada.nextLine();
		
		System.out.println("\nDigite uma palavra para ser encontrada na string: ");
		String pesquisa = entrada.nextLine();
		
		if(frase.contains(pesquisa)) {
			System.out.println("Tem a palavra na frase.");
			System.out.println("Digite uma nova palavra");
			String novaPalavra = entrada.nextLine();
			String novaFrase = frase.replace(pesquisa, novaPalavra);
			System.out.printf("Frase que não foi modificada: %s", frase);
			System.out.printf("\nFrase que foi modificada %s", novaFrase);
			
		} else {
			System.out.println("Não tem a palavra na frase.");
		}
	}
}
