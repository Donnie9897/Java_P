package Ejercicio;

public class Almacen {
	private String codigo;
	private String ciudad;
	private String municipio;
	private int capAlmacenaje;
	private float superficie;
	private Producto[] misproductos;
	private int cantProductos;
	
	public Almacen(String codigo, String ciudad, String municipio, int capAlmacenaje, float superficie,
			Producto[] misproductos, int cantProductos) {
		super();
		this.codigo = codigo;
		this.ciudad = ciudad;
		this.municipio = municipio;
		this.capAlmacenaje = capAlmacenaje;
		this.superficie = superficie;
		this.misproductos = misproductos;
		this.cantProductos = cantProductos;
	}


	public String getCodigo() {
		return codigo;
	}




	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}




	public String getCiudad() {
		return ciudad;
	}




	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}




	public String getMunicipio() {
		return municipio;
	}




	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}




	public int getCapAlmacenaje() {
		return capAlmacenaje;
	}




	public void setCapAlmacenaje(int capAlmacenaje) {
		this.capAlmacenaje = capAlmacenaje;
	}




	public float getSuperficie() {
		return superficie;
	}




	public void setSuperficie(float superficie) {
		this.superficie = superficie;
	}




	public Producto[] getMisproductos() {
		return misproductos;
	}




	public void setMisproductos(Producto[] misproductos) {
		this.misproductos = misproductos;
	}




	public int getCantProductos() {
		return cantProductos;
	}




	public void setCantProductos(int cantProductos) {
		this.cantProductos = cantProductos;
	}


	
	public boolean comprobarDisponibilidad() {
		boolean existe = true;
		
		return existe;
	}
	
	public float calcularGanancias() {
		float ganancias = 0;
		
		return ganancias;
		}
	
	
	public float calcularPerdidas() {
		float perdidas = 0;
		
		return perdidas;
	}





}




