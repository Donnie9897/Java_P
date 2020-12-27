package Ejercicio3CReparaciones;

public abstract class Trabajador {

	protected String cedula;
	protected String nombre;
	protected float salario;
	protected int antiguedad;
	protected int[] cantDiasTrabajados;
	
	public Trabajador(String cedula, String nombre, float salario, int antiguedad, int[] cantDiasTrabajados) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.salario = salario;
		this.antiguedad = antiguedad;
		this.cantDiasTrabajados = cantDiasTrabajados;
	}
	
	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	
	public float calcularSalario(); 
	

}
