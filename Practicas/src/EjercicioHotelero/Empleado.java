package EjercicioHotelero;

public abstract class Empleado {
	

	protected String id;
	protected String nombre;
	protected String contrasenia;
	
	public Empleado(String id, String nombre, String contrasenia) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.contrasenia = contrasenia;
	
	}
	
	
}
