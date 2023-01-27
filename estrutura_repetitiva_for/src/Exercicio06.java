import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero;

		numero = sc.nextInt();

		for (int w = 1; w <= numero; w++) {
			if (numero % w == 0) {
				System.out.println(w);
			}
		}

		sc.close();
	}

}
