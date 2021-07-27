
public class Programa {
	
	public static void main(String[] args) {
		
		Conta contaDouglas = new Conta("Douglas Resende", 0, -1);
		Conta contaDiego = new Conta("Diego Maia", 0, -6);
		
		
			
	System.out.println("\nCliente Douglas Resende" + "\nAgência: " + contaDouglas.getAgencia() + "\nNºConta: " + contaDouglas.getNumeroConta());
	System.out.println("\nCliente Diego Maia "+ "\nAgência: " + contaDiego.getAgencia() + "\nNºConta: " + contaDiego.getNumeroConta());		
		
		
	}

}
