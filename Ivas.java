/**
* <h1>7.Clase Ivas.</h1>
* <p> El iva es un impuesto aplicable al consumo en la CEE.</p>
* <p> En España hay tres tipos de ivas: superreducido 4%, reducido 10% y general 21%. </p>
* <p>Calcula y muestra el iva aplicado a los siguientes productos:</p>
* <ul>
* <li>Papel higiénico (2,70)</li>
* <li>Pañales (15,95)</li> 
* <li>Maquinilla de afeitar (8,75)</li>
* <li>Colonia (1,45)</li>
* </ul>
* @author Rafael Delgado Peña
* @version 1.0
*/

public class Ivas{
	public static void main(String[] args) {
		double papel = 2.70;//Precio del papel
		double pannales = 15.95;//Precio de los pañales
		double maquinilla = 8.75;//Precio de la maquinilla de afeitar
		double colonia = 1.45;//Precio de la colonia
		System.out.println("\tPapel higienico(2.70) se le aplica el IVA superreducido(4%):"+(papel*1.04));
		System.out.println("\tPa\u00f1ales(15.95) se le aplica el IVA reducido(10%):"+(pannales*1.1));
		System.out.println("\tMaquinilla de afeitar(8.75) se le aplica el IVA general(21%):"+(maquinilla*1.21));
		System.out.println("\tColonia(1.45) se le aplica el IVA general(21%):"+(colonia*1.21));
	}
}