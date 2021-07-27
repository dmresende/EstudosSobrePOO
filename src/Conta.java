
public class Conta {

	//ATRIBUTOS
	private String cliente;
	private int agencia;
	private int numeroConta;
	private double saldo;

	//CONSTRUTOR
	public Conta(String cliente) { // o que está dentro do parênteses são os argumentos 
		this.setCliente(cliente);
		this.setAgencia();
		this.setNumeroConta();

	}
	

	//METODOS
	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;

	}

	public int getAgencia() {
		return agencia;
	}

	
	//26/07/2021
	public void setAgencia() {
			this.agencia = (int) Math.round(Math.random()*900);
	}			

	public int getNumeroConta() {
		return numeroConta;

	}

	public void setNumeroConta() {
			this.numeroConta = (int) Math.round(Math.random()*999);
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposita(double valor) {

		if (valor <= 0) {
			System.out.println("O valor está incorreto!");
		} else {
			this.saldo += valor;
		}

	}

	public void saque(double valor) {

		if (valor > this.getSaldo()) {
			System.out.println("Saldo insuficiente!");
		} else {
			this.saldo -= valor;
		}
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
