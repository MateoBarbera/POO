package ej2;

public class Menu {

	public static void main(String[] args) {
		// TODO code application logic here
		
		try {
			Empleado empleado1 = new Empleado("Juan", 500000);
			Empleado empleado2 = new Empleado("Er", 5000000);
			Empleado empleado3 = new Empleado("Sofia", 5000);
			Empleado empleado4 = new Empleado("Maria", 0);

			EmpleadoService.agregar(empleado1);
			EmpleadoService.agregar(empleado2);
			EmpleadoService.agregar(empleado3);
			EmpleadoService.agregar(empleado4);
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		
		try {
			System.out.println(EmpleadoService.getEmpleados());
			System.out.println(EmpleadoService.mayorSueldo());
			System.out.println(EmpleadoService.sueldoPromedio());
			EmpleadoService.eliminar("Juan");
			System.out.println(EmpleadoService.getEmpleados());
		}catch (CollectionVaciaException ex) {
			System.out.println(ex.getMessage());
		}catch (NoEncontradoException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
