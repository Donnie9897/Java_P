package EjercicioHotelero;

public class VIP extends Empleado {
	private int aniosTrabajo;

	public VIP(String id, String nombre, String contrasenia, int aniosTrabajo) {
		super(id, nombre, contrasenia);
		this.aniosTrabajo = aniosTrabajo;
	}

	public int getAniosTrabajo() {
		return aniosTrabajo;
	}

	public void setAniosTrabajo(int aniosTrabajo) {
		this.aniosTrabajo = aniosTrabajo;
	}
	
	
}	
