import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero, fatorial;

		numero = sc.nextInt();

		if (numero == 0) {
			numero++;
			System.out.println(numero);
		} else {
			fatorial = numero;
			for (int w = numero - 1; w > 0; w--) {
				fatorial = fatorial * w;
			}
			System.out.println(fatorial);
		}
		sc.close();
	}

}
