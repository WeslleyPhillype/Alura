//Gerente é um Funcionario, Gerente herda da class Funcionario com o extends Funcionario
public class Designer extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Mostrando o método de bonificação do designer");
		return 200;
	}
}
