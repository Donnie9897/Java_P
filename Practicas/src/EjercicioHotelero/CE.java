package EjercicioHotelero;

public class CE extends Empleado {
	private String area;

	public CE(String id, String nombre, String contrasenia, String area) {
		super(id, nombre, contrasenia);
		this.area = area;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	
}
