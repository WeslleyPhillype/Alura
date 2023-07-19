import java.util.Scanner;
public class Media {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Quantos alunos tem na sala? ");
		int quantidadeAlunos = scanner.nextInt();
		
		int contador = 1;
		double somaNotas = 0;
		
		while(contador <= quantidadeAlunos) {
			System.out.println("Digite a nota do aluno " + contador + ": ");
			double nota = scanner.nextDouble();
			
			somaNotas += nota;
			contador++;
		}
		
		double media = somaNotas / quantidadeAlunos;
		System.out.println("Amédia da turma é: " + media);
		
		scanner.close();
	}
}
