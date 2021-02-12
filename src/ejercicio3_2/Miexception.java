package ejercicio3_2;

import ejercicio3.main;

public class Miexception extends Exception {
	private String codigoException;
	private int valor;

	public Miexception(String codigoImpar,int valor) {
		super();
		codigoException = codigoImpar;
		this.valor=valor;
	}

	public String getMessage() {
		String mensaje="Generando numero aleatorio...\n";
		switch(codigoException) {
		case "impar":
			mensaje+="El numero es aleatorio generado es:"+this.valor+"\nEs impar";
			break;
		case "par":
			mensaje+="El numero es aleatorio generado es:"+this.valor+"\nEs par";
			break;
		}
		return mensaje;
	}
}
