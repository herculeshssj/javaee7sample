package br.com.hslife.javaee7.jaxrs;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.Singleton;

@Singleton
public class PessoaEJB {
	
	private List<Pessoa> pessoaDB = new ArrayList<Pessoa>();
	
	@SuppressWarnings("deprecation")
	public PessoaEJB() {
		Pessoa p = new Pessoa();
		p.setId(pessoaDB.size());
		p.setNome("Pessoa de teste");
		p.setIdade(30);
		p.setDataNascimento(new Date(1980-1900, 0, 0));
		
		pessoaDB.add(p);
	}

	public void salvarPessoa(Pessoa pessoa) {
		pessoaDB.add(pessoa);
	}
	
	public void editarPessoa(Pessoa pessoa) {
		try {
			pessoaDB.set(pessoa.getId(), pessoa);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void removerPessoa(int id) {
		pessoaDB.remove(id);
	}
	
	public List<Pessoa> listarPessoas() {
		return pessoaDB;
	}
	
	public Pessoa buscarPessoa(int id) {
		return pessoaDB.get(id);
	}
	
	public int getNextID() {
		return pessoaDB.size();
	}
}
