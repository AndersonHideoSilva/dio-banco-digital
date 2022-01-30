
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente ze = new Cliente();
		ze.setNome("ZE");
		
		Conta cc = new ContaCorrente(ze);
		cc.depositar(200);
		
		Conta cp = new ContaPoupanca(ze);
		cc.transferir(100, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}

}
