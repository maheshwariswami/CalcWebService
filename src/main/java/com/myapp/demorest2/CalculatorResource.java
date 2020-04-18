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
	
	@GET
	@Path("{op}/{no1}/{no2}")		
	public Response calculator(@PathParam("op")String op ,@PathParam("no1")String no1,@PathParam("no2")String no2)
	{
		if(!CalculatorRepository.operation.contains(op.toUpperCase()))
		{
			System.out.println("Invalid operation specified : "+op.toUpperCase());
			 return Response.status(200)  
			            .entity("Invalid operation specified : "+op.toUpperCase())  
			            .build();
		}
		
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
		
		if(IsLong == false && Isdouble ==false)
		{
			System.out.println("Invalid Numbers supplied : "+ no1 + " AND "+no2);
			 return Response.status(200)  
			            .entity("Invalid Numbers supplied : "+ no1 + " AND "+no2)  
			            .build();
		}
		
		Long resultLong=(long) 0;
		Double resultDouble=(double) 0;
		
		if(IsLong) {
		   resultLong =CalculatorRepository.calculate(l1,l2,op);
		   return Response.status(200)  
		            .entity(no1+" "+op.toUpperCase()+" " + no2+" : "+resultLong)  
		            .build(); 
		}
		else if(Isdouble)
		{
			 resultDouble =CalculatorRepository.calculate(d1,d2,op);
			 return Response.status(200)  
			            .entity(no1+" "+op.toUpperCase()+" " + no2+" : "+resultDouble)  
			            .build(); 
		}
		
		return null;
	}
	
	
}
