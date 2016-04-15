package br.com.hslife.javaee7.jsf;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.hslife.javaee7.ejb.ExemploEJB;

@Named
@RequestScoped
public class ExemploJSFEJB {
	
	@Inject
	private ExemploEJB exemploJSFEJB;

	public String getMensagem() {
		return exemploJSFEJB.mensagem();
	}
	
}
