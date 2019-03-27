package com.bel.empresa;
import java.util.Iterator;
import java.util.List;

import com.bel.empleado.Empleado;


public class Empresa {
   private  List<Empleado> empleados;
       private String nombre;
       private String rfc;
   
  public Empresa()
  {	  
	  
	  
  }
  
  public Empresa(String nombre,String rfc)
  {	  
	  this.setNombre(nombre);
	  this.setRfc(rfc);
	  
  }
       
   public void setLista(List<Empleado> empleados)
   {
         this.empleados=empleados;
         
	   
   }
   
   public List<Empleado> getLista()
   {
	   return this.empleados;
	   
   }
   
   public  void mostrarEmpleados()
   {Iterator<Empleado> iterator= empleados.iterator();
	   while(iterator.hasNext())
	   {
		   System.out.println(iterator.next().toString());
		  
		   
		   
	   }
	   
	   
   }

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getRfc() {
	return rfc;
}

public void setRfc(String rfc) {
	this.rfc = rfc;
}
   
   
}
