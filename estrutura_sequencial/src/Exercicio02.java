import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio, area;

		raio = sc.nextDouble();
		
		area = 3.14159 * Math.pow(raio, 2.0);
		
		System.out.println("A = " + String.format("%.4f", area));
		
		sc.close();
	}

}
