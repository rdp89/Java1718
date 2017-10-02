/**
* <h1>5.Clase EurosADolares.</h1> 
* <p>Mirando la tabla de cambios, veo que el euro está a 1,1256 dólares americanos. 
* <p>Mi abuela se dispone a hacer un viaje a LA, California (EEUU). ¿Cuántos dólares obtendrá al cambiar 300 Euros?</p>
* @author Rafael Delgado Peña
* @version 1.0
*/

public class EurosADolares{
	public static void main(String[] args) {
		double dolar = 1.17415;//Valor del dolar en euros
		double conversion = 300 * dolar;//Conversion
		System.out.println("Mi abuela obtendra "+conversion+"$ a cambio de sus 300 Euros");
	}
}