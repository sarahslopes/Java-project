package fundamentos;

import java.util.Scanner;

public class ex002 {
	public static void main(String[] args) {
		
		float raio, pi, area;
		pi = 3.14159F;
		
		Scanner sc1 = new Scanner(System.in);
			System.out.println("Insira o raio do círculo: ");
				raio = sc1.nextFloat();
				
				area = pi* (raio* raio);
					System.out.println("Área = " + area);
		
		
	}
}
