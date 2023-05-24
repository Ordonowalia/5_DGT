package objetos;

public class Propietario {

	private String dni;
	private String nombre;
	private String fechaNacimiento;

	public Propietario(String dni, String nombre, String fechaNacimiento) {

		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}

	public Propietario(String dni) {
		this.dni = dni;

	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Propietario [dni=" + dni + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + "]";
	}

}
