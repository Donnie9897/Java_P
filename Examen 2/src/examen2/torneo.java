package examen2;

import java.util.ArrayList;

public class torneo {
	private ArrayList<equipo>misEquipos;

	public torneo(ArrayList<equipo> misEquipos) {
		super();
		this.misEquipos = misEquipos;
	}

	public ArrayList<equipo> getMisEquipos() {
		return misEquipos;
	}

	public void setMisEquipos(ArrayList<equipo> misEquipos) {
		this.misEquipos = misEquipos;
	}
	
	
	public jugador jugadorMasValioso() {
		jugador auxJugador = null;
		int i = 0;
		boolean masValioso = false;
		
		while(i < misEquipos.size() && !masValioso) {
			
			if(misEquipos.get(i).jugadordeMayorEfectividad().efectividad() > auxJugador.efectividad()){
				auxJugador = misEquipos.get(i).jugadordeMayorEfectividad();
				masValioso = true;
			}
			
			i++;
		}
	
		return auxJugador;
	}
	
	
	
	public ArrayList<jugador> efectividadSuperior(int valordado){
		int i = 0;
		ArrayList<jugador> auxJugadores = new ArrayList<jugador>();
		while(i < misEquipos.size()) {
			if(misEquipos.get(i).getMisJugadores().get(i).efectividad() > valordado) {
				auxJugadores.add(misEquipos.get(i).getMisJugadores().get(i));
			}
		i++;	
		}
		
		return auxJugadores;
	}
	
	public pasador masFintas() {
		pasador miPasador = null;
		int i  = 0;
		
		while(i < misEquipos.size()) {
			if(misEquipos.get(i).pasadorconMasFintas().getFintas() > misEquipos.get(i+1).pasadorconMasFintas().getFintas()) 
			{
				miPasador = misEquipos.get(i).pasadorconMasFintas();
			}
		}
		
		return miPasador;
	}
	

	public int liberosConMasErroresQueEfectivos() {
		int cantLiberos = 0;
		int i  = 0;
		
		while(i < misEquipos.size()) {
			cantLiberos += misEquipos.get(i).liberosConMasErrores();
			i++;
		}
		
		return cantLiberos;
	}
	
	public auxiliar auxiliarDeMayorEfectividad() {
		auxiliar miAuxiliar = null;
		int i = 0;
	
		while(i < misEquipos.size()) {
			if(misEquipos.get(i).auxiliardeMayorEfectividad() != null) {
				miAuxiliar  = (auxiliar) misEquipos.get(i).getMisJugadores().get(i);
			}
		}
		
		return miAuxiliar;
	}
	

	public int buscarAuxiliarConMayorEfectivos(String nombre) {
		int i  = 0;
		boolean encontrado = false;
		auxiliar miAuxiliar = null;
		while(i< misEquipos.size() && !encontrado) {
			if( misEquipos.get(i).buscarAuxiliarPorNombre(nombre) != null) {
				miAuxiliar = misEquipos.get(i).buscarAuxiliarPorNombre(nombre);
				encontrado = true;
			}
			i++;
		}
		return miAuxiliar.getBloqueosEfectivos();
	}
	
	public  ArrayList<jugador> SinErrores() {
		int i = 0;
		ArrayList<jugador>auxEquipo = new ArrayList<jugador>();
		
		while(i< misEquipos.size()) {
			if(misEquipos.get(i).getMisJugadores().get(i).getErroresCometidos() == 0) {
				auxEquipo.add(misEquipos.get(i).getMisJugadores().get(i));
			}
		}
		
		
		return auxEquipo;
	}
}
