package utilidades;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

import objetos.Propietario;
import objetos.Vehiculo;


public class Writer {

	private final static String FICHERO4 = "C:\\Users\\nukep\\desktop\\ficherosprog\\salidaDGT.txt";
	BufferedWriter ficheroSalida;

	public void escribirDatos(HashMap<String, Vehiculo> listaFinal) throws IOException {
		ficheroSalida = new BufferedWriter(new FileWriter(FICHERO4));

		for (String listaVehiculos : listaFinal.keySet()) {

		
			Vehiculo vehiculoActual = listaFinal.get(listaVehiculos);
			

			ficheroSalida.write(vehiculoActual.getMatricula());
			ficheroSalida.newLine();
			ficheroSalida.write(vehiculoActual.getMarca());
			ficheroSalida.newLine();
			ficheroSalida.write(vehiculoActual.getModelo());
			ficheroSalida.newLine();
			ficheroSalida.write(vehiculoActual.getColor());
			ficheroSalida.newLine();
			ficheroSalida.write(vehiculoActual.getPropietario().getDni());
			ficheroSalida.newLine();
			ficheroSalida.write(vehiculoActual.getPropietario().getNombre());
			ficheroSalida.newLine();
			ficheroSalida.write(vehiculoActual.getPropietario().getFechaNacimiento());
			ficheroSalida.newLine();
		
			

		}
		ficheroSalida.close();
	}
}
