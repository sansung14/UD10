package ejercicio5;

import java.util.Random;
import java.util.Scanner;

public class Password {
	private int longitud;
	private String contraseña;

	public Password() {
		super();
		this.longitud = 8;
		this.contraseña = "";
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContraseña() {
		return contraseña;
	}

	public Password(int longitud) {
		super();
		this.longitud = longitud;
		this.contraseña = generarPassword();
	}

	public String generarPassword() {
		final char[] caracteres = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q',
				'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'e', 'h', 'i', 'j', 'l',
				'k', 'm', 'n', 'o', 'p', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7',
				'8', '9', '0', '@', '#', '!', '$', '€', '&', '[', ']' };
		String temporal = "";
		Random aleatorio = new Random();
		for (int i = 0; i < this.longitud; i++) {
			temporal += caracteres[aleatorio.nextInt(caracteres.length)];
		}
		return temporal;
	}

	public boolean esFuerte(){
        int cuentanumeros=0;
        int cuentaminusculas=0;
        int cuentamayusculas=0;
        for (int i=0;i<contraseña.length();i++){
                if (contraseña.charAt(i)>=97 && contraseña.charAt(i)<=122){
                    cuentaminusculas+=1;
                }else{
                    if (contraseña.charAt(i)>=65 && contraseña.charAt(i)<=90){
                        cuentamayusculas+=1;
                }else{
                    cuentanumeros+=1;
                    }
                }
            }
            if (cuentanumeros>=5 && cuentaminusculas>=1 && cuentamayusculas>=2){
            return true;
        }else{
            return false;
        }
    }

	@Override
	public String toString() {
		return "Password: " + contraseña;
	}

}
