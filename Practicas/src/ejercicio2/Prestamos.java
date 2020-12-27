package ejercicio2;

import java.util.Date;

public class Prestamos {
	private Date fechaPrestamo;
	private Date fechaEntrega; //devolver
	private String id;
	private publicaciones publicacion;
	private boolean estadoPrestamo;
	private boolean prorroga;
	private int generadorPrestamosid;
	
	public Prestamos(String id, Date fechaPrestamo, String idCliente, publicaciones publicacion) {
		super();
		this.fechaPrestamo = fechaPrestamo;
		this.id = idCliente;
		this.publicacion = publicacion;
		this.estadoPrestamo = true;
		this.prorroga = true;
		this.fechaEntrega = new Date();
		this.id = id;
		this.generadorPrestamosid = 0;
	}

	public Date getFechaPrestamo() {
		return fechaPrestamo;
	}

	public void setFechaPrestamo(Date fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public publicaciones getPublicacion() {
		return publicacion;
	}

	public void setPublicacion(publicaciones publicacion) {
		this.publicacion = publicacion;
	}

	public boolean isEstadoPrestamo() {
		return estadoPrestamo;
	}

	public void setEstadoPrestamo(boolean estadoPrestamo) {
		this.estadoPrestamo = estadoPrestamo;
	}

	public boolean isProrroga() {
		return prorroga;
	}

	public void setProrroga(boolean prorroga) {
		this.prorroga = prorroga;
	}
	
	@SuppressWarnings("null")
	public boolean OtorgarPrestamo(String idcliente, String idpublicacion, Date fechaPrestamo, String idCliente, publicaciones publicacion) {
	Prestamos nuevoPrestamo;
	Cliente nuevoCliente = null;
	biblioteca aux = new biblioteca();
	publicaciones ayuda = null;
	
		if(aux.buscarIdCliente(idcliente)) {
			if(aux.buscarIdPublicacion(idpublicacion) && ayuda.isEstado() == true && ayuda.getCantidad() > 5){
				nuevoPrestamo = new Prestamos("P "+ generadorPrestamosid, fechaPrestamo, idCliente, publicacion); 
				aux.agregarElPrestamo(nuevoPrestamo);
				nuevoCliente.agregarElPrestamo(nuevoPrestamo);
				generadorPrestamosid++;
				
			}
		}
		
		return true;
	}

}

