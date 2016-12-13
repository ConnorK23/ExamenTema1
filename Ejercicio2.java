import java.util.Scanner;
public class Ejercicio2 {
	public static void main(String[]args) {
		System.out.println("Introduce el texto");
		Scanner sc = new Scanner (System.in);
		String textoLeido = sc.nextLine();
		sc.close();
		
		System.out.printf("El texto introducido tiene %s letras %n",textoLeido.length());
		System.out.printf("Texto en minuscula: %s%nTexto en mayuscula: %s",textoLeido.toLowerCase(),textoLeido.toUpperCase());
		
	}
}
