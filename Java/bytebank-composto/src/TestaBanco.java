
public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente lelo = new Cliente();
		lelo.nome = "Lelinho Do Geras";
		lelo.cpf = "222.222.222-22";
		lelo.profissao = "programador";
		
		Conta contaDoLelo = new Conta();
		contaDoLelo.deposita(100);
		
		// associa o cliente lelo a conta contaDoLelo
		contaDoLelo.titular = lelo;
		System.out.println(contaDoLelo.titular.nome);
		System.out.println(contaDoLelo.titular);
		System.out.println(lelo);
	}

}
