package EjercicioHotelero;

import java.util.ArrayList;

public class cadenaHotelera {
	private ArrayList<hotel>misHoteles;
	private ArrayList<Empleado>misEmpleados;
	private ArrayList<Reservacion>misreservaciones;
	
	public cadenaHotelera() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArrayList<hotel> getMisHoteles() {
		return misHoteles;
	}

	public void setMisHoteles(ArrayList<hotel> misHoteles) {
		this.misHoteles = misHoteles;
	}

	public ArrayList<Empleado> getMisEmpleados() {
		return misEmpleados;
	}

	public void setMisEmpleados(ArrayList<Empleado> misEmpleados) {
		this.misEmpleados = misEmpleados;
	}

	public ArrayList<Reservacion> getMisreservaciones() {
		return misreservaciones;
	}

	public void setMisreservaciones(ArrayList<Reservacion> misreservaciones) {
		this.misreservaciones = misreservaciones;
	}
	
	public Reservacion reservar(String idEmpleado, String idHotel, String tipoHabitacion, Date diaLlegada, Date cantDias){
		Empleado auxEmpleado = buscarEmpleadoporId(idEmpleado);
		hotel auxHotel = buscarHotelporId(idHotel);

	}

	private hotel buscarHotelporId(String idHotel) {
		// TODO Auto-generated method stub
		return null;
	}

	private Empleado buscarEmpleadoporId(String idEmpleado) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
