package EjercicioHotelero;

public class Reservacion {
	private Empleado miEmpleado;
	private String tipoHabitacion;
	private int cantidadNoches;
	private float precioPorNoche;
	

	public Reservacion(Empleado miEmpleado, hotel miHotel, String tipoHabitacion, int cantidadNoches,
			float precioPorNoche) {
		super();
		this.miEmpleado = miEmpleado;
		this.tipoHabitacion = tipoHabitacion;
		this.cantidadNoches = cantidadNoches;
		this.precioPorNoche = precioPorNoche;
	}


	public Empleado getMiEmpleado() {
		return miEmpleado;
	}


	public void setMiEmpleado(Empleado miEmpleado) {
		this.miEmpleado = miEmpleado;
	}
				
	public String getTipoHabitacion() {
		return tipoHabitacion;
	}


	public void setTipoHabitacion(String tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}


	public int getCantidadNoches() {
		return cantidadNoches;
	}


	public void setCantidadNoches(int cantidadNoches) {
		this.cantidadNoches = cantidadNoches;
	}


	public float getPrecioPorNoche() {
		return precioPorNoche;
	}


	public void setPrecioPorNoche(float precioPorNoche) {
		this.precioPorNoche = precioPorNoche;
	}
	



	
}
