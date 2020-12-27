package ejercicio2;

public class libro extends publicaciones {

	private String editorial;
	private String autor;
	
	public libro(String id, String titulo, String materia, int cantidad, boolean estado, String editorial,
			String autor) {
		super(id, titulo, materia, cantidad);
		this.editorial = editorial;
		this.autor = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
}
