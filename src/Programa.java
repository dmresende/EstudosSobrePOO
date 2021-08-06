
public class Programa {
	
	public static void main(String[] args) {
		
			
		ContaPoupanca contaPoupanca1 = new ContaPoupanca("Douglas Resnde" , 123, 789);
		ContaCorrente contaCorrente1 = new ContaCorrente("Diego Maia", 321, 987);
		
		contaCorrente1.deposita(100);
		contaCorrente1.saque(500);
		
		contaPoupanca1.deposita(100);		
		contaPoupanca1.saque(50);		
		
		
		contaPoupanca1.informacoesCp1();
		contaCorrente1.informacoesCc1();
		
		
		
		
		
	}

}
