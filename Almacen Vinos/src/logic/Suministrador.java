/**
 * 
 */
package logic;

/**
 * @author luisd
 *
 */
public class Suministrador {
	private String id;
	private String nombre;
	private String pais;
	private int tiempoEntrega;
	
	/**
	 * @param id
	 * @param nombre
	 * @param pais
	 * @param tiempoEntrega
	 */
	
	public Suministrador(String id, String nombre, String pais, int tiempoEntrega) {
		this.id = id;
		this.nombre = nombre;
		this.pais = pais;
		this.tiempoEntrega = tiempoEntrega;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the pais
	 */
	public String getPais() {
		return pais;
	}

	/**
	 * @param pais the pais to set
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}

	/**
	 * @return the tiempoEntrega
	 */
	public int getTiempoEntrega() {
		return tiempoEntrega;
	}

	/**
	 * @param tiempoEntrega the tiempoEntrega to set
	 */
	public void setTiempoEntrega(int tiempoEntrega) {
		this.tiempoEntrega = tiempoEntrega;
	}
	
}
