package br.com.hslife.javaee7.ejb;

import javax.ejb.Stateless;

@Stateless
public class ExemploEJB {

	public String mensagem() {
		return "Seja bem vindo EJB!";
	}
	
}