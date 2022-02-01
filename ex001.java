package fundamentos;

import java.util.Scanner;

public class ex001 {

	public static void main(String[] args) {
		int n1, n2, soma;
		
		Scanner sc1 = new Scanner(System.in);
			System.out.println("Insira um número:");
				 n1 = sc1.nextInt();
				 n2 = sc1.nextInt();
			
		soma = n1 + n2;
		System.out.println("Soma = " + soma);
	
		
	}
}
