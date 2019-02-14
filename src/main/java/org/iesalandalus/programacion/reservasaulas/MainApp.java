package org.iesalandalus.programacion.reservasaulas;

import org.iesalandalus.programacion.reservasaulas.vista.Consola;
import org.iesalandalus.programacion.reservasaulas.vista.IUTextual;

/**
 * @author Emanuel Martínez Lonardi
 *
 */

public class MainApp {

	public static void main(String[] args) {
		Consola.mostrarCabecera("Gestión de reservas de Aulas - IES Al-Ándalus");
		IUTextual iuTextual = new IUTextual();
		iuTextual.comenzar();
	}

}
