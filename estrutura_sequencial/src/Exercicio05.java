import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigoPeca1, numeroPeca1, codigoPeca2, numeroPeca2;
		double valorPeca1, valorPeca2, valorAPagar;
		
		codigoPeca1 = sc.nextInt();
		numeroPeca1 = sc.nextInt();
		valorPeca1 = sc.nextDouble();
		System.out.println();
		
		codigoPeca2 = sc.nextInt();
		numeroPeca2 = sc.nextInt();
		valorPeca2 = sc.nextDouble();
		
		valorAPagar = (int)numeroPeca1 * valorPeca1 + (int)numeroPeca2 * valorPeca2;
		
		System.out.println("VALOR A PAGAR: " + String.format("%.2f", valorAPagar));
		
		sc.close();
	}

}
