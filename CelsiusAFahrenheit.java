/**
* <h1>6. Clase CelsiusAFahrenheit.</h1> <p>En los EEUU sigue utilizándose los grados Fahrenheit para la medición de la temperatura.</p>
* <p> Calcula cuántos grados Fahrenheit son los puntos de ebullición (100 grados Celsius) y de congelación (0 grados Celsius)</p>
* @author Rafael Delgado Peña
* @version 1.0
*/

public class CelsiusAFahrenheit{
	public static void main(String[] args) {
		double ebullicion = 100*1.8+32;//Conversion a grados Fahrenheit de la temperatura de ebullicion
		double congelacion = 0*1.8+32;//Conversion a grados Fahrenheit de la temperatura de congelacion
		System.out.println("La temperatura de ebullicion(100 grados celsius) convertida a grados Fahrenheit es "+ebullicion
			+" y la de congelacion(0 grados centigrados) es "+congelacion);
	}
}