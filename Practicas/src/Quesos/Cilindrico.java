package Quesos;

public class Cilindrico extends Queso {
	private static final double Pi = 3.1416;
	protected float radioExterior;
	protected float altura;
	
	
	public Cilindrico(float precioBase, float precioUnitario, float radioExterior, float altura) {
		super(precioBase, precioUnitario);
		this.radioExterior = radioExterior;
		this.altura = altura;
	}


	public float getRadioExterior() {
		return radioExterior;
	}


	public void setRadioExterior(float radioExterior) {
		this.radioExterior = radioExterior;
	}


	public float getAltura() {
		return altura;
	}


	public void setAltura(float altura) {
		this.altura = altura;
	}


	@Override
	public float volumen() {
		// TODO Auto-generated method stub
		return (float) (Pi*Math.pow(radioExterior,2))*altura;
	}
	
	

}
