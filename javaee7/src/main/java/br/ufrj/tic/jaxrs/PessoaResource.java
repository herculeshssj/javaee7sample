package br.ufrj.tic.jaxrs;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("pessoa")
public class PessoaResource {
	
	@GET
	@Path("teste")
	@SuppressWarnings("deprecation")
	public Response teste() {
		Pessoa p = new Pessoa();
		p.setId(1);
		p.setNome("Pessoa de teste");
		p.setIdade(30);
		p.setDataNascimento(new Date(1980-1900, 0, 0));
		
		return Response.ok(p, MediaType.APPLICATION_JSON).build();
	}
	
}
