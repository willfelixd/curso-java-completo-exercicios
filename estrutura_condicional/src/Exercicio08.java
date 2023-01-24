import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario, imposto;

		salario = sc.nextDouble();

		if (salario > 0.00 && salario <= 2000.00) {
			System.out.println("Isento");
		} else if (salario > 2000.01 && salario <= 3000.00) {
			imposto = (3000.00 - salario) * 8.0 / 100.0;
			System.out.println("R$ " + String.format("%.2f", imposto));
		} else if (salario > 3000.01 && salario <= 4500.00) {
			imposto = 1000.00 * 8.0 / 100.0;
			imposto = (salario - 3000.00) * 18.0 / 100.0 + imposto;
			System.out.println("R$ " + String.format("%.2f", imposto));
		} else {
			imposto = 1000.00 * 8.0 / 100.0;
			imposto = 1500.00 * 18.0 / 100.0 + imposto;
			imposto = (salario - 4500.00) * 28.0 / 100.0 + imposto;
			System.out.println("R$ " + String.format("%.2f", imposto));
		}

		sc.close();
	}

}
