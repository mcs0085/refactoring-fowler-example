package ubu.gii.dass.refactoring;
/**
 * Tema Refactorizaciones
 * 
 * Ejemplo de aplicaci�n de refactorizaciones. Actualizado para colecciones
 * gen�ricas de java 1.5
 * 
 * @author M. Fowler y <A HREF="mailto:clopezno@ubu.es">Carlos L�pez</A>
 * @version 1.1
 * @see java.io.File
 * 
 */

public class Movie {

	private String _title;
	private int _priceCode;
	MovieType type;

	public Movie(String title, int priceCode) {
		_title = title;
		_priceCode = priceCode;
		switch(priceCode){
		case 0: type= new Regular(priceCode);
		case 1: type= new NewRelease(priceCode);
		case 2: type= new Children(priceCode);
		}
		
	}

	public int getPriceCode() {
		return _priceCode;
	}

	public void setPriceCode(int arg) {
		_priceCode = arg;
	}

	public String getTitle() {
		return _title;
	}
}
