import java.util.Scanner;

public class PRueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce primer numero");
		n1 = teclado.nextInt();
		System.out.println("Introduce segundo numero");
		n2= teclado.nextInt();
		System.out.println("La suma es: " + n1 + n2);
		teclado.close();
		

	}

}
