package ejercicio1;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int random = (int) (Math.random() * 500 + 1);
		Boolean correcto = true;
		int intento = 0;
		System.out.println(random);
		while (correcto) {
			int numero = 0;
			try {
				System.out.println("Introduce un numero:");
				numero = teclado.nextInt();
				if (random == numero) {
					System.out.println("Enhorabuena has encertado! Intentos realizados:" +intento);
					correcto = false;
				} else if (random < numero) {
					System.out.println("El numero es menor");
					intento++;

				} else {
					System.out.println("El numero es mayor");
					intento++;

				}

			} catch (Exception InputMismatchException) {
				System.out.println("No has introducido un numero");
				teclado.nextLine();
				intento++;

			}

		}

	}

}
