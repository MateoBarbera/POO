package formas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {

	public static void main(String[] args) {

		List<Forma> formas = new ArrayList<Forma>();

		Rectangulo rectangulo = new Rectangulo("rojo", new Punto(23, 45), 4.0, 3.0);
		Elipse elipse = new Elipse("blanca", new Punto(23, 45), 2.0, 5.0);

		formas.add(rectangulo);
		formas.add(elipse);

		System.out.println(rectangulo.imprimir());
		System.out.println(rectangulo.perimetro());
		System.out.println(rectangulo.area());

		rectangulo.cambiarTamanio(2.0);
		System.out.println();
		System.out.println(rectangulo.perimetro());
		System.out.println(rectangulo.area());

		System.out.println();
		System.out.println(elipse.imprimir());
		System.out.println(elipse.perimetro());
		System.out.println(elipse.area());

		Iterator<Forma> iterador = formas.iterator();

		while (iterador.hasNext()) {
			Forma f = iterador.next();
			f.setColor("verde");
			f.mover(new Punto(10, 20));
		}

		for (Forma f : formas) {
			System.out.println(f.imprimir());
			System.out.println(f.area());
		}

	}

}
