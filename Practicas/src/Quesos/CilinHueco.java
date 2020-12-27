package Quesos;

public class CilinHueco extends Cilindrico {
	private static final float Pi = (float)3.1416;
	private float radioInterior;

	public CilinHueco(float precioBase, float precioUnitario, float radioExterior, float altura, float radioInterior) {
		super(precioBase, precioUnitario, radioExterior, altura);
		this.radioInterior = radioInterior;
	}

	public float getRadioInterior() {
		return radioInterior;
	}

	public void setRadioInterior(float radioInterior) {
		this.radioInterior = radioInterior;
	}
	
	@Override
	public float volumen() {
		// TODO Auto-generated method stub
		return   (float) (Pi*(Math.pow(radioExterior,2)- Math.pow(radioInterior,2))*altura);
	}
	
	
}
