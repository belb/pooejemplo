package com.bel.empleados;

import com.bel.empleado.Empleado;

public class Contador extends Empleado{

	   
	  public Contador()
	  {	  
	  }
	  
	  public Contador(String nombre,String apellido)
	  {
		  super(nombre,apellido);
		  
		  	  
	  }
	
      public void balancear(){
    	  
    	  
    	  
      }

	@Override
	public void vestir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		
	}
	public String toString(){
		return "Contador: "+this.getNombre()+" "+this.getApM();		
	}
	
}
