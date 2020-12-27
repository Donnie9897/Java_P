package Quesos;

public class Esferico extends Queso {
	private static final float Pi = (float) 3.1416;
	private float radio;
	
	
	
	public Esferico(float precioBase, float precioUnitario, float radio) {
		super(precioBase, precioUnitario);
		this.radio = radio;
	}
	
	
	
	@Override
	public float volumen() {
		// TODO Auto-generated method stub
		
		return (4*(Pi*(float)Math.pow(radio,3)))/4;
	}


}
