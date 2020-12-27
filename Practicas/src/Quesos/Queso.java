package Quesos;

public abstract class Queso {
	protected float precioBase;
	protected float precioUnitario;
	
	public Queso(float precioBase, float precioUnitario) {
		super();
		this.precioBase = precioBase;
		this.precioUnitario = precioUnitario;
	}
	
	public abstract float volumen();
	
	public float precioTotal() {
		float precioTotal;
		precioTotal = precioBase + precioUnitario*volumen();
	
		return precioTotal;
	}
}
