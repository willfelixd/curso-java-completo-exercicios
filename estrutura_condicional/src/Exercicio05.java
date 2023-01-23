import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigo, quantidade;
		double total;
		double cachorroQuente = 4.00;
		double xSalada = 4.50;
		double xbacon = 5.00;
		double torradaSimples = 2.00;
		double refrigerante = 1.50;

		codigo = sc.nextInt();
		quantidade = sc.nextInt();

		switch (codigo) {
		case 1:
			total = cachorroQuente * (double) quantidade;
			break;
		case 2:
			total = xSalada * (double) quantidade;
			break;
		case 3:
			total = xbacon * (double) quantidade;
			break;
		case 4:
			total = torradaSimples * (double) quantidade;
			break;
		case 5:
			total = refrigerante * (double) quantidade;
			break;
		default:
			total = 0.0;
			break;
		}
		
		if (total > 0.0) {
			System.out.println("Total: R$ " + String.format("%.2f", total));
		} else {
			System.out.println("Codigo invalido");
		}
		sc.close();
	}

}
