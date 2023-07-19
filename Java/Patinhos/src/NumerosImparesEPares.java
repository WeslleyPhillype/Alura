import java.util.Scanner;

public class NumerosImparesEPares {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int numero = scanner.nextInt();
		
		System.out.println("Números pares");
		for(int i = 1; i <= 100; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		System.out.println("Números impares");
		for(int i = 2; i <= 100; i++)
			if(i % 2 == 0) {
				System.out.println(i);
			}
	}
}

