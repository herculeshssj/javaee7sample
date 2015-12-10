package br.ufrj.tic.jaxrs;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Singleton;

@Singleton
public class PessoaEJB {
	
	private List<Pessoa> pessoaDB = new ArrayList<Pessoa>();

	public void salvarPessoa(Pessoa pessoa) {
		pessoaDB.add(pessoa);
	}
	
	public void editarPessoa(Pessoa pessoa) {
		pessoaDB.set(pessoa.getId(), pessoa);
	}
	
	public void removerPessoa(Pessoa pessoa) {
		pessoaDB.remove(pessoa);
	}
	
	public List<Pessoa> listarPessoas() {
		return pessoaDB;
	}
	
	public Pessoa buscarPessoa(int id) {
		return pessoaDB.get(id);
	}
}
