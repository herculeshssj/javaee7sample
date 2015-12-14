package br.ufrj.tic.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.ufrj.tic.jaxrs.Pessoa;

@Stateless
public class PessoaDAO {

	@PersistenceContext(unitName="javaeePU")
	EntityManager em;
	
	public void save(Pessoa pessoa) {
		em.persist(new PessoaEntity(pessoa));
	}
	
	@SuppressWarnings("unchecked")
	public List<Pessoa> get() {
		List<PessoaEntity> pessoasEntity = em.createQuery("SELECT p FROM PessoaEntity p").getResultList();
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		for (PessoaEntity pe : pessoasEntity) {
			pessoas.add(pe.getPessoa());
		}
		
		return pessoas;
	}
}
