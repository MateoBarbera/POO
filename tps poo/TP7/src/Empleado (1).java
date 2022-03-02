package ej2;

public class Empleado {
	private Integer legajo;
	private String nombre;
	private Integer sueldo;

	public Empleado() {
		super();
	}

	public Empleado(String nombre, Integer sueldo) throws StringException, EnteroPositivoException {
		super();
		if(nombre == null || nombre.length() < 3) {
			throw new StringException("El nombre del empleado debe tener 3 o mas caracteres.");
		}else {
			this.nombre = nombre;
		}
		
		if(sueldo == null || sueldo <= 0) {
			throw new EnteroPositivoException("El sueldo del empleado debe ser mayor a 0.");
		}else {
			this.sueldo = sueldo;
		}
		
	}

	public Integer getLegajo() {
		return legajo;
	}

	public void setLegajo(Integer legajo) throws EnteroPositivoException {
		if(legajo == null || legajo <= 0) {
			throw new EnteroPositivoException("El legajo del empleado debe ser mayor a 0.");
		}else {
			this.legajo = legajo;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) throws StringException {
		if(nombre == null || nombre.length() < 3) {
			throw new StringException("El nombre del empleado debe tener 3 o mas caracteres.");
		}else {
			this.nombre = nombre;
		}
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(Integer sueldo) throws EnteroPositivoException {
		if(sueldo == null || sueldo <= 0) {
			throw new EnteroPositivoException("El sueldo del empleado debe ser mayor a 0.");
		}else {
			this.sueldo = sueldo;
		}
	}

	public String getSueldoString() {
		return "$" + sueldo;
	}

	@Override
	public String toString() {
		return this.getLegajo() + " - " + this.getNombre() + " - " + this.getSueldoString();
	}
}
