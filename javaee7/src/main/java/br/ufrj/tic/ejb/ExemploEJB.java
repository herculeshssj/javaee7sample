package br.ufrj.tic.ejb;

import javax.ejb.Stateless;

@Stateless
public class ExemploEJB {

	public String mensagem() {
		return "Seja bem vindo EJB!";
	}
	
}