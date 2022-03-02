package formas;

public abstract class Forma {
	
	private String color;
	private String nombre;
	private Punto centro;

	public Forma() {
		super();
	}

	public Forma(String color, String nombre, Punto centro) {
		super();
		this.color = color;
		this.nombre = nombre;
		this.centro = centro;
	}

	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Punto getCentro() {
		return centro;
	}
	
	public void mover(Punto centro) {
		this.centro = centro;
	}
	
	public String imprimir() {
		return "El nombre de la forma es: " + this.nombre + "\n" +
		"El color de la forma es: " + this.color + "\n" +
		"La coordenada X es: " + this.getCentro().getCoordenadaX() + "\n" +
		"La coordenada Y es: " + this.getCentro().getCoordenadaY();
	}

	public abstract Double area();

	public abstract Double perimetro();

	
}
