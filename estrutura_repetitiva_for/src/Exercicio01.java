import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int valorDeX;

		valorDeX = sc.nextInt();

		for(int w = 1; w <= valorDeX; w++) {
			if (w % 2 != 0) {
				System.out.println(w);
			}
		}
		sc.close();
	}

}
