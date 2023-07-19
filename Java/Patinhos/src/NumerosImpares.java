
public class NumerosImpares {
	public static void main(String[] arg) {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}
}


/*Neste programa, usamos um loop for para iterar de 1 a 100. Em cada iteração,
 *  verificamos se o número atual (i) é ímpar usando o operador % para verificar se o resto da divisão por 2 é diferente de zero.
 *   Se o resto for diferente de zero, significa que o número é ímpar, então o imprimimos na tela usando o método System.out.println().*/