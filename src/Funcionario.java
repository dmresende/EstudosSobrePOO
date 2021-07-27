
public class Funcionario {
	
	//ATRIBUTOS
	private String nome;
	private String cargo;
	private double salario;
	
	
	//CONSTRUTOR
	public Funcionario (String nome, String cargo, double salario) {
		this.nome = nome; 
		this.cargo = cargo;
		this.salario = salario;
	}
	
	//METODOS
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String cliente) { //Não pode ser String porque se não terá que retornar (return) e o void não há essa necessidade
		this.nome = nome;
	}
	
	public String getCargo() {
		return this.cargo;
		
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
		
	}
	
	public double getSalario() {
		return this.salario;
		
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double impostoDez() {
		return this.getSalario() * 0.10;
	}
	
	

}
