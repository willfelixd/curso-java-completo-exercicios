import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int coordenadaX, coordenadaY;

		coordenadaX = sc.nextInt();
		coordenadaY = sc.nextInt();

		while (coordenadaX != 0 && coordenadaY != 0) {
			if (coordenadaX > 0 && coordenadaY > 0) {
				System.out.println("primeiro");
			} else if (coordenadaX < 0 && coordenadaY > 0) {
				System.out.println("segundo");
			} else if (coordenadaX < 0 && coordenadaY < 0) {
				System.out.println("terceiro");
			} else if (coordenadaX > 0 && coordenadaY < 0) {
				System.out.println("quarto");
			}
			coordenadaX = sc.nextInt();
			coordenadaY = sc.nextInt();
		}

		sc.close();
	}

}
