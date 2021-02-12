package ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejecutable {

	public static void main(String[] args) {
		try {
			Scanner teclado = new Scanner(System.in);
			System.out.println("############################");
			System.out.println("# Generador de Contraseñas #");
			System.out.println("############################");
			System.out.println("Introduce la longitud del array:");
			int array = teclado.nextInt();
			Password[] passwords = new Password[array];
			Boolean[] fuertes = new Boolean[array];
			System.out.println("Introduce la longitud de la contraseña:");
			int pass = teclado.nextInt();
			for (int i = 0; i < passwords.length; i++) {
				Password c = new Password(pass);
				fuertes[i] = c.esFuerte();
				passwords[i] = c;

			}

			for (int i = 0; i < passwords.length; i++) {
				System.out.print(passwords[i].toString() + " " + fuertes[i] + "\n");
			}
		} catch (InputMismatchException e) {
			System.out.print("Solo acepta numeros!");
		} catch (NegativeArraySizeException e) {
			System.out.print("El array no puede tener numeros negativos");

		}	catch (Exception e) {
			System.out.print(e.getMessage());
		}
	}

}
