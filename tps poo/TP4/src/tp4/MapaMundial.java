package tp4;

import java.util.ArrayList;
import java.util.List;

public class MapaMundial {

	private List<Continente> continentes;

	public MapaMundial() {
		continentes = new ArrayList<Continente>();
		inicializar();
	}

	public void inicializar() {

		Continente africa = new Continente("Africa");
		Continente antartida = new Continente("Antartida");
		Continente americadelsur = new Continente("America del sur");
		Continente americacentral = new Continente("America central");
		Continente americadelnorte = new Continente("America del norte");
		Continente asia = new Continente("Asia");
		Continente oceania = new Continente("Oceania");
		Continente europa = new Continente("Europa");

		continentes.add(africa);
		continentes.add(antartida);
		continentes.add(americadelsur);
		continentes.add(americacentral);
		continentes.add(americadelnorte);
		continentes.add(asia);
		continentes.add(oceania);
		continentes.add(europa);

		Pais argentina = new Pais("Argentina", "Buenos Aires", americadelsur);
		Pais uruguay = new Pais("Uruguay", "Montevideo", americadelsur);
		Pais brasil = new Pais("Brasil", "Brasilia", americadelsur);
		Pais chile = new Pais("Chile", "Santiago de Chile", americadelsur);
		Pais paraguay = new Pais("Paraguay", "Asuncion", americadelsur);
		Pais bolivia = new Pais("Bolivia", "La paz / Sucre", americadelsur);
		Pais espania = new Pais("España", "Madrid", europa);
		Pais francia = new Pais("Francia", "Paris", europa);
		Pais italia = new Pais("Italia", "Roma", europa);
		Pais portugal = new Pais("Portugal", "Lisboa", europa);

		americadelsur.agregarPais(argentina);
		americadelsur.agregarPais(uruguay);
		americadelsur.agregarPais(brasil);
		americadelsur.agregarPais(chile);
		americadelsur.agregarPais(paraguay);
		americadelsur.agregarPais(bolivia);
		europa.agregarPais(espania);
		europa.agregarPais(francia);
		europa.agregarPais(italia);
		europa.agregarPais(portugal);

		Provincia entreRios = new Provincia("Entre Rios", argentina);
		Provincia buenosAires = new Provincia("Buenos Aires", argentina);
		Provincia santaFe = new Provincia("Santa Fe", argentina);
		Provincia corrientes = new Provincia("Corrientes", argentina);
		Provincia cordoba = new Provincia("Cordoba", argentina);
		Provincia salto = new Provincia("Salto", uruguay);
		Provincia paysandu = new Provincia("Paysandu", uruguay);
		Provincia canelones = new Provincia("Canelones", uruguay);
		Provincia rocha = new Provincia("Rocha", uruguay);
		Provincia maldonado = new Provincia("Maldonado", uruguay);

		argentina.agregarProvincia(entreRios);
		argentina.agregarProvincia(buenosAires);
		argentina.agregarProvincia(santaFe);
		argentina.agregarProvincia(corrientes);
		argentina.agregarProvincia(cordoba);
		uruguay.agregarProvincia(salto);
		uruguay.agregarProvincia(paysandu);
		uruguay.agregarProvincia(canelones);
		uruguay.agregarProvincia(rocha);
		uruguay.agregarProvincia(maldonado);

		argentina.agregarLimitrofe(uruguay);
		argentina.agregarLimitrofe(brasil);
		argentina.agregarLimitrofe(chile);
		argentina.agregarLimitrofe(bolivia);
		argentina.agregarLimitrofe(paraguay);

		uruguay.agregarLimitrofe(brasil);
		uruguay.agregarLimitrofe(argentina);
		
		francia.agregarLimitrofe(italia);
		italia.agregarLimitrofe(francia);

	}

	public List<Pais> getPaises(String nombreContinente) {
		for (Continente continente : continentes) {
			if (continente.getNombre().equalsIgnoreCase(nombreContinente)) {
				return continente.getPaises();
			}
		}
		return null;
	}

	public List<Provincia> getProvincias(String nombrePais) {
		for (Continente continente : continentes) {
			for (Pais pais : continente.getPaises()) {
				if (pais.getNombre().equalsIgnoreCase(nombrePais)) {
					return pais.getProvincias();
				}
			}
		}
		return null;
	}

	public List<Pais> getLimitrofes(String nombrePais) {
		for (Continente continente : continentes) {
			for (Pais pais : continente.getPaises()) {
				if (pais.getNombre().equalsIgnoreCase(nombrePais)) {
					return pais.getLimitrofes();
				}
			}
		}
		return null;
	}

}
