package formas;

import java.util.ArrayList;
import java.util.List;

public class Rectangulo extends Forma {

	private Double ladoMenor;
	private Double ladoMayor;
	private List<Punto> vertices;
	
	public Rectangulo(String color, Punto centro, Double ladoMenor, Double ladoMayor) {
		super(color, "Rectangulo", centro);
		this.ladoMayor = ladoMayor;
		this.ladoMenor = ladoMenor;
		this.vertices = new ArrayList<Punto>();
	}

	public void setLadoMenor(Double ladoMenor) {
		this.ladoMenor = ladoMenor;
	}

	public void setLadoMayor(Double ladoMayor) {
		this.ladoMayor = ladoMayor;
	}

	public Double getLadoMenor() {
		return ladoMenor;
	}

	public Double getLadoMayor() {
		return ladoMayor;
	}

	@Override
	public final Double area() {
		Double result = this.ladoMenor * this.ladoMayor;
		return result;
	}
		
	@Override
	public Double perimetro() {
		Double result = 2*this.ladoMenor + 2*this.ladoMayor ;		
		return result;
	}
	
	public void cambiarTamanio(Double factorEscala) {
		this.ladoMenor = this.ladoMenor * factorEscala;
		this.ladoMayor = this.ladoMayor * factorEscala;
	}

	@Override
	public String toString() {
		return "Rectangulo [ladoMenor=" + ladoMenor + ", ladoMayor=" + ladoMayor + ", vertices=" + vertices + "]";
	}
	
	@Override
	public String imprimir() {
		return super.imprimir() + "\n" +
				"Lado menor = " + this.ladoMenor + "\n" + 
				"Lado mayor = " + this.ladoMayor;
	}

}
