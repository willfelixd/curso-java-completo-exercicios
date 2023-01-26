import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int quantidade, valorDeX, valoresIn, valoresOut;

		quantidade = sc.nextInt();
		
		valoresIn = 0;
		valoresOut = 0;

		for(int w = 0; w < quantidade; w++) {
			valorDeX = sc.nextInt();
			if (valorDeX >= 10 && valorDeX <=20) {
				valoresIn++;	
			} else {
				valoresOut++;
			}
		}
		System.out.println(valoresIn + " in");
		System.out.println(valoresOut + " out");
		sc.close();
	}

}
