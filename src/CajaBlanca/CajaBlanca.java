package CajaBlanca;
import java.util.Scanner;

public class CajaBlanca {
	
public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			System.out.print("Introduce un n�mero mayor que 0:  ");
			int num = entrada.nextInt();
			System.out.print(CompruebaNumeroPerfecto(num));
		}
		static String CompruebaNumeroPerfecto(int num) {
			int divisor = 1, sumadivisores = 0;
			String Cadena = "";
			while (divisor <= num / 2) {
				if (num % divisor == 0) {
					sumadivisores += divisor;
				}
				divisor++;
			}
			if (num == sumadivisores) {
				Cadena = "El n�mero " + num + " es un n�mero perfecto";

			} else {
				Cadena = "El n�mero " + num + " no es un n�mero perfecto";
			}
			return Cadena;
		}
	}
	