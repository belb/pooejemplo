# pooejemplo

es un ejemplo de implementacion de objetos empleado, donde incluye herencia, polimorfismo,interfaces etc.

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
    
    
resultado del ejemplo:
Gerente: Abel Olivera
Contador: Maria Mendez
Soporte Técnico: José López

