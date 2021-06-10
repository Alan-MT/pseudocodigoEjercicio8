import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String args[]) {
		Scanner sca = new Scanner(System.in);
		int num;
		String salir;
		do {
			do {
				num = (int)(Math.random()*100);
			} while (num%5!=0);
			System.out.println("ingrese una letra: ");
			salir = sca.nextLine();
			if (salir.equals("S") || salir.equals("s")) {
				System.out.println("Salir");
			} else {
				System.out.println(num);
			}
		} while (!(salir.equals("S") || salir.equals("s")));
	}


}

