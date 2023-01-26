import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int quantidade;
		double media, valor1, valor2, valor3;

		quantidade = sc.nextInt();

		media = 0;

		for (int w = 0; w < quantidade; w++) {
			valor1 = sc.nextDouble();
			valor2 = sc.nextDouble();
			valor3 = sc.nextDouble();
			
			media = (valor1 * 2.0 + valor2 * 3.0 + valor3 * 5) / 10.0;
			System.out.println(String.format("%.1f", media));
		}

		sc.close();
	}

}
