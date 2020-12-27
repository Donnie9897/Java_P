package cines;

import java.util.ArrayList;
import java.util.Date;

public class cine {
	private String idcine;
	private String nombre;
	private int cantSalas;
	private String provincia;
	private float[] recaudacion;
	private ArrayList<boleta> misBoletas;
	private ArrayList<pelicula> misPeliculas;
	private int[] bolvendidasporDia;
	private Date[] dates = new Date[30];
	
	
	public cine(String idcine, String nombre, int cantSalas, String provincia) {
		super();
		this.idcine = idcine;
		this.nombre = nombre;
		this.cantSalas = cantSalas;
		this.provincia = provincia;
		this.recaudacion = new float[30];
		this.bolvendidasporDia = new int[30];
	}
	
	public cine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getIdcine() {
		return idcine;
	}

	public void setIdcine(String idcine) {
		this.idcine = idcine;
	}

	public int getCantSalas() {
		return cantSalas;
	}

	public void setCantSalas(int cantSalas) {
		this.cantSalas = cantSalas;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public float[] getRecaudacion() {
		return recaudacion;
	}

	public void setRecaudacion(float[] recaudacion) {
		this.recaudacion = recaudacion;
	}

	public ArrayList<boleta> getMisBoletas() {
		return misBoletas;
	}

	public void setMisBoletas(ArrayList<boleta> misBoletas) {
		this.misBoletas = misBoletas;
	}

	public ArrayList<pelicula> getMisPeliculas() {
		return misPeliculas;
	}

	public void setMisPeliculas(ArrayList<pelicula> misPeliculas) {
		this.misPeliculas = misPeliculas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date[] getDates() {
		return dates;
	}

	public void setDates(Date[] dates) {
		this.dates = dates;
	}
	
	public void agregarPelicula(pelicula mipelicula) {
		misPeliculas.add(mipelicula);	
	}
	
	public void agregarBoleta(boleta miBoleta) {
		misBoletas.add(miBoleta);
	}
	
	public float calcularRecaudacion() {
		float recaudado = 0;
		int i;
		
		for(i = 0; i < 30; i++) {
			
			recaudado += recaudacion[i];
		}
		
		return recaudado;
	}
	
	public int boletasVendidas() {
		int boletasVendidas;
		boletasVendidas = misBoletas.size();
		
		return boletasVendidas;
	}
	
	//Aqui se calcula la cantidad de boletas vendidas en cada dia del mes
	public void calcularBolvendidasPordia(){
		int i  = 0;
		
		for(i = 0; i < misBoletas.size();i++) {
			bolvendidasporDia[i] = misBoletas.size();
		}
	}
	
	public int cantBoletasenUndia(int dia) {
		int cantidad = 0;
		cantidad = bolvendidasporDia[dia];
		
		return cantidad;
		
	}
	
	
	public int vecesporpelicula(String nombre) {
		int i = 0;
		int cantidad = 0;
		while(i < misPeliculas.size()) {
			if(getMisPeliculas().get(i).getNombre().equalsIgnoreCase(nombre)) {
				cantidad++;
			}
			
			i++;
		}
		return cantidad;
	}
	
	public Boolean buscarPelicula(String nombre) {
		int i = 0;
		boolean encontrado = false;
		while(!encontrado && i < misPeliculas.size()) {
		if(misPeliculas.get(i).getNombre().equalsIgnoreCase(nombre)) {
			encontrado = true;
		}
		}
		return encontrado;
	}

}
