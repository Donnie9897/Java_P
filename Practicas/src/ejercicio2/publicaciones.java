package ejercicio2;

public class publicaciones {
	protected String id;
	protected String Titulo;
	protected String materia;
	protected int cantidad;
	protected boolean estado;
	
	public publicaciones(String id, String titulo, String materia, int cantidad) {
		super();
		this.id = id;
		Titulo = titulo;
		this.materia = materia;
		this.cantidad = cantidad;
		this.estado = true;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public void actualizarEjemplares(boolean razon) {
		
		if(razon) {
			cantidad--;
			if(cantidad <= 0){
				estado = false;
			}
		}

	}
}
	