package examen2;

public class pasador extends jugador {
	
	private int pases;
	private int fintas;
	
	
	
	
	
	public pasador(String nombre, int erroresCometidos, int aces, int totalServicios, int pases, int fintas) {
		super(nombre, erroresCometidos, aces, totalServicios);
		this.pases = pases;
		this.fintas = fintas;
	}





	@Override
	public int efectividad() {
		// TODO Auto-generated method stub
		return (((pases + fintas) - erroresCometidos)*100)/(pases+fintas+erroresCometidos) + (aces*100)/totalServicios;
	}





	public int getPases() {
		return pases;
	}





	public void setPases(int pases) {
		this.pases = pases;
	}





	public int getFintas() {
		return fintas;
	}





	public void setFintas(int fintas) {
		this.fintas = fintas;
	}
	
	
	

}
