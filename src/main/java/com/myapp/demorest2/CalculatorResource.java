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
	public Response createAliean2(@PathParam("op")String op ,@PathParam("no1")String no1,@PathParam("no2")String no2)
	{
		double d1 = 0,d2 = 0;long l1 = 0,l2=0;
		boolean Isdouble=true,IsLong=true;
		try {
			d1= Double.valueOf(no1);
			d2= Double.valueOf(no2);
		}catch(Exception e) {
			Isdouble =false;
		}
		
		try {
			l1=Long.valueOf(no1);
			l2=Long.valueOf(no2);
		}
		catch(Exception e) {
			IsLong =false;
		}
		Long resultLong=(long) 0;
		Double resultDoule=(double) 0;
		
		if(IsLong) {
		   resultLong =CalculatorRepository.calculate(l1,l2,op);
		}
		else if(Isdouble)
		{
			 resultDoule =CalculatorRepository.calculate(d1,d2,op);
		}
		
		if(resultLong != -1  )
			 return Response.status(200)  
			            .entity(no1+" "+op+" " + no2+" : "+resultLong)  
			            .build(); 
		else if(resultDoule!=-1)
			 return Response.status(200)  
			            .entity(no1+" "+op+" " + no2+" : "+resultDoule)  
			            .build(); 
		else if (resultLong==-1 || resultDoule!=-1) 
			 return Response.status(200)  
			            .entity("Supported operations are ADD SUB MULT DIV '"+op+"' is invalid")  
			            .build();
		return null;

	}
	
	
}
