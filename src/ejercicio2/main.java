package ejercicio2;
import ejercicio2_2.*;


public class main {

	public static void main(String[] args) {

		try {
			throw new Excepcion();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
