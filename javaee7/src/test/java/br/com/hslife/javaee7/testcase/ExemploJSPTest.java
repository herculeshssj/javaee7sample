package br.com.hslife.javaee7.testcase;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.hslife.javaee7.servletjsp.ExemploJSP;

public class ExemploJSPTest {
	
	@Test
	public void testMensagem() {
		ExemploJSP e = new ExemploJSP();
		//fail("Not yet implemented");
		assertEquals("Olá mundo.", e.mensagem());
		
	}

}
