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
	
	
//	@Override
//	public void saque(double valor) {
//
//		if (valor > super.getSaldo()) {
//			System.out.println("Saldo insuficiente!");
//		} else {
//			this.saldo -= valor;
//			System.out.println(saldo);
//		}
//	} A CLASSE MÃE JÁ FAZ ISSO VERIFICAR NOVAMENTE
	
	
	
	private double cashback(double valor) {
		return valor * 0.10;
	}
	
	

}
