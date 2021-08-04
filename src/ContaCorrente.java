public class ContaCorrente extends Conta {

	// CONSTRUTOR HERDADO
	public ContaCorrente(String cliente, int numeroConta, int agencia) {
		super(cliente, agencia, numeroConta);
	}

	public void informacoesCc1() {

		System.out.println("\nCliente: " + super.getCliente() + "\nAgência: " + super.getAgencia() + "\nNúmero de Conta: "
				+ super.getNumeroConta() + "\nSaldo: " + super.getSaldo());

	}
	
	@Override
	public void saque(double valor) {

		if (valor > super.getSaldo()) {
			System.out.println("Saldo insuficiente!");
		} else {
			super.saldo -= valor - taxaManutencao(valor);
		}
		
		System.out.println("Seus saldo é de: " + super.saldo);
	}
	
	
	private double taxaManutencao(double valor) {
		return valor * 0.10;
	}

}
