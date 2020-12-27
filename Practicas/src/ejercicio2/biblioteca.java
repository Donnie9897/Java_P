package ejercicio2;

import java.util.ArrayList;

/*
Crear el codigo de devolverLibro
*/


public class biblioteca {
	
	private ArrayList<Prestamos> misPrestamos;
	private ArrayList<publicaciones> misPublic;
	private ArrayList<Cliente>misClientes;
	
	public biblioteca() {
		super();
		// TODO Auto-generated constructor stub
		this.misPublic = new ArrayList<>();
		this.misClientes = new ArrayList<>();
		this.misPrestamos = new ArrayList<>();
	
	}

	public ArrayList<Prestamos> getMisPrestamos() {
		return misPrestamos;
	}

	public void setMisPrestamos(ArrayList<Prestamos> misPrestamos) {
		this.misPrestamos = misPrestamos;
	}

	public ArrayList<publicaciones> getMisPublic() {
		return misPublic;
	}

	public void setMisPublic(ArrayList<publicaciones> misPublic) {
		this.misPublic = misPublic;
	}

	public ArrayList<Cliente> getMisClientes() {
		return misClientes;
	}

	public void setMisClientes(ArrayList<Cliente> misClientes) {
		this.misClientes = misClientes;
	}
	
	public void insertarPublicacion(publicaciones aux) {
		misPublic.add(aux);
	}
	
	public String encontrarTituloPorId(String Idpublicacion) {
		String titulo = " ";
		boolean encontrado = true;
		int i = 0;
		
		while(!encontrado && i < misPublic.size()) {
			if(misPublic.get(i).getId().equalsIgnoreCase(Idpublicacion)){
				titulo = misPublic.get(i).getTitulo();
				encontrado = true;
			}
			i++;
		}
		
		return titulo;
	}
	
	public int cantDocumentosByMateria(String materia) {
		int cantidad = 0;
		
		for (publicaciones aux : misPublic) {
			if(aux.getMateria().equalsIgnoreCase(materia)) {
				cantidad += aux.getCantidad();
			}
		}
		
		return cantidad;
	}
	
	public boolean buscarIdPublicacion(String idpublicacion) {
		boolean encontrado = false;
		int i = 0;
		
		while(!encontrado && i < misPublic.size()) {
			if(misPublic.get(i).getId().equalsIgnoreCase(idpublicacion)){
				encontrado = true;
			}
			i++;
		}
		return encontrado;
	}
	
	public boolean buscarIdCliente(String idCliente) {
		boolean encontrado = false;
		int i = 0;
		
		while(!encontrado && i < misPublic.size()) {
			if(misClientes.get(i).getId().equalsIgnoreCase(idCliente)){
				encontrado = true;
			}
			i++;
		}
		return encontrado;
	}
	
	public void agregarElPrestamo(Prestamos prestamo) {
		misPrestamos.add(prestamo);
	}

	
	
}
