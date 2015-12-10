package br.ufrj.tic.jaxrs;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Pessoa {
	
	private Integer id;
	
	private String nome;
	
	private int idade;
	
	private Date dataNascimento;
	
	public Pessoa() {
		
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

		Pessoa other = (Pessoa) obj;
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