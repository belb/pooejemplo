package com.bel.enums;


	public enum EEmpleado{
    	GERENTE(1),
    	CONTADOR(2),
    	SOPORTE_TECNICO(3)
    	;
    	
    	 private final int tipo;
    	private EEmpleado(int tipo)
    	{
    		this.tipo=tipo;
    	}
    	public int getTipo()
    	{
    		return tipo;
    	}
    	
    }