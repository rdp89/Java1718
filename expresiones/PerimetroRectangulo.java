/**
* <p>1. Clase PerimetroRectangulo.</p> 
* <p>La fórmula del perímetro de un rectángulo es 2*b + 2*h, siendo b la base y h la altura.</p> 
* <p>Calcula y muestra el perímetro de un rectángulo, siendo b=2 y h=7. </p>
* @author Rafael Delgado Peña
* @version 1.0
*/

public class PerimetroRectangulo{
	public static void main(String[] args){
	byte b = 2;//Base
	byte h = 7;//Altura
	int perimetro = 2*b+2*h;//Formula del perimetro del rectangulo
	
	System.out.println("El per\u00edmetro del rect\u00e1ngulo con base "+b+" y altura "+h+" es: "+perimetro);
	}
}