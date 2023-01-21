import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int valorDeA, valorDeB, valorDeC, valorDeD, diferenca;

		valorDeA = sc.nextInt();
		valorDeB = sc.nextInt();
		valorDeC = sc.nextInt();
		valorDeD = sc.nextInt();
		
		diferenca = valorDeA * valorDeB - valorDeC * valorDeD;
		
		System.out.println("DIFERENCA = " + diferenca);
		
		sc.close();
	}

}
