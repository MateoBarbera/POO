package formas;

public class Elipse extends Forma {
	private Double radioMayor;
	private Double radioMenor;

	public Elipse() {
		this.radioMayor = 0.0;
		this.radioMenor = 0.0;
		super.setNombre("Elipse");
	}

	public Elipse(String color, Punto centro, Double radioMayor, Double radioMenor) {
		super(color, "Elispse", centro);
		this.radioMayor = radioMayor;
		this.radioMenor = radioMenor;
	}

	public Double getRadioMayor() {
		return radioMayor;
	}

	public void setRadioMayor(Double radioMayor) {
		this.radioMayor = radioMayor;
	}

	public Double getRadioMenor() {
		return radioMenor;
	}

	public void setRadioMenor(Double radioMenor) {
		this.radioMenor = radioMenor;
	}

	@Override
	public Double area() {
		Double result = Math.PI * (this.radioMenor * this.radioMayor);
		return result;
	}

	@Override
	public Double perimetro() {
		Double result = 2 * Math.PI * ((Math.pow(this.radioMenor, 2) + Math.pow(this.radioMayor, 2)) / 2);
		return result;
	}

}
