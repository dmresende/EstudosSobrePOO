# Estudos sobre Programação Orientada a Objetos!

Reuni-se aqui uma série de conceitos, arquivo, documentos e exemplos adquiridos do estudos de **Programação Orientada a Objetos.**  

**_Objetos são uma  aglutinação de estados e comportamentos_.**

 * Foi definido a criação de um sistema para um banco.
 * Foi criado primeiro a Classe _Conta_ com todos os atributos necessários.
 * Logo em seguida a Classe _Funcionário_ com suas Classes _filhas_. **aplicação do conceito de herança**
 * Criação das Classes _Herdeiras_ com seus atributos pertinentes, cada qual com sua peculiaridade. **aplicação do conceito de encapsulamento**
 * Crianção da Classe _Diretor_ onde está sendo **aplicado o conceito do Polimorfismo**
 
---

## Pilares

* **Herança:** Capacidade do objeto ser idealizado baseando-se no _objeto_ pai;
* **Polimorfismo:** Capacidade de um _objeto_ ser passar por outro em certa circunstância. 
* **Encapsulamento:** _Esconder_ certas informações para dar acesso a determinada _coisa_. Ou Critério hierárquico que permite que apenas um _método_altere uma informação. 
* **Abstração:** Tem as características para ser mas não é, então ele da origem ao um objeto que trás sua estrutura

## Links úteis

* [Introdução ao POO](https://www.youtube.com/watch?v=dF0OlB81P-I)
* [Edição ReadeME](https://stackedit.io/app#)
* [Guia Básico Markdown](https://docs.pipz.com/central-de-ajuda/learning-center/guia-basico-de-markdown#open)
* [Aprendendo Markdown](https://blog.da2k.com.br/2015/02/08/aprenda-markdown/)

# Classes

### Conta
* Classe com atributos relacionados a uma conta geral de banco.
*  Possui um _Construtor_ que exige que seja informado alguns _dados_ obrigatórios para a **Regra de Negócio**.
*  Seus métodos são relacionados aos seus atributos, os demais correlaciona os existentes como por exemplo temos o método para _saque_ e para _deposito_, cada uma com sua finalidade podemos correlaciona-las:

	~~~ 
	public void transfere(double valor, Conta destino) {

		if (valor > this.getSaldo()) {
			System.out.println("Saldo insufisiente");
		} else {
			this.saque(valor);
			destino.deposita(valor);
		}
	}
---
### Programa
* Classe onde roda o nosso programa, onde nossas outras classes são testadas. Aqui temos o método _main_ e é onde a mágica acontece. 
---
### Funcionário



---
* TesteFuncionario;
* Bonificação;
* Programador;
* Diretor.

