package ejercicio2;

public class revista extends publicaciones {
	private String numeroRevista;
	private int anio;
	
	public revista(String id, String titulo, String materia, int cantidad, String numeroRevista,
			int anio) {
		super(id, titulo, materia, cantidad);
		this.numeroRevista = numeroRevista;
		this.anio = anio;
	}
	
}
