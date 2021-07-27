
public class Diretor extends Funcionario {

	public Diretor(String nome, String cargo, double salario) {
		super(nome, cargo, salario);
		
		
	}
	public double impostoTrinta() {
		return this.getSalario() * 0.30 + super.impostoDez(); //super chama o metodo da classe mãe;

	}
}