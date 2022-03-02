package ej2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;


public class EmpleadoService {
	private static List<Empleado> empleados = new ArrayList<Empleado>();

	public static Boolean agregar(Empleado empleado) {

		if (empleados.isEmpty()) {
			try {
				empleado.setLegajo(1);
			}catch(EnteroPositivoException ex) {
				System.out.println(ex.getMessage());
			}
		} else {
			try {
				// Esto sirve para obtener el último empleado agregado. Mayor numero de legajo
				Empleado ultimo = Collections.max(empleados, new Comparator<Empleado>() {
	
					@Override
					public int compare(Empleado e1, Empleado e2) {
						if (e1.getLegajo() < e2.getLegajo()) {
							return -1;
						}
						if (e1.getLegajo() > e2.getLegajo()) {
							return 1;
						}
						return 0;
					}
	
				});
				empleado.setLegajo(ultimo.getLegajo() + 1);
			}catch(EnteroPositivoException ex) {
				System.out.println(ex.getMessage());
			}
		}
		return empleados.add(empleado);
	}

	public static List<Empleado> getEmpleados() throws CollectionVaciaException {
		if(empleados.size() > 0) {
			return empleados;
		}else {
			throw new CollectionVaciaException("No hay empleados para mostrar.");
		}
	}

	public static List<Empleado> getEmpleadosMezcaldos() {
		Collections.shuffle(empleados);
		return empleados;
	}

	public static Double sueldoPromedio() throws CollectionVaciaException {
		Double total = 0.0;
		if(empleados.size() > 0) {
			for (Empleado empleado : empleados) {
				total = total + empleado.getSueldo();
			}
			return total / empleados.size();
		}else {
			throw new CollectionVaciaException("No hay empleados.");
		}
	}

	public static Empleado mayorSueldo() throws CollectionVaciaException {
		Empleado mayor = new Empleado();
		Iterator<Empleado> iterator = empleados.iterator();
		if(empleados.size() > 0) {
			mayor = iterator.next();

			while (iterator.hasNext()) {
				Empleado empleado = iterator.next();
				if (mayor.getSueldo() <= empleado.getSueldo()) {
					mayor = empleado;
				}
			}
			return mayor;
		}else {
			throw new CollectionVaciaException("No hay empleados.");
		}
	}

	public static void eliminar(String nombre) throws CollectionVaciaException, NoEncontradoException {
		Boolean encontrado = Boolean.FALSE;
		Iterator<Empleado> iterator = empleados.iterator();
		if(empleados.size() > 0) {
			while (iterator.hasNext()) {
				Empleado empleado = iterator.next();
				if (empleado.getNombre().equalsIgnoreCase(nombre)) {
					encontrado = Boolean.TRUE;
					iterator.remove();
				}
			}
			if(!encontrado) {
				throw new NoEncontradoException("No se encontro el empleado.");
			}
		}else {
			throw new CollectionVaciaException("No hay empleados.");
		}
	}
}
