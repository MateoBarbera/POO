package paquete;

public enum tiposnaipe
{
	ORO("Oro"), 
	ESPADA("Espada"), 
	COPA("Copa"), 
	BASTO("Basto");
	
	private String familia;
	
	private FamiliaNaipe(String familia)
	{
		this.familia = familia;
	}
	
}