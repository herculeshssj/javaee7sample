package br.ufrj.tic.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="exemploJSF")
@RequestScoped
public class ExemploJSF {

	public String getMensagem() {
		return "Olá mundo!";
	}
	
}
