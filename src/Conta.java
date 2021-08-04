public class Conta {

	// ATRIBUTOS
	private String cliente;
	protected int agencia;
	private int numeroConta;
	protected double saldo;

	// CONSTRUTOR(ARGUMENTOS)
	public Conta(String cliente, int agencia, int numeroConta) {
		this.setCliente(cliente);
		this.setAgencia(agencia);
		this.setNumeroConta(numeroConta);

	}

	// METODOS //O get. SERVE PARA PEGAR A INFORMAÇÃO E RETORNAR
	public String getCliente() { // O set. SERVE PARA DEFINIR O ARGUMENTO INFORMANDO QUE O ATRIBULTO RECEBERAR O
									// QUE O VALOR QUE O ARGUMENTO RECEBER
		return cliente; // O return É OBRIGAÓRIO PARA O GET OU PARA UM MÉTODO QUE NÃO SEJA UM VOID
	} // O this.elemento SERVE PARA APONTAR QUAL É ESSE ELEMENTO
		//

	public void setCliente(String cliente) {
		this.cliente = cliente;

	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			this.agencia = (int) Math.round(Math.random() * 999); // FUNÇAO PARA ARREDONDAR E GERAR NÚMERO ALEATÓRIO NO
																	// CASO DA CONDIÇÃO SER ACIONADA
		} else {
			this.agencia = agencia; // this.agencia = agencia INFORMA QUE O ATRIBUTO AGENCIA VAI RECEBER O VALOR QUE
									// O ARGUMENTO agencia RECEBER
		}
	}

	public int getNumeroConta() {
		return numeroConta;

	}

	public void setNumeroConta(int numeroConta) {
		if (numeroConta <= 0) {
			this.numeroConta = (int) Math.round(Math.random() * 999); // FUNÇAO PARA ARREDONDAR E GERAR NÚMERO ALEATÓRIO
																		// NO CASO DA CONDIÇÃO SER ACIONADA
		} else {
			this.numeroConta = numeroConta;
		}
	}

	public double getSaldo() {

		return saldo;
	}

	public void deposita(double valor) {

		if (valor <= 0) {
			System.out.println("O valor está incorreto!");
		} else {
			this.saldo += valor; // NESTA CONDIÇÃO O MÉTODO DEPOSITA ESTA ESTÁ ATRIBUINDO O VALOR DO DEPÓSITO AO
									// ATRIBUTO SALDO.
		}

	}

	public void saque(double valor) {

		if (valor > this.getSaldo()) {
			System.out.println("Saldo insuficiente!");
		} else {
			this.saldo -= valor;
		}
		
		System.out.println("Seus saldo é de: " + this.saldo);
	}

	public void transfere(double valor, Conta destino) {

		if (valor > this.getSaldo()) {
			System.out.println("Saldo insufisiente");
		} else {
			this.saque(valor);
			destino.deposita(valor);
		}

	}

}
