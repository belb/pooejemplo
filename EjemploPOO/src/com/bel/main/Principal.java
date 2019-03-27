package com.bel.main;
import java.util.ArrayList;
import java.util.List;

import com.bel.empleado.Empleado;
import com.bel.empleado.EmpleadoFactory;
import com.bel.empleados.Contador;
import com.bel.empleados.Gerente;
import com.bel.empleados.SoporteTecnico;
import com.bel.empresa.Empresa;
import com.bel.enums.EEmpleado;

public class Principal {
	public static void main(String args[])
	{    
				
		Empresa empresa=new Empresa();
	    List<Empleado> list=new ArrayList<Empleado>();
		empresa.setLista(list);
		Gerente gerente=(Gerente)EmpleadoFactory.EmpleadoFactoryBuild(EEmpleado.GERENTE);
		gerente.setNombre("Abel");
		gerente.setApM("Olivera");
		gerente.vestir();
		gerente.comer();
	    gerente.entrevistar();
	    
		Contador contador=(Contador)EmpleadoFactory.EmpleadoFactoryBuild(EEmpleado.CONTADOR);
		contador.setNombre("Maria");
		contador.setApM("Mendez");
		contador.vestir();
		contador.comer();
		contador.balancear();
		
		SoporteTecnico sp=(SoporteTecnico)EmpleadoFactory.EmpleadoFactoryBuild(EEmpleado.SOPORTE_TECNICO);
		sp.setNombre("José");
		sp.setApM("López");
		sp.vestir();
		sp.comer();
		sp.levantarTicket();
		
		
		list.add(gerente);
		list.add(contador);
		list.add(sp);
		
		empresa.mostrarEmpleados(); //muestra los empleados de la empresa 
		
		
	}

}
