package Atividades_Extras.NomeIdadePessoaMaisNova;

import java.util.List;

public class PessoaList {

	String nome;
	int idade;

	public PessoaList(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public static PessoaList getPessoaMaisNova(List<PessoaList> listaPessoa) {
		
		if (listaPessoa != null && !listaPessoa.isEmpty()) {
			
			int menorIdade = 999999999;
			
			for (PessoaList p : listaPessoa) {
				if (p.idade < menorIdade) {
					menorIdade = p.idade;
				}
			}
			
			for (PessoaList p : listaPessoa) {
				if (p.idade == menorIdade) {
					return p;
				}
			}
		}
		return null;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nome + " " + idade;
	}
	
	

}
