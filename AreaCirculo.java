/**
* <h1> 4.Clase AreaCirculo. </h1>
* <p>La fórmula del área un círculo es pi*r2, siendo r el radio del círculo. </p>
* <p>Calcula y muestra el área de un círculo cuyo r=7. </p>
* @author Rafael Delgado Peña
* @version 1.0
*/ 

public class AreaCirculo{
	public static void main(String[] args) {
		byte r = 7;//Radio
		double pi = 3.1416;//Pi
		//También se puede hacer así: 
		//double area = Math.PI*Math.pow(r,2);
		double area = pi*r*r;//Formula del area del circulo
		System.out.println("Cuyo radio es "+r+" el area del circulo es: "+area);
	}
}