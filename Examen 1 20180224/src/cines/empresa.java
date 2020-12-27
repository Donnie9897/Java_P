package cines;

import java.util.ArrayList;
import java.util.Date;

public class empresa {
	private ArrayList<cine> misCines;
	private ArrayList<pelicula> misPeliculas;
	
	public empresa() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public ArrayList<cine> getMisCines() {
		return misCines;
	}

	public void setMisCines(ArrayList<cine> misCines) {
		this.misCines = misCines;
	}

	public ArrayList<pelicula> getMisPeliculas() {
		return misPeliculas;
	}

	public void setMisPeliculas(ArrayList<pelicula> misPeliculas) {
		this.misPeliculas = misPeliculas;
	}

	//Dado el codigo de un cine, en cual dia hubo mayor recaudacion
	public Date diaMayorRecaudacion(String idCine) 
	{
		Date diaMayor = null;
		int i = 0;
		cine auxCine = new cine();
		float aux = 0;
		
		if(buscarCineporId(idCine)) {
			while(i < 30) {
				if(aux < auxCine.getRecaudacion()[i]) {
					diaMayor = auxCine.getDates()[i];
					aux = auxCine.getRecaudacion()[i];
				}
				i++;
			}	
		}
		
		return diaMayor;
	}
	
	public boolean buscarCineporId(String idCine) {
		boolean encontrado = false;
		int i = 0;
		
		while(!encontrado && i < misCines.size()) {
			if(misCines.get(i).getIdcine().equalsIgnoreCase(idCine)){
				encontrado = true;
			}
			i++;
		}
		return encontrado;
	}
	
	//Calcular cuanto ascienden las ventas por el mes
	public float asciendeEnVentas(cine miCine) {
		float asciende = 0;
		
		
		asciende = miCine.calcularRecaudacion();
		
		
		return asciende;
	}
	//Dado un cine, se revisa el genero por el cual se vendieron mas boletas
	public String generofavorito(String idCine){
		String generoFavorito = null;
		int accion = 0;
		int comedia = 0;
		int terror = 0;
		cine auxCine = new cine();
		int i  = 1;
		
		if(buscarCineporId(idCine)) {
			while(i < 30) {
				
				if(auxCine.getMisBoletas().get(i).getPelProyectada().getGenero().equalsIgnoreCase("Accion")){
					accion++;
				}
				else
					if(auxCine.getMisBoletas().get(i).getPelProyectada().getGenero().equalsIgnoreCase("Comedia")) {
						comedia++;
					}
					else
						if(auxCine.getMisBoletas().get(i).getPelProyectada().getGenero().equalsIgnoreCase("Terror")) {
							terror++;
						}
				i++;
			}
		}
		
		
		if(accion > comedia && accion > terror) {
			generoFavorito = "Accion"; 
		}
		else
			if(comedia > accion && comedia > terror) {
				generoFavorito = "Comedia";
				
			}
			else
				if(terror > accion && terror > comedia) {
					generoFavorito =  "Terror";
				}
		return generoFavorito;
	}
	
	
	public cine enCualCineseProyectoMas(String nombre) {
		int i = 0;
		cine auxCine = new cine();
		int cantidaddeVeces = 0;
		
		while(i < misCines.size()) {
			if(cantidaddeVeces < getMisCines().get(i).vecesporpelicula(nombre)) {
				auxCine  = misCines.get(i);
			}

			i++;
		}
	
	
	return auxCine;
	}
}
