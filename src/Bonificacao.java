
public class Bonificacao {
	
	private double valorTotal;
	
	public double calculoDeBonificacao(Programador programador) {
		
		valorTotal += programador.getSalario() * 0.10;
		
		return valorTotal;
		
	}
	
	public double getValorTotal() {
		return valorTotal;
	}

}
 