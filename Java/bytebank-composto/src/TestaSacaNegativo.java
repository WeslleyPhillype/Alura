
public class TestaSacaNegativo {
	
	public static void main(String[] args) {
		Conta wendell = new Conta();
		wendell.deposita(100);
		wendell.saca(200);
		System.out.println(wendell.saca(101));
		
		wendell.saca(101);
		
		System.out.println(wendell.getSaldo());
		
		
		// proibido:
		/*wendell.saldo = wendell.saldo - 101;
		System.out.println(wendell.saldo);*/
	}
}
