/**
 * 
 */
package logic;

/**
 * @author luisd
 *
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Almacen alma = new Almacen();
		Suministrador S1 = new Suministrador("s-1", "Peter", "England", 20);
		Vino v1 = new Vino("v-1", "Carlos Rosi", "Tinto", 2015, 10, 20, 9, S1, 200, 300);
		Vino v2 = new Vino("v-2", "Brazo de queso", "Rosado", 2018, 10, 20, 9, S1, 100, 500);

		int[] ventas = new int[10];
		
		for (int i = 0; i < 10; i++) {
			ventas[i] = (i+1)*10;
		}
		
		v1.setVentas(ventas);
		alma.insertarSuministrador(S1);
		alma.insertarVino(v1);
		System.out.println(alma.hacerPedido("v-1"));
		System.out.println(alma.cantBotellas("Rosado"));
		System.out.println(alma.estimarGanancias(v1));
		System.out.println("El vino mas rentable es: " + alma.vinoMasRentable());
	}

}
