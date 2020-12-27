package Ejercicio;

public class Empresa {
	private Almacen[] almaConocidos;
	private int cantidadAlma;
	
	public Empresa(Almacen[] almaConocidos, int cantidadAlma) {
		super();
		this.almaConocidos = almaConocidos;
		this.cantidadAlma = cantidadAlma;
	}

	public Almacen[] getAlmaConocidos() {
		return almaConocidos;
	}

	public void setAlmaConocidos(Almacen[] almaConocidos) {
		this.almaConocidos = almaConocidos;
	}

	public int getCantidadAlma() {
		return cantidadAlma;
	}

	public void setCantidadAlma(int cantidadAlma) {
		this.cantidadAlma = cantidadAlma;
	}
}
