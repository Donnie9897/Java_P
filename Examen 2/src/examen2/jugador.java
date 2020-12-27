package examen2;

public abstract class jugador {
	

	protected String nombre;
	protected int erroresCometidos;
	protected int aces;
	protected int totalServicios;
	
	public jugador(String nombre, int erroresCometidos, int aces, int totalServicios) {
		super();
		this.nombre = nombre;
		this.erroresCometidos = erroresCometidos;
		this.aces = aces;
		this.totalServicios = totalServicios;
	}
	
	
	
	public jugador() {
		super();
		// TODO Auto-generated constructor stub
	}



	public abstract int efectividad();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getErroresCometidos() {
		return erroresCometidos;
	}

	public void setErroresCometidos(int erroresCometidos) {
		this.erroresCometidos = erroresCometidos;
	}

	public int getAces() {
		return aces;
	}

	public void setAces(int aces) {
		this.aces = aces;
	}

	public int getTotalServicios() {
		return totalServicios;
	}

	public void setTotalServicios(int totalServicios) {
		this.totalServicios = totalServicios;
	}
	
	
}
