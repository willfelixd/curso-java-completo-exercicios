import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double valorDeX, valorDeY;

		valorDeX = sc.nextDouble();
		valorDeY = sc.nextDouble();

		if (valorDeX > 0.0 && valorDeY > 0.0) {
			System.out.println("Q1");
		} else if (valorDeX < 0.0 && valorDeY > 0.0) {
			System.out.println("Q2");
		} else if (valorDeX < 0.0 && valorDeY < 0.0) {
			System.out.println("Q3");
		} else if (valorDeX > 0.0 && valorDeY < 0.0) {
			System.out.println("Q4");
		} else if (valorDeX != 0.0 && valorDeY == 0.0) {
			System.out.println("Eixo X");
		} else if (valorDeY != 0.0 && valorDeX == 0.0) {
			System.out.println("Eixo Y");
		} else {
			System.out.println("Origem");
		}

		sc.close();
	}

}
