//Gerente é um Funcionario, Gerente herda da class Funcionario com o extends Funcionario
public class Gerente extends Funcionario {
	
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}
	
	//public double getBonificacao() {
//		return this.salario * 0.1;
//	}
}