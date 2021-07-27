
public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario primeiro = new Funcionario (" Douglas Resende ", " Programador ", 3500.0);
		Programador segundo = new Programador ("Diego Maia" , "Programador", 3500.0);
		Diretor terceiro = new Diretor ("Natalia", "Diretora", 60000.0);
		
		Programador sexto = new Programador ("Davi" , "Programador", 3500.0);
		Programador quarto = new Programador ("Maia" , "Programador", 3500.0);
		Programador quinto = new Programador ("Moises" , "Programador", 3500.0);
		
		Bonificacao b = new Bonificacao ();
		
		b.calculoDeBonificacao(segundo);
		b.calculoDeBonificacao(sexto);
		b.calculoDeBonificacao(quarto);
		b.calculoDeBonificacao(quinto);

		
		System.out.println(terceiro.impostoDez() + terceiro.impostoTrinta());	
		
		System.out.println(b.getValorTotal());
	
		
		
	}

}
