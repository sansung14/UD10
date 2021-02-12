package ejercicio4;
import java.util.InputMismatchException;
//import ejercicio4_4.*;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		try {
			Scanner teclado = new Scanner(System.in);
			System.out.println("Introduce el valor de a:");
			int a = teclado.nextInt();
			System.out.println("Introduce el valor de b:");
			int b = teclado.nextInt();
			
			suma(a,b);
			resta(a,b);
			multi(a,b);
			div(a,b);
			potencia(a,b);
			raiz2(a);
			raiz3(a);

			
			
		}catch(InputMismatchException e){
			System.out.print("Solo acepta numeros!");
		}catch(ArithmeticException e) {
			System.out.print("No se puede dividir entre 0");
		};

	}
	
	
	public static int suma(int a,int b) {
		return a+b;
	}
	
	public static int resta(int a,int b) {
		return a-b;
	}
	
	public static int multi(int a,int b) {
		return a*b;
	}
	
	public static int div(int a,int b) {
		return a/b;
	}
	
	public static int potencia(int a,int b) {
		return (int) Math.pow(a, b);
	}
	
	public static int raiz2(int a) {
		return (int) Math.sqrt(a);
	}
	
	public static int raiz3(int a) {
		return (int) Math.cbrt(a);
	}
	

}
