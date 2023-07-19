
public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(1227, 24226);
		
		System.out.println(conta.getNumero());
		
		Cliente lelo = new Cliente();
		//conta.titular = lelo;
		lelo.setNome("lelo do geras");
		
		conta.setTitular(lelo);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		// agr em duas linhas:
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programador");
		
		System.out.println(titularDaConta);
		System.out.println(lelo);
		System.out.println(conta.getTitular());
		
	}

}
