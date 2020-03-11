package com.niit.tlc.myrest1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
//import javax.xml.ws.Response;

@Path("books")
public class BookResourceXML {

	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/{id}")
	public Response getAllBooks(@PathParam("id") String bookId) {
		Book book=new Book();
		book.setId(bookId);
		book.setName("Harry Potter");
		book.setVolumeNumber(1);
		book.setAuthorname("J.K Bowling");
		return Response.status(200).entity(book).build();
		
	}
	
	
}
