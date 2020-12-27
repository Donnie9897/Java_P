package Ejercicio;

public class Producto {
	private String codigo;
	private String nombre;
	private String tipo;
	private float precioCompra;
	private float precioVenta;
	private int restantes;
	private int cantReal;
	private int cantInicial;
	
	public Producto(String codigo, String nombre, String tipo, float precioCompra, float precioVenta, int restantes,
			int cantReal, int cantInicial) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.tipo = tipo;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
		this.restantes = restantes;
		this.cantReal = cantReal;
		this.cantInicial = cantInicial;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public float getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(float precioCompra) {
		this.precioCompra = precioCompra;
	}

	public float getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(float precioVenta) {
		this.precioVenta = precioVenta;
	}

	public int getRestantes() {
		return restantes;
	}

	public void setRestantes(int restantes) {
		this.restantes = restantes;
	}

	public int getCantReal() {
		return cantReal;
	}

	public void setCantReal(int cantReal) {
		this.cantReal = cantReal;
	}

	public int getCantInicial() {
		return cantInicial;
	}

	public void setCantInicial(int cantInicial) {
		this.cantInicial = cantInicial;
	}

}
