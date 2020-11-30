/**
 * 
 */
package main;

import java.util.Scanner;

/**
 * 
 * @author TardesT2Saiz Escobedo
 *
 * fecha:
 *
 *@version
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		int numero1, numero2, resultado;
		System.out.println("Introduce numero 1: ");
		numero1 = teclado.nextInt();
		System.out.println(" Introduce numero 2: ");
		numero2 = teclado.nextInt();
		resultado= numero1 + numero2;
		System.out.println("El resultado es: " + resultado);
		
		teclado.close();
		

	}

}
