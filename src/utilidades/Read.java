package utilidades;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;


import objetos.Propietario;
import objetos.Vehiculo;

public class Read {

	private final static String FICHERO1 = "C:\\Users\\nukep\\desktop\\ficherosprog\\vehiculos.txt";
	private final static String FICHERO2 = "C:\\Users\\nukep\\desktop\\ficherosprog\\propietario.txt";
	private final static String FICHERO3 = "C:\\Users\\nukep\\desktop\\ficherosprog\\vehiculoDueño.txt";
	private HashMap<String, Vehiculo> listaVehiculos = new HashMap<>();
	private HashMap<String, Propietario> listaPropietarios = new HashMap<>();
	
	
	
	
	public HashMap<String, Vehiculo> mezclarDatos() {

		BufferedReader ficheroEntrada;
		BufferedReader ficheroEntrada1;
		BufferedReader ficheroEntrada2;

		try {
			// BufferedReader enlaza con un fichero; para ello en java hay que crear un
			// FileReader
			ficheroEntrada = new BufferedReader(new FileReader(FICHERO1));

			// leo una linea del fichero

			String matricula = ficheroEntrada.readLine();

			// mientras que las lineas existan y no leamos null

			while (matricula != null) {
				Vehiculo vehiculo = new Vehiculo(matricula);
				vehiculo.setMarca(ficheroEntrada.readLine());
				vehiculo.setModelo(ficheroEntrada.readLine());
				vehiculo.setColor(ficheroEntrada.readLine());
				listaVehiculos.put(matricula, vehiculo);
				matricula = ficheroEntrada.readLine();
			}
			ficheroEntrada.close();
			ficheroEntrada1 = new BufferedReader(new FileReader(FICHERO2));

			String dni = ficheroEntrada1.readLine();

			// mientras que las lineas existan y no leamos null

			while (dni != null) {
				Propietario propietario = new Propietario(dni);
				propietario.setNombre(ficheroEntrada1.readLine());
				propietario.setFechaNacimiento(ficheroEntrada1.readLine());
				listaPropietarios.put(dni, propietario);
				dni = ficheroEntrada1.readLine();
			}

			
			ficheroEntrada2 = new BufferedReader(new FileReader(FICHERO3));

			String matriculaM = ficheroEntrada2.readLine();

			// mientras que las lineas existan y no leamos null

			while (matriculaM != null) {
				String dniM = ficheroEntrada2.readLine();
				Vehiculo vehiculoCopia= listaVehiculos.get(matriculaM);
				Propietario propietarioCopia = listaPropietarios.get(dniM);
				vehiculoCopia.setPropietario(propietarioCopia);
				listaVehiculos.put(matriculaM, vehiculoCopia);
				matriculaM = ficheroEntrada2.readLine();
			}
			System.out.println(listaVehiculos);
		
		


		} catch (IOException e) {
			System.out.println("Problemas: " + e.getMessage());
		} catch (Exception e) {
			// Otro fallos
			e.printStackTrace();
		}
		return listaVehiculos;

	}

}
	
	
