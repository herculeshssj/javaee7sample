package br.com.hslife.javaee7.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.hslife.javaee7.jaxrs.Pessoa;

@Stateless
public class PessoaDAO {

	@PersistenceContext(unitName="javaeePU")
	EntityManager em;
	
	public void save(Pessoa pessoa) {
		em.persist(new PessoaEntity(pessoa));
	}
	
	public void update(Pessoa pessoa) {
		PessoaEntity pessoaEntity = em.find(PessoaEntity.class, pessoa.getId());
		pessoaEntity.setPessoa(pessoa);
		em.merge(pessoaEntity);
	}
	
	public void remove(Integer id) {
		PessoaEntity pessoaEntity = em.find(PessoaEntity.class, id);
		em.remove(pessoaEntity);
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
	
	public Pessoa getPessoa(Integer id) {
		PessoaEntity pessoaEntity = em.find(PessoaEntity.class, id);
		return pessoaEntity.getPessoa();
	}
}
