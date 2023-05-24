package utilidades;

import objetos.Vehiculo;

public class VehiculoCreator {

	public Vehiculo getVehiculo(String matricula, String marca, String modelo, String color) {

		Vehiculo devolver = new Vehiculo(matricula);

		try {
			devolver.setMarca(marca);
			devolver.setModelo(modelo);
			devolver.setColor(color);
			

		} catch (Exception e) {

			e.printStackTrace();
			devolver = null;

		}

		return devolver;

	}

}
