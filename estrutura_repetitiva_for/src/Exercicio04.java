import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numeros, numerador, denominador;
		double produto;

		numeros = sc.nextInt();

		for (int w = 0; w < numeros; w++) {
			numerador = sc.nextInt();
			denominador = sc.nextInt();

			if (denominador == 0) {
				System.out.println("divisao impossivel");
			} else {
				produto = (double) numerador / (double) denominador;
				System.out.println(String.format("%.1f", produto));
			}
		}

		sc.close();
	}

}
