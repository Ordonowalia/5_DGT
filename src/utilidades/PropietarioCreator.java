package utilidades;

import objetos.Propietario;

public class PropietarioCreator {

	public Propietario getPropietario(String dni, String nombre, String fechaNacimiento) {

		Propietario devolver = new Propietario(dni);

		try {
			devolver.setNombre(nombre);
			devolver.setFechaNacimiento(fechaNacimiento);

		} catch (Exception e) {

			e.printStackTrace();
			devolver = null;

		}

		return devolver;

	}

}
