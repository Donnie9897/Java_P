package logic;

public class Almacen {
	
	private Vino[] misVinos;
	private Suministrador[] misSumis;
	private static int cantVinos;
	private static int cantSumis;
	private static int generadorCodigoVino = 1;
	private static int generadorCodigoSupli = 1;

	public Almacen() {
		super();
		
		cantSumis = 0;
		cantVinos = 0;
		misSumis = new Suministrador[50];
		misVinos = new Vino[50];
		
	}

	public Vino getMisVinos() {
		return misVinos;
	}

	public void setMisVinos(Vino misVinos) {
		this.misVinos = misVinos;
	}

	public Suministrador[] getMisSumis() {
		return misSumis;
	}

	public void setMisSumis(Suministrador[] misSumis) {
		this.misSumis = misSumis;
	}

	public static int getCantVinos() {
		return cantVinos;
	}

	public static void setCantVinos(int cantVinos) {
		Almacen.cantVinos = cantVinos;
	}

	public static int getCantSumis() {
		return cantSumis;
	}

	public static void setCantSumis(int cantSumis) {
		Almacen.cantSumis = cantSumis;
	}
	
	public void insertarSuministrador(Suministrador sumi) {
		misSumis[cantSumis] = sumi;
		cantSumis++;
		generadorCodigoSupli++;
	}
	
	public void insertarVino(Vino vino){
		misVinos[cantVinos] = vino;
		cantVinos++;
		generadorCodigoVino++;
		
	}
	
	public boolean hacerPedido(String idVino) {
		boolean hacer = false;
		Vino aux = buscarVino(idVino);
		if(aux != null) {
			if(aux.getMiSumi().getTiempoEntrega() < 30 && aux.getDispReal() < aux.getDispMinima() && aux.promedioVentas()) {
				hacer = true;
			}
		}
		
		
		return hacer;
	}

	public Vino buscarVino(String idVino) {
		// TODO Auto-generated method stub
		Vino aux = null;
		boolean encontrado = false;
		int i = 0;
		while(!encontrado && i < cantVinos) {
			if(misVinos[i].getId().equalsIgnoreCase(idVino)) {
				aux = misVinos[i];
				encontrado = true;
			
			}
			i++;
		}
		return aux;
	}
	
	public Suministrador buscarSuministrador(String idSumi) {
		// TODO Auto-generated method stub
		Suministrador aux = null;
		boolean encontrado = false;
		int i = 0;
		while(!encontrado && i < cantSumis) {
			if(misSumis[i].getId().equalsIgnoreCase(idSumi)) {
				aux = misSumis[i];
				encontrado = true;
			
			}
			i++;
		}
		return aux;
	}
	
	public int cantBotellas(String Tipo) {
		
		int cantidad = 0;
		for(int i = 0; i < cantVinos; i++) {
			if(misVinos[i].getTipo().equalsIgnoreCase(Tipo)) {
			cantidad += misVinos[i].getDispReal();
			}
		}
		
		return cantidad;
	}
	
	/*
	public float estimarGanancias(Vino[] misVinos, int i) {
		float ganancias = 0;
		
		ganancias += (misVinos[i].getPrecioVenta() - misVinos[i].getPrecioCompra()) * misVinos[i].getDispReal();
		
		return ganancias;
	}
	*/
	
	public String vinoMasRentable() {
		String nombre = misVinos[0].getNombre();
		Vino tipovino = misVinos[0];
		float aux = misVinos[0].estimarGanancias(tipovino);
		
		for(int i = 1; i < cantVinos; i++) {
			if(aux < misVinos[i].estimarGanancias(tipovino)) {
				aux = misVinos[i].estimarGanancias(tipovino);
				tipovino = misVinos[i];
				nombre = misVinos[i].getNombre();
			}
		}
		
		return nombre;
	}
	
	public float estimarGanancias(Vino misVinos) {
		float ganancias = 0;
		
		ganancias += (misVinos.getPrecioVenta() - misVinos.getPrecioCompra()) * misVinos.getDispReal();
		
		return ganancias;
	}

	public static int getGeneradorCodigoVino() {
		return generadorCodigoVino;
	}

	

	public static int getGeneradorCodigoSupli() {
		return generadorCodigoSupli;
	}

	public void setMisVinos(Vino[] misVinos) {
		this.misVinos = misVinos;
	
	}
	
	private int indicePorcodigo(String codigo) {
		boolean encontrado = false;
		int i = 0;
		int index = -1;
		while (!encontrado && i< cantSumis) {
			if(misSumis[i].getId().equalsIgnoreCase(codigo)){
				encontrado = true;
				index = i;
				
			}
			i++;
		}
		return index;
	}
	
	public void eliminarSuministrador(String identificador) {
		int indice = -1;
		int i= 0;
		if(indicePorcodigo(identificador)>-1){
			indice = indicePorcodigo(identificador);
			i = indice;
				while(i<cantSumis-1){
				  misSumis[i]=misSumis[i+1];
				  i++;
				}
			cantSumis--;	
		}

	}
	
	

}
