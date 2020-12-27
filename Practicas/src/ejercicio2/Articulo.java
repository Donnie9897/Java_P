package ejercicio2;

public class Articulo extends publicaciones {
	private String autor;
	private String arbitro;
	
	public Articulo(String id, String titulo, String materia, int cantidad, boolean estado, String autor,
			String arbitro) {
		super(id, titulo, materia, cantidad);
		this.autor = autor;
		this.arbitro = arbitro;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getArbitro() {
		return arbitro;
	}

	public void setArbitro(String arbitro) {
		this.arbitro = arbitro;
	}
	
	
}
