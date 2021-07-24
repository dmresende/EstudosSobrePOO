
public class Conta {

	private String cliente;
	private int agencia;
	private int numeroConta;
	private double saldo;
	
	public Conta(String cliente, int agencia, int numetoConta){
		this.setCliente(cliente);
		this.setAgencia(agencia);
		this.setNumeroConta(numetoConta); 
		
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
		
	}

	public int getAgencia() {
		return agencia;
	}

	public boolean setAgencia(int agencia) {
		
		if(agencia <= 0) {
			
			System.out.println("erro !");
			return false;
		} else {
			
			this.agencia = agencia;	
			return true;
		}
		
						
	}

	public int getNumeroConta() {
		return numeroConta;
		
	}

	public boolean setNumeroConta(int numeroConta) {
		
		if(numeroConta <= 0) {
			
			System.out.println("erro !");
			return false;
		} else {
			
			this.numeroConta = numeroConta;
			return true;
		}			
		
		
	}

	public double getSaldo() {
		return saldo;
	}

	
	public void deposita(double valor) {
		
		if(valor <= 0) {
			
			System.out.println("O valor está incorreto!");
		} else {
			
			this.saldo +=  valor;
		}
		
		
	}
	
	public void saque (double valor) {
		
		if(valor > this.getSaldo()) {
			
			System.out.println("Saldo insuficiente!");
			
		} else {
			
			this.saldo -= valor;
		}
	}
	
	
	public void transfere (double valor, Conta destino) {
		
		if(valor > this.getSaldo()) {
			
			System.out.println("Saldo insufisiente");
		} else {
			
			this.saque(valor);
			destino.deposita(valor);
		}
		
	}
	
	
	
	//Agencia e numero de conta não pode ser 0 ou menor que 0;
	//math.ramdom sugentão 
	//
	
	
	
	

}
