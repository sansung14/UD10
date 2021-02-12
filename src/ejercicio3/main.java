package ejercicio3;
import ejercicio3_2.Miexception;
import java.util.Random;

public class main {

	public static void main(String[] args) {
		
		
		try {
			Random r = new Random();
			int valorDado = r.nextInt(999)+1;
			if(valorDado%2==1) {throw new Miexception("impar",valorDado);}
			else if(valorDado%2==0) {throw new Miexception("par",valorDado);}
		}catch(Exception e) {
			System.out.print(e.getMessage());
		}
	}

}
