package br.com.db1.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.db1.model.Produto;

@Path("/produto")
public class ProdutoRest {

	@GET
	@Path("/get")
	@Produces("application/json")
	public Produto getProdutoJSON() {

		Produto produto = new Produto();
		produto.setNome("Moto X - Android");
		produto.setQuantidade(10);

		return produto;

	}
	@POST
	@Path("/post")
	@Consumes("application/json")
	public Response criarProdutoJSON(Produto produto) {
		String result = "Product created : " + produto;
		return Response.status(201).entity(result).build();

	}
}
