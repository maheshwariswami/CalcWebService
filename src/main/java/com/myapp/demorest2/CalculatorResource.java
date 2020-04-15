package com.myapp.demorest2;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("calculator")
public class CalculatorResource {


	
//	@POST
//	@Path("operation/{op}{no1}{no2}")
//	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
//	public int createAliean(@PathParam("op")String op ,@PathParam("no1")int no1,@PathParam("no2")int no2)
//	{
//		System.out.println(op+" : -"+" No1 "+no1+" No2 "+no2);
//		int result =CalculatorRepository.calculate(no1,no2,op);
//		return result;
//	}
	
	@GET
	@Path("{op}/{no1}/{no2}")		
	public Response createAliean2(@PathParam("op")String op ,@PathParam("no1")int no1,@PathParam("no2")int no2)
	{
		
		Integer result =CalculatorRepository.calculate(no1,no2,op);
		if(result != 0)
			 return Response.status(200)  
			            .entity(no1+" "+op+" " + no2+" : "+result)  
			            .build(); 
		else
			 return Response.status(200)  
			            .entity("Supported operations are ADD SUB MULT DIV '"+op+"' is invalid")  
			            .build();

	}
}
