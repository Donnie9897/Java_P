package cines;

import java.util.Date;

public class boleta {
	private String idBoleta;
	private float precioVenta;
	private pelicula pelProyectada;
	private String Sala;
	private String asiento;
	private Date hora;
	
	
	public boleta(String idBoleta, float precioVenta, String sala, String asiento, Date hora) {
		super();
		this.idBoleta = idBoleta;
		this.precioVenta = precioVenta;
		Sala = sala;
		this.asiento = asiento;
		this.hora = hora;
	}


	public String getIdBoleta() {
		return idBoleta;
	}


	public void setIdBoleta(String idBoleta) {
		this.idBoleta = idBoleta;
	}


	public float getPrecioVenta() {
		return precioVenta;
	}


	public void setPrecioVenta(float precioVenta) {
		this.precioVenta = precioVenta;
	}


	public pelicula getPelProyectada() {
		return pelProyectada;
	}


	public void setPelProyectada(pelicula pelProyectada) {
		this.pelProyectada = pelProyectada;
	}


	public String getSala() {
		return Sala;
	}


	public void setSala(String sala) {
		Sala = sala;
	}


	public String getAsiento() {
		return asiento;
	}


	public void setAsiento(String asiento) {
		this.asiento = asiento;
	}


	public Date getHora() {
		return hora;
	}


	public void setHora(Date hora) {
		this.hora = hora;
	}
	
	
	
}
