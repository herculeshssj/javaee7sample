package br.ufrj.tic.jpa;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.ufrj.tic.jaxrs.Pessoa;

@Entity
@Table(name="pessoa")
public class PessoaEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column(nullable=false, length=50)
	private String nome;
	
	@Column
	private int idade;
	
	@Column(nullable=false)
	@Temporal(TemporalType.DATE)
	private Date dataNascimento;
	
	public PessoaEntity() {
		
	}
	
	public PessoaEntity(Pessoa pessoa) {
		this.id = pessoa.getId();
		this.nome = pessoa.getNome();
		this.idade = pessoa.getIdade();
		this.dataNascimento = pessoa.getDataNascimento();
	}
	
	public Pessoa getPessoa() {
		Pessoa pessoa = new Pessoa();
		pessoa.setId(this.getId());
		pessoa.setNome(this.getNome());
		pessoa.setIdade(this.getIdade());
		pessoa.setDataNascimento(this.getDataNascimento());
		return pessoa;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Integer.signum(getId() == null ? 0 : getId() ^ (getId() == null ? 1 : getId() >>> 32));
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getId() == null) return false;
		if (getClass() != obj.getClass()) return false;

		PessoaEntity other = (PessoaEntity) obj;
		if (!getId().equals(other.getId())) return false;
		return true;
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

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}