
public class Programa {
	
	public static void main(String[] args) {
		
		Conta contaDouglas = new Conta("Douglas Resende");
		Conta contaDiego = new Conta("Diego Maia");
		
		
			
	System.out.println("\nCliente Douglas Resende" + "\nAgência: " + contaDouglas.getAgencia() + "\nNºConta: " + contaDouglas.getNumeroConta());
	System.out.println("\nCliente Diego Maia "+ "\nAgência: " + contaDiego.getAgencia() + "\nNºConta: " + contaDiego.getNumeroConta());		
		
		
	}

}
