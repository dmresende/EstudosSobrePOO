public class ContaPoupanca extends Conta {

	// CONSTRUTOR HERDADO
	public ContaPoupanca(String cliente, int agencia, int numeroConta) {
		super(cliente, agencia, numeroConta);
	}

	public void informacoesCp1() {

		System.out.println("\nCliente: " + super.getCliente() + "\nAgência: " + super.getAgencia() + "\nNúmero de Conta: "
				+ super.getNumeroConta() + "\nSaldo: " + super.getSaldo());

	}

	@Override
	public void deposita (double valor) {
		
		if (valor <=0) {
			System.out.println("O valor está incorreto!");
			
		}else {
			super.saldo += valor + this.cashback(valor);  
		}		
		
		
	}
	
	private double cashback(double valor) {
		return valor * 0.10;
	}
	
	

}
