import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int primeiroValor, segundoValor, soma;
		
		primeiroValor = sc.nextInt();
		segundoValor = sc.nextInt();
		
		soma = primeiroValor + segundoValor;
		
		System.out.println("SOMA = " + soma);
		
		sc.close();
	}

}
