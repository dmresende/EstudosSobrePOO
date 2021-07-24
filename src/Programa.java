
public class Programa {
	
	public static void main(String[] args) {
		
		Conta contaDouglas = new Conta("Douglas Resende", -123, 0);
	//	Conta contaDiego = new Conta("Diego Maia", 123, -1369);
		
		contaDouglas.deposita(3500);	
		
		contaDouglas.deposita(1);
		
	//	contaDouglas.transfere(3500, contaDiego);
		
		
		
			
	System.out.println(contaDouglas.getAgencia());
	System.out.println(contaDouglas.getNumeroConta());
	//	System.out.println("O seu saldo é: " + contaDiego.getSaldo());

		
		
		
		
	}

}
