package br.ufrj.tic.jaxrs;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.ufrj.tic.jpa.PessoaDAO;

@Path("pessoa")
public class PessoaResource {
	
	@Inject
	private PessoaEJB pessoaEJB;
	
	@Inject
	private PessoaDAO pessoaDAO;
	
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
	
	@GET
	@Produces("application/json")
	public List<Pessoa> findAll() {
		//return pessoaEJB.listarPessoas();
		return pessoaDAO.get();
	}

	@GET
	@Path("{id}")
	@Produces("application/json")
	public Pessoa findByID(@PathParam("id") int id) {
		return pessoaEJB.buscarPessoa(id);
	}
	
	@POST
	@Consumes("application/json")
	public Response save(Pessoa pessoa) {
		pessoa.setId(pessoaEJB.getNextID());
		pessoaEJB.salvarPessoa(pessoa);
		return Response.ok().build();
	}
	
	@PUT
	@Consumes("application/json")
	public Response update(Pessoa pessoa) {
		pessoaEJB.editarPessoa(pessoa);
		return Response.ok().build();
	}
	
	@DELETE
	@Path("{id}")
	public void remove(@PathParam("id") int id) {
		pessoaEJB.removerPessoa(id);
	}
}
