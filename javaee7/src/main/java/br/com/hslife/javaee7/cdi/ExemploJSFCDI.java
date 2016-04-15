package br.com.hslife.javaee7.cdi;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class ExemploJSFCDI {

	public String getMensagem() {
		return "Olá mundo CDI :)";
	}
	
}
