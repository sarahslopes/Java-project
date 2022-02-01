package fundamentos;

import java.util.Scanner;

public class ex003 {
	
	public static void main(String[] args) {
		int a, b, c, d;
		float media;
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Insira quatro números:");
			a = sc1.nextInt();
			b = sc1.nextInt();
			c = sc1.nextInt();
			d = sc1.nextInt();
			
			media = ((a*b) - (c*d));
			System.out.println("Diferença = " + media);

	}
}
