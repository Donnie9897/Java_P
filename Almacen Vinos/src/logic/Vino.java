package logic;

public class Vino {
	
	private String id;
	private String nombre;
	private String tipo;
	private int cosecha;
	private int dispMinima;
	private int dispMaxima;
	private int dispReal;
	private int[] ventas;
	private Suministrador miSumi;
	private float precioCompra;
	private float precioVenta;
	
	public Vino(String id,String nombre, String tipo, int cosecha, int dispMinima, int dispMaxima, int dispReal,
			Suministrador miSumi, float precioCompra, float precioVenta) {
		super();
		
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.cosecha = cosecha;
		this.dispMinima = dispMinima;
		this.dispMaxima = dispMaxima;
		this.dispReal = dispReal;
		this.miSumi = miSumi;
		this.ventas = new int[10];
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
		generadorCodigo++;
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
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the cosecha
	 */
	public int getCosecha() {
		return cosecha;
	}

	/**
	 * @param cosecha the cosecha to set
	 */
	public void setCosecha(int cosecha) {
		this.cosecha = cosecha;
	}

	/**
	 * @return the dispMinima
	 */
	public int getDispMinima() {
		return dispMinima;
	}

	/**
	 * @param dispMinima the dispMinima to set
	 */
	public void setDispMinima(int dispMinima) {
		this.dispMinima = dispMinima;
	}

	/**
	 * @return the dispMaxima
	 */
	public int getDispMaxima() {
		return dispMaxima;
	}

	/**
	 * @param dispMaxima the dispMaxima to set
	 */
	public void setDispMaxima(int dispMaxima) {
		this.dispMaxima = dispMaxima;
	}

	/**
	 * @return the dispReal
	 */
	public int getDispReal() {
		return dispReal;
	}

	/**
	 * @param dispReal the dispReal to set
	 */
	public void setDispReal(int dispReal) {
		this.dispReal = dispReal;
	}

	/**
	 * @return the ventas
	 */
	public int[] getVentas() {
		return ventas;
	}

	/**
	 * @param ventas the ventas to set
	 */
	public void setVentas(int[] ventas) {
		this.ventas = ventas;
	}

	/**
	 * @return the miSumi
	 */
	public Suministrador getMiSumi() {
		return miSumi;
	}

	/**
	 * @param miSumi the miSumi to set
	 */
	public void setMiSumi(Suministrador miSumi) {
		this.miSumi = miSumi;
	}

	public boolean promedioVentas() {
		boolean promedio = false;
		int suma = 0;
		for(int i = 6; i <= 8; i++) {
			suma += ventas[i];
		}
		if(ventas[9] > suma/3) {
			promedio = true;
		}
		return promedio;
		
	}

	public float getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(float precioVenta) {
		this.precioVenta = precioVenta;
	}

	public float getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(float precioCompra) {
		this.precioCompra = precioCompra;
	}
	
	public float rentabilidad() {
		float suma = 0;
		for (int i = 0; i < ventas.length; i++) {
			suma +=  (ventas[i]*precioCompra-ventas[i]*precioVenta);
			
		}
		return suma;
	}
	
	public float estimarGanancias(Vino misVinos) {
		float ganancias = 0;
		
		ganancias += (misVinos.getPrecioVenta() - misVinos.getPrecioCompra()) * misVinos.getDispReal();
		
		return ganancias;
	}

}




