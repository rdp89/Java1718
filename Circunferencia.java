/**
* <h1>3. Clase  Circunferencia. </h1>
* <p>La fórmula de la circunferencia de un círculo es 2*pi*r, siendo r el radio del círculo. </p>
* <p>Calcula y muestra la circunferencia de un círculo, siendo r=7.</p>
* @author Rafael Delgado Peña
* @version 1.0
*/

public class Circunferencia{
	public static void main(String[] args) {
		byte r = 7;//Base
		double pi = 3.1416;//Pi
		//También es posible hacerlo así: double circunferencia = 2*Math.PI*r;
		double circunferencia = 2*pi*r;//Formula de la circunferencia
		System.out.println("Siendo el radio de "+r+" la circunferencia es "+circunferencia);
	}
}