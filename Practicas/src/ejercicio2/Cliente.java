package ejercicio2;

import java.util.ArrayList;

public class Cliente {

	private String id;
	private String nombre;
	private String direccion;
	private ArrayList<Prestamos> misPrestamos;
	private int cantprestamos;
	
	public Cliente(String id, String nombre, String direccion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.setMisPrestamos(new ArrayList<Prestamos>());
		this.cantprestamos = 0;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCantprestamos() {
		return cantprestamos;
	}

	public ArrayList<Prestamos> getMisPrestamos() {
		return misPrestamos;
	}

	public void setMisPrestamos(ArrayList<Prestamos> misPrestamos) {
		this.misPrestamos = misPrestamos;
	}
	
	public void agregarElPrestamo(Prestamos prestamo) {
		misPrestamos.add(prestamo);
		cantprestamos++;
	}
	

}
