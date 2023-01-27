import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero, linha, quadrado, cubo;

		numero = sc.nextInt();

		for (int w = 1; w <= numero; w++) {
			linha = w;
			quadrado = w * w;
			cubo = w * w * w;
			System.out.println(linha + " " + quadrado + " " + cubo);
		}

		sc.close();
	}

}
