package Quesos;

import java.util.ArrayList;

public class Factura {
	private ArrayList<Queso>misQuesos;
	private Cliente miCliente;
	
	public Factura() {
		// TODO Auto-generated constructor stub
	}
	

	public ArrayList<Queso> getMisQuesos() {
		return misQuesos;
	}

	public Cliente getMiCliente() {
		return miCliente;
	}
	
	@SuppressWarnings("null")
	public float calcularPrecioTotal()
	{
		Queso Aux = null;
		float precioTotal;
		
		precioTotal = Aux.precioTotal();
		return precioTotal;
	}

	public float precioTotalFactura() {
		float precioTotal = 0;
		
		for (Queso queso : misQuesos) {
			precioTotal += queso.precioTotal();
			
		}
		
		return precioTotal;
	}
	
}
