package ejercicio2_2;

public class Excepcion extends Exception{
	
	public String getMessage() {
		String Mensaje="Mensaje mostrado por pantalla\n";
		Mensaje+="Excepcion capturada con mensaje: Esto es un objeto Exception\nPrograma terminado";
		return Mensaje;
	}
}
