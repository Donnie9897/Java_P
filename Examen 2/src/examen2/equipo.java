package examen2;

import java.util.ArrayList;

public class equipo {
	private String nombre;
	private String entrenadorPrincipal;
	private String pais;
	private ArrayList<jugador>misJugadores;

	

	public equipo(String nombre, String entrenadorPrincipal, String pais, ArrayList<jugador> misJugadores) {
		super();
		this.nombre = nombre;
		this.entrenadorPrincipal = entrenadorPrincipal;
		this.pais = pais;
		this.misJugadores = misJugadores;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getEntrenadorPrincipal() {
		return entrenadorPrincipal;
	}



	public void setEntrenadorPrincipal(String entrenadorPrincipal) {
		this.entrenadorPrincipal = entrenadorPrincipal;
	}



	public String getPais() {
		return pais;
	}



	public void setPais(String pais) {
		this.pais = pais;
	}



	public ArrayList<jugador> getMisJugadores() {
		return misJugadores;
	}



	public void setMisJugadores(ArrayList<jugador> misJugadores) {
		this.misJugadores = misJugadores;
	}

	public jugador jugadordeMayorEfectividad() {
		int i = 0;
		jugador auxJugador = null;
		
		while(i < misJugadores.size()) {
			if(misJugadores.get(i).efectividad() > auxJugador.efectividad()) {
				auxJugador = misJugadores.get(i);
				
			}
			i++;
		}
		
		return auxJugador;
	}
	
	public int liberosConMasErrores() {
		int i  = 0;
		libero auxJugador = null;
		int cantLiberos = 0;
		
		while(i < misJugadores.size()) {
			if(misJugadores.get(i) instanceof libero){
				auxJugador = (libero) misJugadores.get(i);
				if(auxJugador.getErroresCometidos() > auxJugador.getRecibos()) {
					cantLiberos++;
				}
			}
			i++;
		}
		
		return cantLiberos;
	}
	
	
	public pasador pasadorconMasFintas() {
		int i = 0;
		pasador auxPasador = null;
		pasador otroPasador = null;
		while(i < misJugadores.size()) {
			if(misJugadores.get(i) instanceof pasador){
				auxPasador = (pasador) misJugadores.get(i);

				otroPasador = (pasador) misJugadores.get(i+1);
				
				if(auxPasador.getFintas() > otroPasador.getFintas()) {
					auxPasador = otroPasador;
				} 
				
			}
			i++;
		}
		
		return auxPasador;
	}
	
	public auxiliar buscarAuxiliarPorNombre(String nombre) {
		int i = 0;
		auxiliar miAuxiliar = null;
		boolean encontrado = false;
		
		while(i < misJugadores.size() && !encontrado) {
			if(misJugadores.get(i) instanceof auxiliar){
				if(misJugadores.get(i).getNombre().equalsIgnoreCase(nombre)) {
					miAuxiliar  = (auxiliar) misJugadores.get(i);
					encontrado = true;
				}
			}
				
			i++;
		}
		return miAuxiliar;
	}
	
	
	public int buscarAuxiliarConMayorBloqueos(String nombre) {
		auxiliar miAuxiliar = buscarAuxiliarPorNombre(nombre);
		return miAuxiliar.getBloqueosEfectivos();
	}
	
	public auxiliar auxiliardeMayorEfectividad() {
		int i = 0;
		auxiliar auxJugador = null;
		
		while(i < misJugadores.size()) {
			if(misJugadores.get(i).efectividad() > auxJugador.efectividad()) {
				auxJugador = (auxiliar) misJugadores.get(i);
				
			}
			i++;
		}
		
		return auxJugador;
	}
}
	
