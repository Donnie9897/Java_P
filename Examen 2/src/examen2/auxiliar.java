package examen2;

public class auxiliar extends jugador {
	
	private int ataques;
	private int bloqueosEfectivos;
	private int bloqueosFallidos;
	
	
	
	
	public auxiliar(String nombre, int erroresCometidos, int aces, int totalServicios, int ataques,
			int bloqueosEfectivos, int bloqueosFallidos) {
		super(nombre, erroresCometidos, aces, totalServicios);
		this.ataques = ataques;
		this.bloqueosEfectivos = bloqueosEfectivos;
		this.bloqueosFallidos = bloqueosFallidos;
	}




	@Override
	public int efectividad() {
		// TODO Auto-generated method stub
		return ((ataques+bloqueosEfectivos)-(bloqueosFallidos-erroresCometidos))*100/(ataques+bloqueosEfectivos+bloqueosFallidos+erroresCometidos) + (aces*100)/totalServicios;
	}




	public int getAtaques() {
		return ataques;
	}




	public void setAtaques(int ataques) {
		this.ataques = ataques;
	}




	public int getBloqueosEfectivos() {
		return bloqueosEfectivos;
	}




	public void setBloqueosEfectivos(int bloqueosEfectivos) {
		this.bloqueosEfectivos = bloqueosEfectivos;
	}




	public int getBloqueosFallidos() {
		return bloqueosFallidos;
	}




	public void setBloqueosFallidos(int bloqueosFallidos) {
		this.bloqueosFallidos = bloqueosFallidos;
	}
	
	

}
