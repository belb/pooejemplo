package com.bel.empleado;

import com.bel.empleados.Contador;
import com.bel.empleados.Gerente;
import com.bel.empleados.SoporteTecnico;
import com.bel.enums.EEmpleado;
public class EmpleadoFactory{
	
	
	public static Empleado EmpleadoFactoryBuild(EEmpleado tipo)
	{    
			
		switch(tipo)
		{
		case  GERENTE:  return (new Gerente());
	    case   CONTADOR: return (new Contador());
	    case SOPORTE_TECNICO:return (new SoporteTecnico());
		default:  System.out.println("Tipo desconocido");break;
		
		}		
		return null;
		
	}
	

}
