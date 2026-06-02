package banco;

public class Cliente{
	private String nombre;
	private String apellido;
	private int edad;
	private double sueldoNetoMensual;
	
	public Cliente(String nombre, String apellido, int edad, double sueldoNetoMensual) {
		this.nombre = nombre ;
		this.apellido = apellido;
		this.edad = edad;
		this.sueldoNetoMensual = sueldoNetoMensual;
	}
	
	public double sueldoNetoAnual() {
		return 0;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
