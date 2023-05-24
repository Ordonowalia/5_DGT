package go;

import java.io.IOException;
import java.util.HashMap;


import objetos.Vehiculo;
import utilidades.Read;
import utilidades.Writer;

public class Start {


		public static void main(String[] args) throws IOException {
			
			Read read = new Read();
			Writer write = new Writer();

		HashMap<String, Vehiculo>listavehiculos=read.mezclarDatos();
			write.escribirDatos(listavehiculos);

	}

}
