package com.bel.empleado;

import com.bel.interfaces.Persona;

public abstract class Empleado implements Persona{
    private String nombre;
    private String apM;
    
   
	    public Empleado()
    {
    	
    	
    	
    }
    public Empleado(String nombre,String apM)
    {
    	this.nombre=nombre;
    	this.apM=apM;
    	
    }
    
	public void setNombre(String nombre)
	{
		this.nombre=nombre;
		
	}
	public String getNombre(){
		return nombre;		
		
	}
	public void setApM(String apM)
	{
	   this.apM=apM;	
		
	}
	public String getApM()
	{
		return apM;
		
	}

}
