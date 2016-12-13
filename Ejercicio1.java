/**@author Jesus Lopez Extremera
 * @version 1.0
 */

import java.util.Scanner;
public class Ejercicio1 {
	public static void main (String[] args) {
		System.out.println("Introduce los numeros");
		Scanner sc = new Scanner (System.in);
		System.out.print("Numero 1: ");
		int numeroLeido1 = sc.nextInt();
		System.out.print("Numero 2: ");
		int numeroLeido2 = sc.nextInt();
		sc.close();

	if(numeroLeido1 < numeroLeido2){
			for(int i = numeroLeido1 ; i <= numeroLeido2 ; i++)
			System.out.printf("%d%n", i);
	}else{
			for(int i = numeroLeido1 ; i >= numeroLeido2 ; i--)
			System.out.printf("%d%n", i);
	}
	double valor = calcularValorMedio(numeroLeido1, numeroLeido2);
	System.out.printf("El valor medio es: %.2f%n", valor);
}
public static double calcularValorMedio(int numeroLeido1, int numeroLeido2){
	double valorMedio;
	valorMedio = 1.0*(numeroLeido1 + numeroLeido2)/2;
	return valorMedio;
	}
}
