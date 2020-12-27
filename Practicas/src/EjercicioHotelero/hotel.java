package EjercicioHotelero;

import java.util.ArrayList;
import java.util.Date;

public class hotel {
	private float precioSuite;
	private float precioDoble;
	private float precioSimple;
	private ArrayList<Empleado> misEmpleados;
	private String id;
	
	public hotel(float precioSuite, float precioDoble, float precioSimple) {
		super();
		this.precioSuite = precioSuite;
		this.precioDoble = precioDoble;
		this.precioSimple = precioSimple;
	}
	

	public float getPrecioSuite() {
		return precioSuite;
	}

	public void setPrecioSuite(float precioSuite) {
		this.precioSuite = precioSuite;
	}

	public float getPrecioDoble() {
		return precioDoble;
	}

	public void setPrecioDoble(float precioDoble) {
		this.precioDoble = precioDoble;
	}

	public float getPrecioSimple() {
		return precioSimple;
	}

	public void setPrecioSimple(float precioSimple) {
		this.precioSimple = precioSimple;
	}


	public ArrayList<Empleado> getMisEmpleados() {
		return misEmpleados;
	}


	public void setMisEmpleados(ArrayList<Empleado> misEmpleados) {
		this.misEmpleados = misEmpleados;
	}
	
	public boolean login(String nombre, String contrasenia) {
		boolean iniciar = false;
		
		if(buscarEmpleadoPorNombre(nombre)) {
			iniciar = true;
		}
		
		return iniciar;
	}
	
	public boolean buscarEmpleadoPorNombre(String nombre){
		int i = 0;
		boolean encontrado = false;
		
		while(!encontrado && i < misEmpleados.size()) {
			if(misEmpleados.get(i).nombre.equalsIgnoreCase(nombre)) {
				encontrado = true;
			}
		}
		return encontrado;
	}	
	public float reservar(String tipoHabitacion, Date diaLlegada, Date diaSalida, Empleado auxEmpleado){
		float total = 0;
		
		switch(tipoHabitacion) {
		case "Suite":
			total = (diaLlegada.getDate() - diaSalida.getDate())* precioSuite;
			break;
		
		case "Simple":
			total = (diaLlegada.getDate() - diaSalida.getDate())* precioSimple;
			break;
		
		case "Doble":
			total = (diaLlegada.getDate() - diaSalida.getDate())* precioDoble;
			break;
		}	
		Reservacion 
		return total;
	}
}
