package Capitulo_06;

public class PassagemPorValor {
	
	static void alterarValor(int valor) {
		valor = 137;
	}
	
	static void alterarReferenciaObjeto(Pessoa p) {
		Pessoa ana = new Pessoa();
		ana.nome = "Ana";
		ana.sexo = 'F';
		ana.idade = 18;
		p = ana;
	}
	
	static void alterarConteudoObjeto(Pessoa p) {
		p.nome = "João";
		p.sexo = 'M';
		p.idade = 20;
	}

	public static void main(String[] args) {

		int valor = 1500;
		
		// Tentativa de alterar o VALOR
		System.out.println("Antes da chamado do método alterarvalor é " + valor);
		alterarValor(valor);
		System.out.println("Após a chamada do método alterarValor é " + valor + "\n");

		Pessoa maria = new Pessoa();
		maria.nome = "Maria";
		maria.sexo = 'F';
		maria.idade = 50;
		
		// Tentativa de alterar a REFERÊNCIA do objeto
		System.out.println("Valores antes da chamada do método \'alterarReferenciaObjeto\'");
		maria.exibirDados();
		
		alterarReferenciaObjeto(maria);
		System.out.println("\nValores depois da chamada do método \'alterarReferenciaObjeto'");
		maria.exibirDados();
		
		// Alterando o CONTEÚDO do objeto
		System.out.println("\nValores antes da chamada do método \'alterarConteudoObjeto'");
		maria.exibirDados();
		
		alterarConteudoObjeto(maria);
		System.out.println("\nValores depois da chamada do método \'alterarConteudoObjeto'");
		maria.exibirDados();
	}

}
