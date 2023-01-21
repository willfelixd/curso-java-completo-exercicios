import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numeroFuncionario, numeroHoras;
		double valorHoras, salario;

		numeroFuncionario = sc.nextInt();
		numeroHoras = sc.nextInt();
		valorHoras = sc.nextDouble();
		
		salario = (int)numeroHoras * valorHoras;
		
		System.out.println("NUMBER = " + numeroFuncionario);
		System.out.println("SALARY = U$ " + String.format("%.2f", salario));
		
		sc.close();
	}

}
