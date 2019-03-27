package com.bel.empleados;

import com.bel.empleado.Empleado;

public class SoporteTecnico extends Empleado{
	
	
	public SoporteTecnico()
	{
		
	}
	public SoporteTecnico(String nombre,String apellido)
	{
		super(nombre,apellido);
		
	}
    
	public void levantarTicket()
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
		
		return "Soporte Técnico: "+this.getNombre()+" "+this.getApM();
		
	}

}
