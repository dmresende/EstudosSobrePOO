
public class Programador extends Funcionario { //termos usados por serem herdadas
	
	private String email; //atributos privados criados apenas para essas classes
	private String senha; //atributos que existem apenas na classe filha/
	
	
	//contrutor
	public Programador(String nome, String cargo, double salario) {
		super(nome, cargo, salario); //herança da classe mãe
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	@Override //sobreescrita (edição)
	public double impostoDez() {
		return this.getSalario() * 0.15;
	}

}
