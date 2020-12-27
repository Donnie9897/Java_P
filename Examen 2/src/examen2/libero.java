package examen2;

public class libero extends jugador {
	private int recibos;
	
	
	
	public libero(String nombre, int erroresCometidos, int aces, int totalServicios, int recibos) {
		super(nombre, erroresCometidos, aces, totalServicios);
		this.recibos = recibos;
	}



	@Override
	public int efectividad() {
		// TODO Auto-generated method stub
		return (((recibos - erroresCometidos)*100)/(recibos+erroresCometidos)) + (aces*100)/totalServicios;		
	}



	public int getRecibos() {
		return recibos;
	}



	public void setRecibos(int recibos) {
		this.recibos = recibos;
	}

	
}
