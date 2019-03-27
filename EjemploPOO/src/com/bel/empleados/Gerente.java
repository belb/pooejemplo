package com.bel.empleados;

import com.bel.empleado.Empleado;

public class Gerente extends Empleado {
     
	
	
	public Gerente()
	{
		
		
		
	}
	
	public Gerente(String nombre,String apM)
	{
		super(nombre,apM);
		
	}
	
	public void entrevistar()
	{
	
		
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
	
	public String toString()
	{
		  return "Gerente: "+this.getNombre()+" "+this.getApM();
	}
	
	
}
